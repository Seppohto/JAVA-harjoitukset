package palautettavat;

import java.util.Scanner;

public class Tervehdys {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna tunnit: ");
		int tunnit = input.nextInt();
		if (tunnit >= 7 && tunnit < 10) {
			System.out.println("Hyvää huomenta!");
		} else if (tunnit >= 10 && tunnit < 17) {
				System.out.println("Hyvää päivää!");
			} else if (tunnit >= 17 && tunnit < 22) {
				System.out.println("Hyvää iltaa!");
			} else {
				System.out.println("Hyvää yötä!");
			}
		input.close();
	}

}
