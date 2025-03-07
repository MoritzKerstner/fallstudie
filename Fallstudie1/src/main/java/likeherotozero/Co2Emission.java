package likeherotozero;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Co2Emission {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;

	private String land;

	Date datum;

	private double co2Wert;

	public Co2Emission() {
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public double getCo2Wert() {
		return co2Wert;
	}

	public void setCo2Wert(double co2Wert) {
		this.co2Wert = co2Wert;
	}

	public Co2Emission(String land, Date datum, double co2Wert) {
		super();
		this.land = land;
		this.datum = datum;
		this.co2Wert = co2Wert;
	}
	



}
