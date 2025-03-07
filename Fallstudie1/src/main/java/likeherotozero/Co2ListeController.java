package likeherotozero;

import java.io.Serializable;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.persistence.*;

@Named("co2controller")
@ViewScoped
public class Co2ListeController implements Serializable
{
	@Inject 
	private Co2Liste co2liste;
	
    public String startEdit() {
        return "login";
    }
    
    public String stopEdit() {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("todoAppPersistenceUnit");
    	
    	EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        t.begin();
        for (Co2Emission a : co2liste.getListe())
          em.merge(a);
        t.commit();
        return "index";
    }
}
