package Omat1;

import java.util.Scanner;

public class Ika {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna ik�: ");
		int ika = input.nextInt();
		if(ika<0||ika>120) {
			System.out.println("Virheellinen ik�");
		} else if (ika < 18) {
			System.out.println("Alaik�inen");
		} else {
			System.out.println("T�ysi-ik�inen");
		}
		input.close();
	}

}
