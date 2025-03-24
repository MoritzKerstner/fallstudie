package likeherotozero;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

@Named
@ApplicationScoped
public class Co2Liste implements Serializable {
	private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("emissionPersistenceUnit");
	private static Co2Liste instance = new Co2Liste();

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

	public Co2Liste() {
	}

	public static Co2Liste getInstance() {
		return instance;
	}

	public List<Co2Emission> getListe() {
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("SELECT a FROM Co2Emission a");
		List<Co2Emission> emission = q.getResultList();		
		return emission;
	}
}
