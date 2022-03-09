package palautettavat;

import java.util.Scanner;
import java.util.Arrays;

public class Lampotilat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] lampotilat = new int [100];
		int lkm = 0;
		System.out.print("Anna lämpötila: ");
		int lampotila = input.nextInt();

		while (lampotila != -999 && lkm != 100) {
		   lampotilat [lkm] = lampotila;
		   lkm++;
		   if (lkm != 100) {
			   System.out.print("Anna lämpötila: ");
				lampotila = input.nextInt();
		   }
		}

		Arrays.sort(lampotilat, 0, lkm);
				System.out.print("Annoit lämpötilat: ");
				for (int i = 0; i < lkm; i++) {
				System.out.print(lampotilat[i] + " ");
				}
		input.close();
	}

}
