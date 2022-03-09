package palautettavat;
  
public class PeltipoliisiYlinopeus {

	public static void main(String[] args) {
		String [] peltipoliisi = {"ZZZ-321;89", "ABC-123;82", "AAA-123;87", "XYZ-999;85", "CCC-111;83"};
		
		for (int i=0 ; i<peltipoliisi.length ; i++) {
			String[] pelpol = peltipoliisi[i].split(";");
			int nopeus = Integer.parseInt(pelpol[1]);
			if ( 84 <= nopeus ) {
				System.out.println(pelpol[0]+" "+pelpol[1]);
			}
		}		
	}

}