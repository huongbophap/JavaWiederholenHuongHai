package reiseagentur;

import java.util.ArrayList;
import java.util.List;

public class Kunde {
	private int kundennummer = 0;
//	private String kundenNr;
	private String anrede;
	private String vorname;
	private String nachname;
	private String geburtsdatum;
	private String telefonNr;
	private String emailAdresse;
	private List<Adresse> adresseList;
	private List<Bezahlmethode> bezahlmethode;
	
	private static int i = 0;
//	private static int anzahlKunde = 0;
	
//	public Kunde(String anrede, String vorname, String nachname, String geburtsdatum,
//			Adresse adresse, String telefonNr) {
//		anzahlKunde = anzahlKunde + 100;
//		this.kundennummer = ++kundennummer;
//		this.kundenNr = "S" + ++anzahlKunde2 * 100;
//		this.anrede = anrede;
//		this.vorname = vorname;	
//		this.nachname = nachname;
//		this.geburtsdatum = geburtsdatum;
//		this.adresse = adresse;
//		this.telefonNr = telefonNr;
//	}
	
	//Tai sao khi dung private static int kundennummer = 0 thi tat ca deu bang 3 ????
	
	public Kunde(String anrede, String vorname, String nachname, String geburtsdatum, String telefonNr,
			String emailAdresse) {
		this.kundennummer = ++i;
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsdatum = geburtsdatum;
		this.telefonNr = telefonNr;
		this.emailAdresse = emailAdresse;
		this.adresseList = new ArrayList<Adresse>();
		this.bezahlmethode = new ArrayList<Bezahlmethode>();
	}

	

	public int getKundennummer() {
		return kundennummer;
	}


	public void setKundennummer(int kundennummer) {
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


	public String getTelefonNr() {
		return telefonNr;
	}


	public void setTelefonNr(String telefonNr) {
		this.telefonNr = telefonNr;
	}


	public String getEmailAdresse() {
		return emailAdresse;
	}


	public void setEmailAdresse(String emailAdresse) {
		this.emailAdresse = emailAdresse;
	}


	public List<Adresse> getAdresseList() {
		return adresseList;
	}


	public void setAdresseList(List<Adresse> adresseList) {
		this.adresseList = adresseList;
	}
	
	public List<Bezahlmethode> getBezahlmethode() {
		return bezahlmethode;
	}


	public void setBezahlmethode(List<Bezahlmethode> bezahlmethode) {
		this.bezahlmethode = bezahlmethode;
	}



	@Override
	public String toString() {
		return "Kunde [kundennummer=" + kundennummer + ", anrede=" + anrede + ", vorname=" + vorname + ", nachname="
				+ nachname + ", geburtsdatum=" + geburtsdatum + ", telefonNr=" + telefonNr + ", emailAdresse="
				+ emailAdresse + ", adresseList=" + adresseList + ", bezahlmethode=" + bezahlmethode + "]";
	}

 


	
	



	

	
	
	
	
}
