package palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Maalaus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Anna huoneen leveys, pituus ja korkeus: ");
		double leveys = input.nextDouble();
		double pituus = input.nextDouble();
		double korkeus = input.nextDouble();
		System.out.println("Paljonko litralla saadaan maalattua neliöitä: ");
		int ltrpernelio = input.nextInt();
		DecimalFormat des = new DecimalFormat("0.00");
		double maaliatarvitaan = (double) (leveys + leveys + pituus + pituus) * korkeus / ltrpernelio;
		System.out.println("Maalin tarve on "+des.format(maaliatarvitaan)+" litraa");
		input.close();
	}

}
