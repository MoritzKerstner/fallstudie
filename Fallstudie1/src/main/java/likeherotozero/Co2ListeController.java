package likeherotozero;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.persistence.*;

@Named("co2controller")
@ViewScoped
public class Co2ListeController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private Co2Liste co2liste;

	private String neuesLand;
	private Date neuesDatum;
	private double neuerWert;

	private List<Co2Emission> emissionList;

	// Die richtige Getter-Methode für EmissionList
	public List<Co2Emission> getEmissionList() {
		if (emissionList == null) {
			emissionList = co2liste.getListe();
		}
		return emissionList;
	}

	public String startEdit() {
		return "login";
	}

	public String stopEdit() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emissionPersistenceUnit");
		EntityManager em = emf.createEntityManager();

		try {
			EntityTransaction t = em.getTransaction();
			t.begin();

			for (Co2Emission a : getEmissionList()) {
				System.out.println("Speichere: " + a.getLand() + ", Wert: " + a.getCo2Wert());
				em.merge(a);
			}

			t.commit();
			System.out.println("Speichern abgeschlossen");
		} catch (Exception e) {
			System.err.println("Fehler beim Speichern: " + e.getMessage());
			e.printStackTrace();
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			em.close();
		}

		return "index";
	}

	public void addLand() {
		Co2Emission emission = new Co2Emission(neuesLand, neuesDatum, neuerWert);
		co2liste.getListe().add(emission);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emissionPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		em.persist(emission);
		t.commit();
	}

	public String getNeuesLand() {
		return neuesLand;
	}

	public void setNeuesLand(String neuesLand) {
		this.neuesLand = neuesLand;
	}

	public Date getNeuesDatum() {
		return neuesDatum;
	}

	public void setNeuesDatum(Date neuesDatum) {
		this.neuesDatum = neuesDatum;
	}

	public double getNeuerWert() {
		return neuerWert;
	}

	public void setNeuerWert(double neuerWert) {
		this.neuerWert = neuerWert;
	}

	public void deleteLand(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("todoAppPersistenceUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();

		try {
			t.begin();
			Co2Emission emission = em.find(Co2Emission.class, id);
			if (emission != null) {
				co2liste.getListe().remove(emission); // Lösche aus der lokalen Liste
				em.remove(emission); // Lösche aus der Datenbank
				System.out.println("Gelöscht: " + emission.getLand());
			}
			t.commit();
		} catch (Exception e) {
			if (t.isActive()) {
				t.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
	}

}
