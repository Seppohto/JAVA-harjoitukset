package palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Peltipoliisi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.print("Anna nopeutesi: ");
		int nopeus = input.nextInt();
		if (nopeus <= 80) {
			System.out.println("Ei sakkoja");
		} else if ( nopeus<100) {
			System.out.println("Liikennevirhemaksu");
		} else {
			System.out.println("P�iv�sakko");
			System.out.print("Anna nettokuukausitulosi: ");
			double nettotulot = input.nextDouble();
			double psakko = (nettotulot-255)/60;
			if (psakko<6) {
				psakko = 6;
			} else {
				
			}
			System.out.println("P�iv�sakon m��r� on "+des.format(psakko)+ " euroa");
		}
		input.close();
	}

}
