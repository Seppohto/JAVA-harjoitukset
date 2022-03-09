package Omat1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lippupaketti {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pakHinta;
		System.out.print("Anna paketin hinta:");
		pakHinta = input.nextDouble();
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.println("Yksittäisen lipun hinta on " + des.format(pakHinta/6));		
		input.close();
	}

}
