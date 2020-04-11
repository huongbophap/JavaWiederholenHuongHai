package reiseagentur;

public class Starter {
	
	//für Reiseagenturmitarbeiter
	//Mit der Anwendung lassen sich Kunden und deren Stammdaten und Buchungen verwalten.  
	public static void main(String[] args) {
		
		Reiseagentur ra = new Reiseagentur("Magic Holidays Reiseagentur", "DE812524001", new Adresse("Hauptstraße", "5a", "10559", "Berlin"));
		Adresse adresse11 = new Adresse("ABC Strasse", "35B", "12345", "Berlin");
		Adresse adresse12 = new Adresse("BCD Strasse", "1A", "12345", "Berlin");
		Adresse adresse21 = new Adresse("DEF Strasse", "23", "12345", "Berlin");
		Adresse adresse31 = new Adresse("GIH Strasse", "1", "12345", "Berlin");
		
		Bezahlmethode bezMe11 = new Bezahlmethode("PayPal", "abc@gmail.com");
		Bezahlmethode bezMe12 = new Bezahlmethode("sdfg", "dfgdfg");
		Bezahlmethode bezMe13 = new Bezahlmethode("dfg", "dfgsdfg");
		Bezahlmethode bezMe21 = new Bezahlmethode("fgh", "dsfgsdfg");
		Bezahlmethode bezMe31 = new Bezahlmethode("ertert", "dfgsdfg");
		
		Kunde kunde1 = new Kunde("Herr", "Max Muster", "Mann", "12.02.1984", "123456789", "maxmustermann@gmail.com");
		Kunde kunde2 = new Kunde("Herr", "Max Muster", "Mann", "12.02.1984", "123456789", "maxmustermann@gmail.com");
		Kunde kunde3 = new Kunde("Herr", "Max Muster", "Mann", "12.02.1984", "123456789", "maxmustermann@gmail.com");
		
		kunde1.getAdresseList().add(adresse11);
		kunde1.getAdresseList().add(adresse12);
		kunde2.getAdresseList().add(adresse21);
		kunde3.getAdresseList().add(adresse31);
		
		kunde1.getBezahlmethode().add(bezMe11);
		kunde1.getBezahlmethode().add(bezMe12);
		kunde1.getBezahlmethode().add(bezMe13);
		kunde2.getBezahlmethode().add(bezMe21);
		kunde3.getBezahlmethode().add(bezMe31);
		
		ra.getKundenList().add(kunde1);
		ra.getKundenList().add(kunde2);
		ra.getKundenList().add(kunde3);
		
		
//		Kunde kunde01 = new Kunde("Frau", "Thu Huong", "Nguyen", "18.08.92", new Adresse("Hauptstraße", "56A", "12345", "Berlin"), "123456789");
//		Kunde kunde02 = new Kunde("Herr", "Christian", "Müller", "22.04.92", new Adresse("Copistraße", "13", "10435", "Berlin"), "1245456789");
//		Kunde kunde03 = new Kunde("Herr", "Max", "Mann", "11.03.92", new Adresse("Berolinastraße", "10", "12345", "Berlin"), "013456789");
//		
//		reiseagentur.getKundenList().add(kunde01);
//		reiseagentur.getKundenList().add(kunde02);
//		reiseagentur.getKundenList().add(kunde03);
//		System.out.println(kunde01);
//		System.out.println(kunde02);
		
//		System.out.print("Reiseagentur: " + reiseagentur.getName() + ". Adresse: " );
//		reiseagentur.getAdresse().adresseAnzeigen();
//		System.out.println();
//		reiseagentur.alleKundenAnzeigen();
		
		System.out.println(ra.toString());
		for (Kunde kunde : ra.getKundenList()) {
		    System.out.println(kunde);
		}
	}

}
