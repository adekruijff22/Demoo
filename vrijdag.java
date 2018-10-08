import java.util.Scanner;
public class vrijdag {
	    static Scanner invoer = new Scanner(System.in);
	    static int scoreSom;
	    static int scoreVerschil;
	    static int scoreSomTotaal;
	    static int scoreVerschilTotaal;
	    static int aantalVragenSom;
	    static int aantalVragenVerschil;

	    public static void erbijSommen() {

	        System.out.println("Je hebt gekozen voor erbijsommen. Veel succes!!");
	        System.out.println();
	        for (int i = 0; i < 10; i++) {
	            int A = (int) (Math.random() * 9) + 1;
	            int B = (int) (Math.random() * 9) + 1;
	            int som = A + B;

	            System.out.println(A + " + " + B + " =");
	            int antwoord = invoer.nextInt();
	            if (antwoord == som) {
	                System.out.println("Dat is het goede antwoord!!!");
	                System.out.println();
	                scoreSom++;
	            } else {
	                System.out.println("Jammer, dat is niet goed. Het goede antwoord is: " + som);
	                System.out.println();
	            }
	        }
	        System.out.println("Je hebt " + scoreSom + " van de 10 vragen goed.");
	        if (scoreSom <= 5) {
	            System.out.println("Aii, dat ging nog niet zo goed. Nog even dooroefenen.");
	        } else if (scoreSom < 8) {
	            System.out.println("Je doet het al aardig goed. Nog even dooroefenen.");
	        } else if (scoreSom < 10) {
	            System.out.println("Je hebt het goed gedaan, ga zo door!");
	        } else {
	            System.out.println("Waaaauuuwww!! Je hebt het heel goed gedaan, ga zo door!");
	        }
	        System.out.println();
	        scoreSomTotaal += scoreSom;
	        aantalVragenSom += 10;
	        scoreSom = 0;

	    }

	    public static void erafSommen() {

	        System.out.println("Je hebt gekozen voor erafsommen. Veel succes!!");
	        System.out.println();
	        for (int i = 0; i < 10; i++) {
	            int C = (int) (Math.random() * 9) + 1;
	            int D = (int) (Math.random() * 9) + 1;
	            int verschil;

	            if (C > D) {
	                verschil = C - D;
	                System.out.println(C + " - " + D + " =");
	            } else {
	                verschil = D - C;
	                System.out.println(D + " - " + C + " =");
	            }

	            int antwoord = invoer.nextInt();
	            if (antwoord == verschil) {
	                System.out.println("Dat is het goede antwoord!!!");
	                System.out.println();
	                scoreVerschil++;
	            } else {
	                System.out.println("Jammer, dat is niet goed. Het goede antwoord is: " + verschil);
	                System.out.println();
	            }
	        }
	        System.out.println("Je hebt " + scoreVerschil + " van de 10 vragen goed.");
	        if (scoreVerschil <= 5) {
	            System.out.println("Aii, dat ging nog niet zo goed. Nog even dooroefenen.");
	        } else if (scoreVerschil < 8) {
	            System.out.println("Je doet het al aardig goed. Nog even dooroefenen.");
	        } else if (scoreVerschil < 10) {
	            System.out.println("Je hebt het goed gedaan, ga zo door!");
	        } else {
	            System.out.println("Waaaauuuwww!! Je hebt het heel goed gedaan, ga zo door!");
	        }
	        System.out.println();
	        scoreVerschilTotaal += scoreVerschil;
	        aantalVragenVerschil += 10;
	        scoreVerschil = 0;

	    }

	    public static void main(String[] args) {

	        System.out.println("Welkom bij Spirit's rekenhulp. Wat is je naam?");
	        String naam = invoer.nextLine();
	        System.out.println("Hallo " + naam + ", leuk dat je meedoet!");
	        System.out.println();
	        System.out.println("Wat wil je gaan doen?");
	        int keuze = 0;
	        while (keuze != 3) {
	            System.out.println("Kies 1 voor erbijsommen");
	            System.out.println("Kies 2 voor erafsommen");
	            System.out.println("Kies 3 om te stoppen");
	            keuze = invoer.nextInt();

	            switch (keuze) {
	            case 1:
	                erbijSommen();
	                break;
	            case 2:
	                erafSommen();
	                break;
	            case 3:
	                System.out.println("Leuk dat je hebt meegedaan.");
	                if (aantalVragenSom>0) {
	                    System.out.println("Je totaalscore van de erbijsommen is: " + scoreSomTotaal + " van de "
	                        + aantalVragenSom + " goed.");
	                }
	                if (aantalVragenVerschil > 0) {
	                System.out.println("Je totaalscore van de erafsommen is: " + scoreVerschilTotaal + " van de "
	                        + aantalVragenVerschil + " goed.");
	                }
	                System.out.println();
	                System.out.println("Tot de volgende keer!");
	                break;
	            default: {
	                System.out.println("Oeps ik weet niet wat je bedoelt. Kies opnieuw. ");
	            }
	            }
	        }

	    }

	}
