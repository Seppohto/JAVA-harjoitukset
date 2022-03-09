package palautettavat;

import java.util.ArrayList;
import java.util.Scanner;

public class DominionlistaOhjelma {
	Scanner input = new Scanner(System.in);
	ArrayList<Pelaaja> pelaajat = new ArrayList<Pelaaja>();
	int laanit = 0;	
	private void aja() {
		pelaaDominionia();		
	}
	private void pelaaDominionia() {
		esittelePelaajat();		
		do {
			int pelaajaidx = etsiPelaaja();
			lisaaPisteita(pelaajaidx);
			naytaPisteet();
		} while (laanit < 8);
		int voittajaEhdokas = -1;
		int voittajanPisteet =-999;
		int voittaja = -1;
		for (Pelaaja p : pelaajat) {
			voittajaEhdokas++;
			if (p.getPisteet()>voittajanPisteet) {
				voittajanPisteet = p.getPisteet();
				voittaja = voittajaEhdokas;
			}
		}
		System.out.println("Voittaja oli "+pelaajat.get(voittaja).getNimi()+
				" pisteillä "+pelaajat.get(voittaja).getPisteet());
	}	
	private void esittelePelaajat() {
		System.out.print("Montako pelaajia on: ");
		int pelaajalkm = input.nextInt();
		input.nextLine();
		for (int i = 0 ; i < pelaajalkm ;i++ ) {
		System.out.print("Anna pelaajan nimi: ");
		String nimi = input.nextLine();
		pelaajat.add(new Pelaaja(nimi,0));
		}
	}
	private int etsiPelaaja() {	
		int paluuArvo=-1;
		System.out.print("\nKuka sai pisteitä: ");
		String nimi = input.nextLine();
		for(int i=0 ; i<pelaajat.size();i++) {
			if(pelaajat.get(i).getNimi().equalsIgnoreCase(nimi)) {
				paluuArvo=i;
				break;
			}
		}	
		if(paluuArvo==-1) {
			System.out.print("Pelaajaa ei löydy nimella "+nimi);
		}
		return paluuArvo ;
	}
	private void lisaaPisteita(int pelaajaidx) {
		int idx = pelaajaidx;
		int korttiPisteet = 0;
		if(idx==-1) {
			return;
		}
		System.out.print("K=kirous, T=tila, P=pitäjä, L=lääni: ");
		String kortti = input.nextLine();
		if (kortti.equalsIgnoreCase("L")) {
			korttiPisteet = 8;
			laanit++;
		} else if (kortti.equalsIgnoreCase("K")) {
			korttiPisteet = -1;
		}else if (kortti.equalsIgnoreCase("T")) {
			korttiPisteet = 2;
		}else if (kortti.equalsIgnoreCase("P")) {
			korttiPisteet = 5;
		} else {
			System.out.println("Väärä valinta");
		}
		int pisteet = pelaajat.get(pelaajaidx).getPisteet();
		pelaajat.get(pelaajaidx).setPisteet(pisteet+korttiPisteet);
		
	}
	private void naytaPisteet() {
		for (Pelaaja p : pelaajat)
		System.out.println(p.getNimi()+" "+p.getPisteet()+" pistettä");
	}	
	public static void main(String[] args) {
		DominionlistaOhjelma ohjelma = new DominionlistaOhjelma();
		ohjelma.aja();
	}	
}
