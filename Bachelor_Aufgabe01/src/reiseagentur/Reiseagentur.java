package reiseagentur;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Reiseagentur {
	private String name;
	private String ustIdNr;
	private Adresse adresse; 
	private List<Kunde> kundenList;
	
	public Reiseagentur(String name, String ustIdNr, Adresse adresse) {
		this.name = name;
		this.ustIdNr = ustIdNr;
		this.adresse = adresse;
		this.kundenList = new ArrayList<Kunde>();
	}

	public List<Kunde> getKundenList() {
		return kundenList;
	}
	// co the tao instance list oday hoac o Contructor
	public void setKundenList(List<Kunde> kundenList) {
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

	@Override
	public String toString() {
		return "Reiseagentur [name=" + name + ", ustIdNr=" + ustIdNr + ", adresse=" + adresse.toString() + ", kundenList="
				+ kundenList + "]";
	}

	

	

	
	
}
