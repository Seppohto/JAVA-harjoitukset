package palautettavat;

import java.util.Scanner;

public class RemonttiOhjelmaMetodeilla {
	Remontti remontti;
	Scanner input = new Scanner(System.in);
	
	private void teeRemontti() {
		System.out.print("Anna vuosi: ");
		int vuosi = input.nextInt();
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		String kuvaus = input.nextLine();
		remontti = new Remontti(vuosi,kuvaus);
		System.out.println("Vuonna "+vuosi+" tehtiin remontti "+kuvaus);
	}
	
	private void naytaRemontti() {
		System.out.println(remontti);
	}
	
	private void muutaRemontti() {
		System.out.print("Anna vuosi: ");
		int vuosi = input.nextInt();
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		String kuvaus = input.nextLine();
		remontti = new Remontti(vuosi,kuvaus);
		System.out.println("Vuonna "+vuosi+" tehtiin remontti "+kuvaus);
	}
	
	public static void main(String[] args) {
		RemonttiOhjelmaMetodeilla remontti = new RemonttiOhjelmaMetodeilla();
		Scanner input = new Scanner(System.in);
		boolean jatkuu=true;				
		do {
			System.out.println(
					"\n1. Tee remontti\n2. Näytä remonttitiedot\n3. Muuta remonttia\n0. Lopetus\nAnna valintasi (0-3): ");
			switch (input.nextInt()) {
			case 0: 
				jatkuu=false;
				break;
			case 1:
				remontti.teeRemontti();
				break;
			case 2:
				remontti.naytaRemontti();
				break;
			case 3:
				remontti.muutaRemontti();
				break;
			
			}
		} while (jatkuu);
		
		input.close();
	}

}
