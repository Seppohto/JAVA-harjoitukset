package palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tuotteet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");

		System.out.print("Anna tuotenumero: ");
		int tuotenro = input.nextInt();
		
		String nimi;
		System.out.print("Anna tuotteen nimi: ");
		input.nextLine(); nimi = input.nextLine();
		nimi = nimi.trim();
		nimi = nimi.toUpperCase();
		
		System.out.print("Anna tuotteen hinta: ");
		double hinta = input.nextDouble();
		
		String kuvaus;
		System.out.print("Anna tuotteen kuvaus: ");
		input.nextLine(); kuvaus = input.nextLine();
		kuvaus = kuvaus.trim();
		
		System.out.println("Numero: "+tuotenro+
				"\nNimi: "+nimi+
				"\nHinta: "+des.format(hinta));
		if (kuvaus.equals("") == false) {
			System.out.println("Kuvaus: "+kuvaus);
		}
		input.close();
		
	}

}
