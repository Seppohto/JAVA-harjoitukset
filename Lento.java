package palautettavat;

import java.util.Scanner;

public class Lento {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna lennon numero: ");
		String lennonnro = input.next();
		lennonnro = lennonnro.trim();
		String tunniste = lennonnro.substring(0, 2);
		tunniste = tunniste.toUpperCase();
		int tunnistenro = Integer.parseInt(lennonnro.substring(2, 3));
		
		String lennontyyppi ="";
		
		if(tunniste.equals("AY") == false) {
			lennontyyppi = "Ei ole Finnairin lento";
		} else {
			if (tunnistenro==1) {
				lennontyyppi = "Kaukolento";
			}else if (tunnistenro >= 2 && tunnistenro <= 6) {
				lennontyyppi = "Kotimaan lento";
			}else if (tunnistenro==7) {
				lennontyyppi = "Venäjän lento";
			} else {
				lennontyyppi = "Virheellinen lennon numero";
			}
		}
		
		System.out.println(lennontyyppi);
		input.close();
	}

}
