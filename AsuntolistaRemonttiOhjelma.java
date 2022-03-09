package palautettavat;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AsuntolistaRemonttiOhjelma {

	Scanner input = new Scanner(System.in);
	DecimalFormat des = new DecimalFormat("0.00");
	private ArrayList<Asunto> asunnot = new ArrayList<Asunto>();
	
	
	private void aja() {
		naytaValikko();		
	}
	
	private void naytaValikko() {
		boolean jatkuu = true;		
		do {
			System.out.println("\n1. Lis‰‰ asunto");
			System.out.println("2. N‰yt‰ asunnot");
			System.out.println("0. Lopetus");
			System.out.print("Anna valintasi (0-2): ");
			switch (input.nextInt()){
			case 0:
				jatkuu = false;
				break;
			case 1:
				lisaaAsunto();
				break;
			case 2:
				naytaAsunnot();
				break;
			default:
				System.out.println("Valinta ei kelpaa!");
				}			
		} while (jatkuu);		
	}
	
	private void lisaaAsunto() {
		Asunto asunto = new Asunto();
		System.out.print("Anna asunnon tyyppi: ");
		input.nextLine();
		String tyyppi = input.nextLine();		
		System.out.print("Anna osoite: ");
		String osoite = input.nextLine();
		System.out.print("Anna pinta-ala: ");
		double pintaala = input.nextDouble();
		System.out.print("Anna hinta: ");
		double hinta = input.nextDouble();
		System.out.print("Anna kuvaus: ");
		input.nextLine();
		String kuvaus = input.nextLine();
			
		asunto.setTyyppi(tyyppi);
		asunto.setOsoite(osoite);
		asunto.setPintaala(pintaala);
		asunto.setHinta(hinta);
		asunto.setKuvaus(kuvaus);
		
		boolean jatkuu = true;
		do {
			System.out.print("Anna remonttivuosi (0 lopettaa): ");
			int vuosi = input.nextInt();
			if (vuosi == 0) {
				jatkuu = false;
			} else {
				System.out.print("Anna remontin kuvaus: ");
				input.nextLine();
				String remontinKuvaus = input.nextLine();
				asunto.getRemontit().add(new Remontti(vuosi, remontinKuvaus));
			} 
		} while (jatkuu);
		asunnot.add(asunto);
	}
	
	private void naytaAsunnot() {
		for (Asunto a : asunnot) {
			System.out.println("\nTyyppi: "+a.getTyyppi());
			System.out.println("Osoite: "+a.getOsoite());
			System.out.println("Pinta-ala: "+des.format(a.getPintaala()));
			System.out.println("Hinta: "+des.format(a.getHinta())+" euroa");
			System.out.println("Kuvaus: "+a.getKuvaus());
			System.out.println("Remontit:");
			for(int i=0; i<a.getRemontit().size();i++) {
				System.out.println(a.getRemontit().get(i).getVuosi()+
						a.getRemontit().get(i).getRkuvaus());
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		AsuntolistaRemonttiOhjelma ohjelma = new AsuntolistaRemonttiOhjelma();
		ohjelma.aja();
	}

}


