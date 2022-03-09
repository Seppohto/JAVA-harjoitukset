package palautettavat;

import java.util.Scanner;

public class PerheOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Anna is�n nimi: ");
		String nimi = input.nextLine();
		System.out.print("Anna is�n osoite: ");
		String osoite = input.nextLine();
		Henkilo isa = new Henkilo(nimi,osoite);
		System.out.print("Anna �idin nimi: ");
		nimi = input.nextLine();
		System.out.print("Anna �idin osoite: ");
		osoite = input.nextLine();
		Henkilo aiti = new Henkilo(nimi,osoite);
		System.out.print("Anna lapsen nimi: ");
		nimi = input.nextLine();
		System.out.print("Anna lapsen osoite: ");
		osoite = input.nextLine();
		Henkilo lapsi = new Henkilo(nimi,osoite,aiti,isa);		
		
		System.out.println("Lapsen is� on "+lapsi.getIsa().getNimi()+" ja �iti on "+
		lapsi.getAiti().getNimi());
		
		if (lapsi.getOsoite().equals(lapsi.getAiti().getOsoite())&&
				lapsi.getOsoite().equals(lapsi.getIsa().getOsoite())) {
			System.out.println("Perhe asuu samassa osoitteessa");
		} else if (lapsi.getOsoite().equals(lapsi.getAiti().getOsoite())){
			System.out.println("Lapsi ja �iti asuvat samassa osoitteessa");
		} else if (lapsi.getOsoite().equals(lapsi.getIsa().getOsoite())) {

			System.out.println("Lapsi ja is� asuvat samassa osoitteessa");
		} else {
			System.out.println("Kaikki asuvat eri osoitteissa.");
		}
		input.close();
	}

}
