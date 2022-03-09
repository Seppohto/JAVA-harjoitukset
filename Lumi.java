package palautettavat;

import java.util.Scanner;

public class Lumi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna nimi: ");
		String nimi = input.next();
		int lkm = 0;
		int lumeja = 0;
		while (nimi.equals("LOPPU") == false) {
		     lkm++;   
		     if (nimi.equalsIgnoreCase("lumi") == true) {
		    	 lumeja++;
		     }
		    System.out.print("Anna nimi: ");
			nimi = input.next();
		}
		System.out.println("Nimiä oli "+lkm+" kappaletta."
				+ "\nNimi Lumi esiintyi "+lumeja+" kertaa.");
		
		input.close();		
	}

}
