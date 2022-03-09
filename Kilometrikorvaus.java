package Palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kilometrikorvaus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		int kilometrit = 0;
		int etappi;
		do {
			System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
			etappi = input.nextInt();
			kilometrit = kilometrit + etappi;
		} while (etappi != 0);
		double korvaus = (double)kilometrit * 0.44 ;
		System.out.println("Yhteensä "+kilometrit+" kilometriä"
				+ "\nKorvaus on "+des.format(korvaus)+" euroa");
		input.close();
	}

}
