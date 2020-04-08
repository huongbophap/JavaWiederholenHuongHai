package reiseagentur;

import java.util.HashSet;
import java.util.Set;

public class Reiseagentur {
	private String name;
	private String ustIdNr;
	private Adresse adresse; 
	private Set<Kunde> kundenList;
	
	public Reiseagentur(String name, String ustIdNr, Adresse adresse) {
		this.name = name;
		this.ustIdNr = ustIdNr;
		this.adresse = adresse;
		this.kundenList = new HashSet<Kunde>();
	}

	public Set<Kunde> getKundenList() {
		return kundenList;
	}

	public void setKundenList(Set<Kunde> kundenList) {
		this.kundenList = kundenList;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String getUstIdNr() {
		return ustIdNr;
	}

	public void setUstIdNr(String ustIdNr) {
		this.ustIdNr = ustIdNr;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	public void alleKundenAnzeigen() {
		for (Kunde kunde : kundenList) {
			kunde.stammdatenKundeAnzeigen();
			System.out.print(". Adresse: ");
			kunde.getAdresse().adresseAnzeigen();
			System.out.println();
		}
	}
	
	
}
