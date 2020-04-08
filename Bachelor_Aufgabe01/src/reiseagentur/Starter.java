package reiseagentur;

public class Starter {
	
	public static void main(String[] args) {
		Reiseagentur reiseagentur = new Reiseagentur("Magic Holidays Reiseagentur", "DE812524001", new Adresse("Hauptstra�e", "5a", "10559", "Berlin"));
		
		Kunde kunde01 = new Kunde("Frau", "Thu Huong", "Nguyen", "18.08.92", new Adresse("Hauptstra�e", "56A", "12345", "Berlin"), "123456789");
		Kunde kunde02 = new Kunde("Herr", "Christian", "M�ller", "22.04.92", new Adresse("Copistra�e", "13", "10435", "Berlin"), "1245456789");
		Kunde kunde03 = new Kunde("Herr", "Max", "Mann", "11.03.92", new Adresse("Berolinastra�e", "10", "12345", "Berlin"), "013456789");
		
		reiseagentur.getKundenList().add(kunde01);
		reiseagentur.getKundenList().add(kunde02);
		reiseagentur.getKundenList().add(kunde03);
		
		System.out.print("Reiseagentur: " + reiseagentur.getName() + ". Adresse: " );
		reiseagentur.getAdresse().adresseAnzeigen();
		System.out.println();
		reiseagentur.alleKundenAnzeigen();
	}

}
