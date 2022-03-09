package palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lahjavero {
	
	private double laskeVero(double arvo) {
		double veromaara = 0;
		if (arvo<5000) {
			veromaara = 0;
		} else if (arvo < 25000) {
			veromaara = 100+(arvo-5000)*0.08;
		} else if (arvo < 55000) {
			veromaara = 1700+(arvo-25000)*0.1;
		} else if (arvo < 200000) {
			veromaara = 4700+(arvo-55000)*0.12;
		} else if (arvo < 1000000) {
			veromaara = 22100+(arvo-200000)*0.12;
		} else {
			veromaara = 1420+(arvo-1000000)*0.17;
		}
		return veromaara;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");

		Lahjavero ohjelma = new Lahjavero();
		
		System.out.println("Anna lahjan suuruus: ");
		double arvo = input.nextDouble();
		double veromaara = ohjelma.laskeVero(arvo);
		System.out.println("Lahjavero on "+des.format(veromaara)+" euroa");
		
		input.close();
	}

}
