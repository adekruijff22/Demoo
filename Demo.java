import java.util.Scanner;

public class Demo {


	public static void main(String[] args) {	
		System.out.println("Ik ga op vakantie en neem mee: ");
		Scanner reader = new Scanner(System.in);
		String a = reader.nextLine();
		System.out.println("Ik ga op vakantie en neem mee: ");
		String b = reader.nextLine();
		 
		int lengte = a.length();
		
	 if (a.charAt(lengte-1) == b.charAt(0)){
			System.out.println("Invoer geaccepteerd");
		} else {
			System.out.println("Invoer niet geaccepteerd");
		} 
		
		System.out.println("Gezegd is "+ a + ", " + b);
		System.out.println("Voer het volgende item in:");
		String c = reader.nextLine();
		
		if (b.charAt(lengte-1) == c.charAt(0)){
			System.out.println("Invoer geaccepteerd");
		} else {
			System.out.println("Invoer niet geaccepteerd");
		} 
		
	}	
}
		
	
