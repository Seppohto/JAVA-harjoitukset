package palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kulutus {
	
	private int kysyKilometrit() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna ajetut kilometrit: ");
		int kilometrit = input.nextInt();
		return kilometrit;
	}

	private double kysyTankkaus() {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna tankattu m‰‰r‰: ");
		double tankattu = input.nextDouble();
		
		return tankattu;
	}

	private double laskeKulutus(int kilometrit, double tankattu) {
		double kulutus = tankattu / kilometrit * 100;
		return kulutus;
	}	

	private void naytaKulutus(double kulutus) {
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.println("Kulutus/100km on "+des.format(kulutus)+" litraa");
	}

	public static void main(String[] args) {
		Kulutus ohjelma = new Kulutus();
		int kilometrit = ohjelma.kysyKilometrit();
		double tankattu = ohjelma.kysyTankkaus();
		double kulutus = ohjelma.laskeKulutus(kilometrit,tankattu);
		ohjelma.naytaKulutus(kulutus);
	}

}
