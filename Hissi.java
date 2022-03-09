package Palautettavat;

import java.util.Scanner;

public class Hissi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int paino ;
		int yhteensa = 0;
		
		do {
			System.out.print("Paljonko painat: ");
			paino = input.nextInt();
			yhteensa = yhteensa+paino;
			if (paino != 0) {
				if (yhteensa<=240) {
					System.out.println("Tule kyytiin.");
				} else {
					System.out.println("Hissi on jo täynnä. Odota seuraavaa hissiä.");
				}
			}
			
		} while (yhteensa < 240 && paino != 0);
		input.close();
	}

}
