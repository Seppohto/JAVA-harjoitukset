package Omat1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Valityspalkkioif {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double palkPros = 0.0344;
		double min = 2214;
		System.out.println("Anna asunnon myyntihinta: ");
		double myyntiHinta = input.nextDouble();
		double palkkio = myyntiHinta * palkPros;
		if(palkkio<min) {
			palkkio = min;
		}
		DecimalFormat des = new DecimalFormat("0.00");

		System.out.println("Myyntipalkkio on: " + des.format(palkkio));
		input.close();
	}

}
