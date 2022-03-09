package Omat1;

import java.util.Scanner;

public class Arvosana {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna arvosana (0-5): ");
		switch (input.nextInt()) {
		case 5:
			System.out.println("Kiitettävä");
			break;
		case 4:
		case 3:
			System.out.println("Hyvä");
			break;
		case 2:
			System.out.println("Tyydyttävä");
			break;
		case 1:
			System.out.println("Heikko");
			break;
		case 0:
			System.out.println("Hylätty");
			break;
		default:
			System.out.println("Ei kelpaa arvosanaksi");
		}
		input.close();
	}

}
