package palautettavat;

import java.util.Scanner;

public class Katsastus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Onko 1=katsastus, 2=jälkitarkastus: ");
		int tarktyyppi = input.nextInt();
		int hinta = 0;
		if (tarktyyppi == 2) {
			hinta = hinta + 30;
			} else {
				hinta = hinta + 50;
				System.out.print("Mitataanko päästöt 0=ei, 1=kyllä: ");
				int paastot = input.nextInt();
				if (paastot == 1) {
					System.out.print("Onko auto 0=bensa, 1=diesel: ");
					int polttoaine = input.nextInt();
					if (polttoaine == 0) {
						hinta = hinta + 22;
					} else {
					hinta = hinta + 31;
					}
				}
			}
		  System.out.println("Hinta on "+hinta);
		input.close();
	}

}
