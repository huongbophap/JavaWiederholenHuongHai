package reiseagentur;

public class Kunde {
	private int kundennummer = 0;
	private String anrede;
	private String vorname;
	private String nachname;
	private String geburtsdatum;
	private Adresse adresse;
	private String telefonNr;
	
	private static int anzahlKunde = 0;
	
	public Kunde(String anrede, String vorname, String nachname, String geburtsdatum,
			Adresse adresse, String telefonNr) {
		this.kundennummer = ++anzahlKunde;
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.adresse = adresse;
		this.telefonNr = telefonNr;
	}

	public int getkundennummer() {
		return kundennummer;
	}

	public void setkundennummer(int kundennummer) {
		this.kundennummer = kundennummer;
	}

	public String getAnrede() {
		return anrede;
	}

	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTelefonNr() {
		return telefonNr;
	}

	public void setTelefonNr(String telefonNr) {
		this.telefonNr = telefonNr;
	}
	
	public void stammdatenKundeAnzeigen() {
		System.out.print(anrede + " " + vorname + " " + nachname + ". Geburtsdatum: " + geburtsdatum);
	}

	@Override
	public String toString() {
		return "Kunde [kundennummer=" + kundennummer + ", anrede=" + anrede + ", vorname=" + vorname + ", nachname="
				+ nachname + ", geburtsdatum=" + geburtsdatum + ", adresse=" + adresse + ", telefonNr=" + telefonNr
				+ "]";
	}
	
	
	
	
}
