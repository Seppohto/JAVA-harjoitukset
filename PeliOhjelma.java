package palautettavat;

import java.util.Scanner;

public class PeliOhjelma {
	static Scanner input = new Scanner(System.in);
	static Peli peli;
	static PeliOhjelma ohjelma = new PeliOhjelma();
	int arvauksia = 0;
	
	public PeliOhjelma() {
		peli = new Peli();		
	}
	
	private void aja() {
		naytaValikko();		
	}

	private void naytaValikko() {
		boolean jatkuu = true;
		
		do {
			System.out.println("\n1. Tee pelaaja");
			System.out.println("2. Pelaa");
			System.out.println("3. N‰yt‰ peli");
			System.out.println("0. Lopetus");
			System.out.print("Anna valintasi (0-3): ");
			switch (input.nextInt()){
			case 0:
				jatkuu = false;
				break;
			case 1:
				teePelaaja();
				break;
			case 2:
				pelaa();
				break;
			case 3:
				naytaPeli();
				break;
			default:
				System.out.println("Valinta ei kelpaa!");
			}
			
		} while (jatkuu);
		
	}


	private void teePelaaja() {
		Henkilo hlo = new Henkilo();
		System.out.println("Anna nimesi: ");
		input.nextLine();
		hlo.setNimi(input.nextLine());
		peli.setPelaaja(hlo);
		
	}
	
	private static void pelaa() {
		if (peli.getPelaaja()==null) {
			System.out.println("Peli voi alkaa vasta, kun on asetettu pelaaja");
			return;
		}
		System.out.print("Anna arvaus: ");
		boolean vaaraArvaus = true;
		int vaariaArvauksia = 0;
		do {
			vaariaArvauksia++;
			int arvaus = input.nextInt();
			if (arvaus == peli.getArvattava()) {
				System.out.println("Arvasit oikein");
				vaaraArvaus = false ;
			} else if (arvaus > peli.getArvattava()) {
				System.out.print("Arvaa pienemp‰‰: ");				
			} else {
				System.out.print("Arvaa suurempaa: ");
			} 
		} while (vaaraArvaus);
		ohjelma.arvauksia = vaariaArvauksia;
			
		
	}

	private static void naytaPeli() {
		if (ohjelma.arvauksia != 0) {
			System.out.println(peli.getPelaaja().getNimi() + " arvasi " + ohjelma.arvauksia + " kertaa numeroa " + peli.getArvattava());
		} else {
			System.out.println("Peli‰ ei ole pelattu");
		}
		
	}


	public static void main(String[] args) {
		PeliOhjelma ohjelma = new PeliOhjelma();
		ohjelma.aja();
		
	}

	

}
