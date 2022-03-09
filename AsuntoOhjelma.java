package palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AsuntoOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");

		System.out.print("Anna asunnon tyyppi: ");
		String tyyppi = input.nextLine();		
		System.out.print("Anna osoite: ");
		String osoite = input.nextLine();
		System.out.print("Anna pinta-ala: ");
		double pintaala = input.nextDouble();
		System.out.print("Anna hinta: ");
		double hinta = input.nextDouble();
		
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		String kuvaus = input.nextLine();
		
		Asunto asunto = new Asunto();
		asunto.setTyyppi(tyyppi);
		asunto.setOsoite(osoite);
		asunto.setPintaala(pintaala);
		asunto.setHinta(hinta);
		asunto.setKuvaus(kuvaus);
		
		System.out.println("Tyyppi: "+asunto.getTyyppi());
		System.out.println("Osoite: "+asunto.getOsoite());
		System.out.println("Pinta-ala: "+des.format(asunto.getPintaala()));
		System.out.println("Hinta: "+des.format(asunto.getHinta())+" euroa");
		System.out.println("Kuvaus: "+asunto.getKuvaus());
		input.close();
		

	}

}
