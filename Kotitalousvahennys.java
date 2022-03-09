package Palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		double tyokorvaus;
		double yhteensa=0;
		do {
			System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
			tyokorvaus = input.nextDouble();
			yhteensa = yhteensa + tyokorvaus;
		} while (tyokorvaus != 0);
		double kotitalousvah = yhteensa * 40 / 100.0 - 100 ;
		if ( kotitalousvah < 0) {
			kotitalousvah = 0;
		}else if (kotitalousvah>2250) {
			kotitalousvah = 2250;
		}
		System.out.println("Kotitalousvähennyksen määrä on "+des.format(kotitalousvah)+" euroa");
		input.close();
	}

}
