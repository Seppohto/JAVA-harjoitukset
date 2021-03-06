package perusteita;  // Kansio, jossa on yhteenkuluvat koodit

// Tuodaan tässä ohjelmassa käyttettävät Javan valmiit luokat
import java.text.DecimalFormat;  // Jotta desimaaliluken muotoilu onnistuu
import java.util.Scanner; // Jotta saadaan luettua näppäimistöä

public class AsunnonMyynti {

	/*
	 * Tee ohjelma (kalvoesimerkkinä), joka kysyy asunnon myyntihinnan ja laskee
	 * asunnon myynnistä maksettavan välityspalkkion. Välityspalkkion on 3,44%
	 * myyntihinnasta. Esimerkiksi jos asunnon myyntihinta on 100000 euroa,
	 * välityspalkkio on 3440 euroa (myyntihinta*(3.44/100.0)).
	 */

	public static void main(String[] args) {
		// Esitellään vakio eli ei voida muuttaa ohjelmassa
		final double PALKKIO = 3.44;  // Desimaaliluvussa on piste

		// Esitellään muuttujat eli tieto voidaan ohjelmassa muuttaa
		double myyntihinta, palkkio;

		// Kysytään käyttäjältä hintaa konsolista
		System.out.print("Anna asunnon myyntihinta: ");

		// Esitellä Scanner ja tuodaan ohjelman alkuun paketti, missä Scanner on
		Scanner input = new Scanner(System.in);

		// Luetaan hinta näppäimistöltä
		myyntihinta = input.nextDouble();  
		// Desimaaliluku annetaan näppäimistöltä esim. 123000,00 eli pilkulla

		// Lasketaan
		palkkio = myyntihinta * (PALKKIO / 100.0);

		// Määritellään deimaalien muotoilu
		DecimalFormat desimaalit = new DecimalFormat("0.00");

		// Näytetään vastaus muotoiltuna + yhdistää merkkijonoja (vakiotekstiä)  ja muuttujia
		System.out.println("Myyntipalkkio on " + desimaalit.format(palkkio));
	}

}
