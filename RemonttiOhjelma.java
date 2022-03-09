package palautettavat;

import java.util.Scanner;

public class RemonttiOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Remontti remontti = new Remontti();

		System.out.print("Anna vuosi: ");
		int vuosi = input.nextInt();
		boolean isyearfuture = remontti.setVuosi(vuosi);
		
		if(isyearfuture==true) {
			System.out.print("Anna kuvaus: ");
			input.nextLine();
			String kuvaus = input.nextLine();
			remontti.setRkuvaus(kuvaus);
			System.out.println("Vuonna "+remontti.getVuosi()+" tehtiin remontti "+
			remontti.getRkuvaus());
		} else {
			System.out.println("Vuosi ei voi olla tulevaisuudessa");
		}
		
		input.close();
	}

}