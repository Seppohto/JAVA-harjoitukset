package Omat1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kimppakyyti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");
		double kulutus,litrahinta,bensakustannus;
		int kilometrit, lukumaara;
		System.out.print("Anna ajetut kilometrit: ");
		kilometrit = input.nextInt();
		System.out.print("Anna kulutus per 100km: ");
		kulutus = input.nextDouble();
		System.out.print("Anna polttoaineen litrahinta: ");
		litrahinta = input.nextDouble();
		System.out.print("Anna kimppakyytiläisten lukumäärä: ");
		lukumaara = input.nextInt();
		bensakustannus = (double) kilometrit*kulutus/100.0*litrahinta/lukumaara;
		System.out.println("Bensakustannus per henkilö on " + des.format(bensakustannus) + " euroa");
		input.close();
		

	}

}
