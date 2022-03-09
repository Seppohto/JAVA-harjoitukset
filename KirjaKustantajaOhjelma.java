package palautettavat;

import java.util.Scanner;

public class KirjaKustantajaOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nimi = "Java-ohjelmointi";
		String isbn = "978-952-14-3556-0";
		double hinta = 65.50;
		int vuosi = 2018;		
		Kirja kirja = new Kirja(nimi,isbn,hinta,vuosi);
		
		
		System.out.print("Kustantajan nimi: ");
		String knimi = input.nextLine();
		System.out.print("Kustantajan osoite: ");
		String kosoite = input.nextLine();
		System.out.print("Kustantajan puhelin: ");
		String kpuhelin =input.nextLine();
		Kustantaja kus = new Kustantaja(knimi,kosoite,kpuhelin);
		kirja.setKustantaja(kus);
		
		System.out.println("Kirjan "+kirja.getNimi()+" kustantaja on "+
		kirja.getKustantaja().getNimi());
		
		
		
		input.close();
	}

}
