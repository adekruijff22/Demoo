public class demoo {
	public static void main(String[] args) {
		Chauffeur chauffeur1 = new Chauffeur();
		chauffeur1.naam = "Johan";
		chauffeur1.snelheid = 80;
		
		Chauffeur chauffeur2 = new Chauffeur();
		chauffeur2.naam = "Kevin";
		chauffeur2.snelheid = 120;
		
		
		controleren(chauffeur1);
		controleren(chauffeur2);

		
	}
	static void controleren(Chauffeur Koerier) {
		if(Koerier.snelheid < 100) {
			System.out.println(Koerier.naam + " krijgt geen bekeuring.");
		}else {
			System.out.println(Koerier.naam + " gaat op de bon.");
		}
	}
}
class Chauffeur{
	String naam;
	int snelheid;

}