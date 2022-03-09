package palautettavat;

import java.util.Scanner;

public class Tunnus {
	
	private String teeTunnus(String etu, String suku) {
		etu = etu.toLowerCase();
		suku = suku.toLowerCase();
		String tunnus = etu.substring(0, 3)+suku.substring(0, 3);
		return tunnus;
	}



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tunnus ohjelma = new Tunnus();

		System.out.print("Anna sukunimi: ");
		String etu = input.next();
		System.out.print("Anna etunimi: ");
		String suku = input.next();
		String tunnus = ohjelma.teeTunnus(etu, suku);
		System.out.println("Tunnus on "+tunnus);
		input.close();
	}

}