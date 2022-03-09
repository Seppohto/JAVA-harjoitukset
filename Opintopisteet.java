package Palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Opintopisteet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.print("Anna lukukausien m‰‰r‰: ");
		double lukukaudet = input.nextInt();
		double pisteet = 0;
		for(int i=1; i<=lukukaudet; i++) {
			System.out.print("Anna "+i+". lukukauden opintopisteesi: ");
			pisteet = pisteet + input.nextDouble();
			
		}
		double op = lukukaudet*30;
		double jaljella = 210-pisteet;
		System.out.println("Sinulla pit‰isi olla t‰h‰n menness‰ "+des.format(op)+
				" opintopistett‰.\nSinulla on "+des.format(pisteet)+" opintopistett‰.");
		if (pisteet<op) {
			System.out.println("Olet j‰ljess‰ tavoitteesta.");
		} else {
			System.out.println("Olet edell‰ tavoitteesta.");
		}
		System.out.println("Tutkinnosta puuttuu viel‰ "+des.format(jaljella)+" opintopistett‰.");
		input.close();
	}

}
