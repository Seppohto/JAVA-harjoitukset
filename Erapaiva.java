package palautettavat;

import java.time.LocalDate;
import java.util.Scanner;

public class Erapaiva {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna laskun p‰iv‰m‰‰r‰ (vvvv-kk-pp): ");
		String pvm = input.next();
		try {
			LocalDate paivamaara = LocalDate.parse(pvm);
			paivamaara = paivamaara.plusDays(14);
			System.out.println("Er‰p‰iv‰ on "+paivamaara);
			
		} catch (Exception error)  {
			System.out.println("Laskun p‰iv‰m‰‰r‰ on virheellinen");
		}
		
		input.close();
	}

}
