package palautettavat;

import java.util.Scanner;

public class Puoluetuki {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tuki = 148175;
		int edustajia;
		System.out.print("Anna kansanedustajien lukum��r�: ");
		edustajia = input.nextInt();
		System.out.println("Puoluetuen m��r� on "+tuki*edustajia+" euroa");
		input.close();
	}

}
