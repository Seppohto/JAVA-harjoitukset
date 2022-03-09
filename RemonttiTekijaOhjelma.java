package palautettavat;

import java.util.Scanner;

public class RemonttiTekijaOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Anna vuosi: ");
		int vuosi = input.nextInt();
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		String kuvaus = input.nextLine();
		Remontti remontti = new Remontti( vuosi , kuvaus );
		System.out.print("Anna tekijän nimi: ");
		String nimi = input.nextLine();
		System.out.print("Anna tekijän osoite: ");
		String osoite = input.nextLine();
		Henkilo om = new Henkilo();
		om.setNimi(nimi);
		om.setOsoite(osoite);
		remontti.setTekija(om);
		
		
		System.out.println("Vuonna "+remontti.getVuosi()+" tehtiin remontti "+remontti.getRkuvaus());
		System.out.println("Remontin teki "+remontti.getTekija().getNimi());
		input.close();
	  }

}
