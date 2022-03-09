package palautettavat;

import java.util.Scanner;

public class Dominion {
	
	private int laskePisteet(int kirous, int tila, int pitaja, int laani) {
		int yhteispisteet = kirous*(-1) + tila*2 + pitaja*5 + laani*8;
		return yhteispisteet;
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Dominion ohjelma = new Dominion();
		
		System.out.print("Anna kirouskorttien m‰‰r‰: ");
		int kirous = input.nextInt();
		System.out.print("Anna tilakorttien m‰‰r‰: ");
		int tila = input.nextInt();
		System.out.print("Anna pit‰j‰korttien m‰‰r‰: ");
		int pitaja = input.nextInt();
		System.out.print("Anna l‰‰nikorttien m‰‰r‰: ");
		int laani = input.nextInt();
		int yhteispisteet = ohjelma.laskePisteet(kirous, tila, pitaja, laani);
		System.out.println("Pisteiden yhteism‰‰r‰ on "+yhteispisteet );
		
		input.close();
		
	}	

}
