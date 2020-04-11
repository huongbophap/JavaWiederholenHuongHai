package reiseagentur;

public class Bezahlmethode {
	private String bezeichnung;
	private String kurzeBezeichnung;

	

	public Bezahlmethode(String bezeichnung, String kurzeBezeichnung) {
		super();
		this.bezeichnung = bezeichnung;
		this.kurzeBezeichnung = kurzeBezeichnung;
	}
	

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getKurzeBezeichnung() {
		return kurzeBezeichnung;
	}

	public void setKurzeBezeichnung(String kurzeBezeichnung) {
		this.kurzeBezeichnung = kurzeBezeichnung;
	}

	@Override
	public String toString() {
		return "Bezahlmethode [bezeichnung=" + bezeichnung + ", kurzeBezeichnung=" + kurzeBezeichnung + "]";
	}


}
