package palautettavat;

import java.util.Scanner;

public class Kellonaika {
	
	private String kysyKellonaika() {
		Scanner input = new Scanner(System.in);
		System.out.println("Anna kellonaika muodossa tt:mm: ");
		String kellonaika = input.next();
		return kellonaika;
	}

	private boolean tarkastaKellonaika(String kellonaika) {
		boolean tarkastus;
		if (kellonaika.matches("[0-2]\\d:[0-6]\\d")) {
			int tunnit = Integer.parseInt(kellonaika.substring(0,2));
			int minuutit = Integer.parseInt(kellonaika.substring(3,5));
			if(tunnit >= 0 && tunnit <=24 && minuutit >= 0 && minuutit <=60) {
				tarkastus = true;
			} else {
				tarkastus = false;				
			}
		} else {
			tarkastus = false;
		}
		return tarkastus;
	}
	
	public static void main(String[] args) {
		Kellonaika ohjelma = new Kellonaika();
		String kellonaika = ohjelma.kysyKellonaika();
		boolean tarkastus = ohjelma.tarkastaKellonaika(kellonaika);
		if (tarkastus == true) {
			System.out.println("Kellonaika on oikein");
		} else {
			System.out.println("Kellonaika on väärin");
		}
	}

}