package palautettavat;

import java.util.Scanner;

public class OsallistujaOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Osallistuja osallistuja = new Osallistuja();
		
		System.out.print("Anna osallistujan nimi: ");
		osallistuja.setNimi(input.nextLine());
		System.out.print("Anna kansallisuus: ");
		osallistuja.setKansallisuus(input.nextLine());
		System.out.print("Anna syntym�vuosi: ");
		int syntymavuosi = input.nextInt();
		osallistuja.setSyntymavuosi(syntymavuosi);
		
		System.out.println("Nimi: "+osallistuja.getNimi());
		System.out.println("Kansallisuus: "+osallistuja.getKansallisuus());
		System.out.println("Syntym�vuosi: "+osallistuja.getSyntymavuosi());
		
		input.close();
	}

}
