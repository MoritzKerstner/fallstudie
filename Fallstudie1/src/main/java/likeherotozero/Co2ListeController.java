package likeherotozero;
import java.io.Serializable;
import java.util.List;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.persistence.*;

@Named("co2controller")
@ViewScoped
public class Co2ListeController implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    @Inject 
    private Co2Liste co2liste;
    
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
}