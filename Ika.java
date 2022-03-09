package Omat1;

import java.util.Scanner;

public class Ika {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna ikä: ");
		int ika = input.nextInt();
		if(ika<0||ika>120) {
			System.out.println("Virheellinen ikä");
		} else if (ika < 18) {
			System.out.println("Alaikäinen");
		} else {
			System.out.println("Täysi-ikäinen");
		}
		input.close();
	}

}
