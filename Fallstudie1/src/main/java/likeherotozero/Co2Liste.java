package likeherotozero;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class Co2Liste implements Serializable {
	private static Co2Liste instance = new Co2Liste();
	private List<Co2Emission> liste = new ArrayList<Co2Emission>();
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

	public Co2Liste() {
		try {
			liste.add(new Co2Emission("China", dateFormat.parse("07.03.2025"), 11256));
			liste.add(new Co2Emission("USA", dateFormat.parse("07.03.2025"), 5275));
			liste.add(new Co2Emission("Indien", dateFormat.parse("07.03.2025"), 2622));
			liste.add(new Co2Emission("Russland", dateFormat.parse("07.03.2025"), 1748));
			liste.add(new Co2Emission("Japan", dateFormat.parse("07.03.2025"), 1199));
			liste.add(new Co2Emission("Deutschland", dateFormat.parse("07.03.2025"), 753));
			liste.add(new Co2Emission("Iran", dateFormat.parse("07.03.2025"), 728));
			liste.add(new Co2Emission("Südkorea", dateFormat.parse("07.03.2025"), 695));
			liste.add(new Co2Emission("Saudi-Arabien", dateFormat.parse("07.03.2025"), 625));
			liste.add(new Co2Emission("Kanada", dateFormat.parse("07.03.2025"), 594));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static Co2Liste getInstance() {
		return instance;
	}

	public List<Co2Emission> getListe() {
		return liste;
	}
}
