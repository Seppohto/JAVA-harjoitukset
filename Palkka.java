package palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna palkka: ");
		int palkka = input.nextInt();
		System.out.print("Anna veroprosentti: ");
		int veroprosentti = input.nextInt();
		System.out.print("Anna ik�: ");
		int ika = input.nextInt();
		double tyelpros = 0.0865;
		if (ika < 53) {
			tyelpros = 0.0715;
		} else {

		}
		double veromaara = (double) palkka*veroprosentti/100.0;
		double tyovak = (double) palkka*0.0125;
		double tyel = (double) palkka*tyelpros;
		double kateen = (double) palkka-veromaara-tyovak-tyel;
		DecimalFormat des = new DecimalFormat("0.00");

		System.out.println("Bruttopalkka " + palkka
				+ "\nVeron osuus " + des.format(veromaara)
				+ "\nTy�el�kevakuutusmaksun osuus " +des.format(tyel)
				+ "\nTy�tt�myysvakuutuksen osuus "+des.format(tyovak)
				+ "\nK�teen j�� "+des.format(kateen));
		input.close();
	}

}
