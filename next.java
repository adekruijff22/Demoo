
public class next {

	public static void main(String[] args) {
		String org = "Deze regel heeft best wel veel eees.";
	       
		System.out.println(org);
		// System.out.println(org.length());
		// System.out.println(org.charAt(5));
		char a = org.charAt(0);

		if (a == 'e') {
			System.out.println("is e");		
		} else {
			System.out.println("is geen e");
		}

		System.out.println(org.charAt(org.length()-1));

		for (int q = 0; q < org.length(); q++ ) {
			if (org.charAt(q) == 'i'){
				System.out.print("*");
			} else {
				System.out.print(org.charAt(q));
				
				// alle e's vinden in string
				// vervolgens alle e's bij elkaar optellen
				// som printen resultaat.
			}
		}
	}
}