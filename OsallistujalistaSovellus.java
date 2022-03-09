package palautettavat;

import java.util.ArrayList;
import java.util.Scanner;

public class OsallistujalistaSovellus {
	Scanner input = new Scanner(System.in);
	ArrayList<Osallistuja> osallistujat = new ArrayList<Osallistuja>();
	
	private void aja() {
		naytaValikko();		
	}
	
	private void naytaValikko() {
		boolean jatkuu = true;		
		do {
			System.out.println("\n1 = Lis‰‰ osallistuja");
			System.out.println("2 = N‰yt‰ kaikki osallistujat");
			System.out.println("3 = N‰yt‰ kansallisuudella");
			System.out.println("4 = Muuta osallistujan nime‰");
			System.out.println("0 = Lopeta");
			System.out.print("Anna valintasi (0-5): ");
			switch (input.nextInt()){
			case 0:
				jatkuu = false;
				break;
			case 1:
				lisaaOsallistuja();
				break;
			case 2:
				naytaKaikkiOsallistujat();
				break;
			case 3:
				naytaKansalaisuudella();
				break;
			case 4:
				muutaOsallistujanNimi();
				break;
			default:
				System.out.println("Valinta ei kelpaa!");
				}			
		} while (jatkuu);		
	}

	private void lisaaOsallistuja() {
		Osallistuja osallistuja = new Osallistuja();
		input.nextLine();
		System.out.print("Anna osallistujan nimi: ");
		osallistuja.setNimi(input.nextLine());
		System.out.print("Anna kansallisuus: ");
		osallistuja.setKansallisuus(input.nextLine());
		System.out.print("Anna syntym‰vuosi: ");
		int syntymavuosi = input.nextInt();
		osallistuja.setSyntymavuosi(syntymavuosi);
		osallistujat.add(osallistuja);
		
	}

	private void naytaKaikkiOsallistujat() {
		for (Osallistuja o : osallistujat) {
			System.out.println("\nNimi: "+o.getNimi());
			System.out.println("Kansallisuus: "+o.getKansallisuus());
			System.out.println("Syntym‰vuosi: "+o.getSyntymavuosi());
		}
		
	}

	private void naytaKansalaisuudella() {
		input.nextLine();
		System.out.println("Anna kansallisuus: ");		
		String haettava = input.nextLine();
		for (Osallistuja o : osallistujat) {
			if (haettava.equalsIgnoreCase(o.getKansallisuus())) {
				System.out.println("\nNimi: "+o.getNimi());
				System.out.println("Kansallisuus: "+o.getKansallisuus());
				System.out.println("Syntym‰vuosi: "+o.getSyntymavuosi());
			}
		}
		
	}

	private void muutaOsallistujanNimi() {
		input.nextLine();
		System.out.println("Anna muutettavan osallistujan nimi: ");
		int idx=-1;
		String nimi = input.nextLine();
		for(int i=0 ; i<osallistujat.size();i++) {
			if(osallistujat.get(i).getNimi().equalsIgnoreCase(nimi)) {
				idx=i;
				break;
			}
		}	
		if(idx==-1) {
			//System.out.print("Pelaajaa ei lˆydy nimella "+nimi);
		} else {
			System.out.println("Anna osallistujan uusi nimi: ");
			String uusinimi=input.nextLine();
			osallistujat.get(idx).setNimi(uusinimi);
		}
		
	}

	public static void main(String[] args) {
		OsallistujalistaSovellus ohjelma = new OsallistujalistaSovellus();
		ohjelma.aja();
	}

}
