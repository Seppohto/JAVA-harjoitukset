package palautettavat;

import java.util.Scanner;

public class Tervehdys {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna tunnit: ");
		int tunnit = input.nextInt();
		if (tunnit >= 7 && tunnit < 10) {
			System.out.println("Hyv�� huomenta!");
		} else if (tunnit >= 10 && tunnit < 17) {
				System.out.println("Hyv�� p�iv��!");
			} else if (tunnit >= 17 && tunnit < 22) {
				System.out.println("Hyv�� iltaa!");
			} else {
				System.out.println("Hyv�� y�t�!");
			}
		input.close();
	}

}
