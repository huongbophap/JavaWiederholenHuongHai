package reiseagentur;

public class Adresse {
	//Straße, Hausnummer, Postleitzahl und einem Ort.
	private String strasse;
	private String hausnummer;
	private String plz;
	private String ort;
	
	public Adresse(String strasse, String hausnummer, String plz, String ort) {
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
		this.ort = ort;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		hausnummer = hausnummer;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public void adresseAnzeigen() {
		System.out.print(strasse + " " + hausnummer + ", " + plz + ", " + ort);
	}

}
