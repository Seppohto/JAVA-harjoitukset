package palautettavat;

import java.util.Scanner;

public class Rekisterinumerot {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int MAX = 20;
		String [] reknrot =  new String[MAX];
		int lkm = 0;
		String rekkari = "";
		do {				
		System.out.print("Anna rekisterinumero: ");
		rekkari = input.nextLine();
		if (rekkari.equals("-") == false) {
			reknrot[lkm] = rekkari;
			lkm++;
			}
			
		} while (rekkari.equals("-") == false);
		
		for (int i = 0; i < lkm; i++) {
		System.out.print(reknrot[i] + "\n");
				}
		input.close();
	}

}