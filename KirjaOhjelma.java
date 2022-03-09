package palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class KirjaOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");

		System.out.print("Anna nimi: ");
		String nimi = input.nextLine();		
		System.out.print("Anna isbn: ");
		String isbn= input.nextLine();
		System.out.print("Anna hinta: ");
		double hinta = input.nextDouble();
		System.out.print("Anna julkaisuvuosi: ");
		int vuosi = input.nextInt();
		Kirja kirja_1 = new Kirja(nimi, isbn, hinta, vuosi);
		Kirja kirja_2 = new Kirja();
		kirja_2.setNimi(nimi);
		kirja_2.setIsbn(isbn);
		kirja_2.setHinta(hinta);
		kirja_2.setVuosi(vuosi);
		
		System.out.println(kirja_1);
		
		System.out.println("Nimi: "+kirja_2.getNimi());
		System.out.println("Isbn: "+kirja_2.getIsbn());
		System.out.println("Hinta: "+des.format(kirja_2.getHinta()));
		System.out.println("Julkaisuvuosi: "+kirja_2.getVuosi());
		input.close();
	}

}
