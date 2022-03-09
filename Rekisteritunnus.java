package palautettavat;

import java.util.Scanner;

public class Rekisteritunnus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Anna rekisterinumero: ");
		String rekkari = input.next();
		rekkari = rekkari.trim();
		rekkari = rekkari.toUpperCase();
		String kelvollisuus = "";
		if (rekkari.matches("[A-ZÅÄÖ]{2,3}-[1-9][0-9]{0,2}")) {
			kelvollisuus = "Rekisterinumero on kelvollinen";
		} else {
			kelvollisuus = "Rekisterinumero ei ole kelvollinen";
		}
		
		System.out.println(kelvollisuus);
		
		input.close();
	}

}
