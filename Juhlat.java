package palautettavat;

import java.util.Scanner;

public class Juhlat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna juhliin tulevien aikuisten m‰‰r‰: ");
		int aikuisia = input.nextInt();
		int pulloja = (int)Math.ceil((double) aikuisia / 7);
		System.out.println("Pulloja tarvitaan "+pulloja+" kappaletta");
		input.close();
	}

}
