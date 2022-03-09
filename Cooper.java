package palautettavat;

import java.util.Scanner;

public class Cooper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna juostu matka: ");
		int matka = input.nextInt();
		int kierrokset = matka/400;
		System.out.println("Kokonaisia 400 metrin kierroksia oli "+ kierrokset);
		input.close();
	}

}
