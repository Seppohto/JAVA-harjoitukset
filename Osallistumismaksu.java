package palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Osallistumismaksu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");

		System.out.print("Osallistuja (OS) / Katsoja (KA): ");
		String kategoria = input.next();
		
		String ikaryhma ="";//= input.next();
		if (kategoria.equalsIgnoreCase("OS")) {
			System.out.print("Nuoret (NU) / Aikuiset (AI): ");
			ikaryhma = input.next();
		}else {
			System.out.println("Ikä: ");
			int ika = input.nextInt();
			if (ika < 18) {
				ikaryhma = "NU";
			} else {
				ikaryhma = "AI";
			} 
		}
		double hinta = 0;
		if (kategoria.equalsIgnoreCase("OS")) {
			if (ikaryhma.equalsIgnoreCase("NU")) {
				hinta = 10;
			} else if (ikaryhma.equalsIgnoreCase("AI")) {
				hinta = 20;
			} else {
				System.out.println("TARKISTA SYÖTE");
			}
		} else if (kategoria.equalsIgnoreCase("KA")) {
			if (ikaryhma.equalsIgnoreCase("NU")) {
				hinta = 8;
			} else if (ikaryhma.equalsIgnoreCase("AI")) {
				hinta = 12.5;
			} else {
				System.out.println("TARKISTA SYÖTE");
			}		
		} else {
			System.out.println("TARKISTA SYÖTE");
		}
		
		System.out.println("Maksu on "+des.format(hinta)+" euroa");
		
		input.close();
	}

}
