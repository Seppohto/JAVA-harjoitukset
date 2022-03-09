package palautettavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sahkolasku {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat des = new DecimalFormat("0.00");

		System.out.print("Anna kilowatin hinta euroina: ");
		double shinta = input.nextDouble();
		int [] sahkolkma = new int [6];
		for (int i=0; i < 6; i++) {
			  System.out.print("Anna kuukauden "+(i+1)+" sähkölukema: ");
			  sahkolkma[i] = input.nextInt();
			}
		for (int i=0; i < 6; i++) {
			double summa = shinta * sahkolkma[i];
			  System.out.print((i+1)+". kuukauden kulutus: "+sahkolkma[i]+"kWh "+des.format(summa)+" euroa\n");
			}
		
		input.close();
	}

}
