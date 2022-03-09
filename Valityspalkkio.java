package Omat1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Valityspalkkio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double palkkioPros = 0.0344;
		double myyntiHinta, valPal;
		System.out.print("Anna asunnon myyntihinta: ");
		myyntiHinta=input.nextDouble();
		valPal = myyntiHinta * palkkioPros;
		DecimalFormat des = new DecimalFormat("0.00");
		System.out.println("Myyntipalkkio on " + des.format(valPal));
		input.close();
	}

}
