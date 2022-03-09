package Omat1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Painoindeksi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double paino, pituus, painoIndeksi;
		System.out.print("Anna paino (kiloina): ");
		paino = input.nextDouble();
		System.out.print("Anna pituus (metreinä): ");
		pituus = input.nextDouble();
		painoIndeksi = (double) paino / (pituus * pituus);
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.println("Painoindeksi on " + des.format(painoIndeksi));
		input.close();


	}

}
