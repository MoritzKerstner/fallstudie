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
			liste.add(new Co2Emission("USA", dateFormat.parse("06.03.2025"), 5275));
			liste.add(new Co2Emission("Indien", dateFormat.parse("05.03.2025"), 2622));
			liste.add(new Co2Emission("Russland", dateFormat.parse("04.03.2025"), 1748));
			liste.add(new Co2Emission("Japan", dateFormat.parse("03.03.2025"), 1199));
			liste.add(new Co2Emission("Deutschland", dateFormat.parse("02.03.2025"), 753));
			liste.add(new Co2Emission("Iran", dateFormat.parse("01.03.2025"), 728));
			liste.add(new Co2Emission("Südkorea", dateFormat.parse("28.02.2025"), 695));
			liste.add(new Co2Emission("Saudi-Arabien", dateFormat.parse("27.02.2025"), 625));
			liste.add(new Co2Emission("Kanada", dateFormat.parse("26.02.2025"), 594));
			liste.add(new Co2Emission("Brasilien", dateFormat.parse("25.02.2025"), 480));
			liste.add(new Co2Emission("Mexiko", dateFormat.parse("24.02.2025"), 375));
			liste.add(new Co2Emission("Indonesien", dateFormat.parse("23.02.2025"), 680));
			liste.add(new Co2Emission("Südafrika", dateFormat.parse("22.02.2025"), 310));
			liste.add(new Co2Emission("Argentinien", dateFormat.parse("21.02.2025"), 265));
			liste.add(new Co2Emission("Frankreich", dateFormat.parse("20.02.2025"), 410));
			liste.add(new Co2Emission("Großbritannien", dateFormat.parse("19.02.2025"), 375));
			liste.add(new Co2Emission("Italien", dateFormat.parse("18.02.2025"), 320));
			liste.add(new Co2Emission("Spanien", dateFormat.parse("17.02.2025"), 270));
			liste.add(new Co2Emission("Türkei", dateFormat.parse("16.02.2025"), 520));
			liste.add(new Co2Emission("Australien", dateFormat.parse("15.02.2025"), 490));
			liste.add(new Co2Emission("Ukraine", dateFormat.parse("14.02.2025"), 210));
			liste.add(new Co2Emission("Polen", dateFormat.parse("13.02.2025"), 165));
			liste.add(new Co2Emission("Niederlande", dateFormat.parse("12.02.2025"), 120));
			liste.add(new Co2Emission("Belgien", dateFormat.parse("11.02.2025"), 95));
			liste.add(new Co2Emission("Schweiz", dateFormat.parse("10.02.2025"), 80));
			liste.add(new Co2Emission("Schweden", dateFormat.parse("09.02.2025"), 55));
			liste.add(new Co2Emission("Norwegen", dateFormat.parse("08.02.2025"), 30));
			liste.add(new Co2Emission("Dänemark", dateFormat.parse("07.02.2025"), 20));
			liste.add(new Co2Emission("Finnland", dateFormat.parse("06.02.2025"), 15));
			liste.add(new Co2Emission("Österreich", dateFormat.parse("05.02.2025"), 75));
			liste.add(new Co2Emission("Tschechien", dateFormat.parse("04.02.2025"), 170));
			liste.add(new Co2Emission("Ungarn", dateFormat.parse("03.02.2025"), 90));
			liste.add(new Co2Emission("Rumänien", dateFormat.parse("02.02.2025"), 130));
			liste.add(new Co2Emission("Griechenland", dateFormat.parse("01.02.2025"), 120));
			liste.add(new Co2Emission("Portugal", dateFormat.parse("31.01.2025"), 100));
			liste.add(new Co2Emission("Neuseeland", dateFormat.parse("30.01.2025"), 85));
			liste.add(new Co2Emission("Irland", dateFormat.parse("29.01.2025"), 65));
			liste.add(new Co2Emission("Singapur", dateFormat.parse("28.01.2025"), 55));
			liste.add(new Co2Emission("Thailand", dateFormat.parse("27.01.2025"), 50));
			liste.add(new Co2Emission("Vietnam", dateFormat.parse("26.01.2025"), 40));
			liste.add(new Co2Emission("Philippinen", dateFormat.parse("25.01.2025"), 35));
			liste.add(new Co2Emission("Malaysia", dateFormat.parse("24.01.2025"), 25));
			liste.add(new Co2Emission("Chile", dateFormat.parse("23.01.2025"), 20));
			liste.add(new Co2Emission("Kolumbien", dateFormat.parse("22.01.2025"), 15));
			liste.add(new Co2Emission("Peru", dateFormat.parse("21.01.2025"), 10));
			liste.add(new Co2Emission("Ägypten", dateFormat.parse("20.01.2025"), 550));
			liste.add(new Co2Emission("Nigeria", dateFormat.parse("19.01.2025"), 460));
			liste.add(new Co2Emission("Pakistan", dateFormat.parse("18.01.2025"), 375));

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
