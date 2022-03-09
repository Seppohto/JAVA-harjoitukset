package palautettavat;

public class Pelaaja {
	private String nimi;
	private int pisteet;
	
	public Pelaaja() {
		
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public int getPisteet() {
		return pisteet;
	}

	public void setPisteet(int pisteet) {
		this.pisteet = pisteet;
	}

	public Pelaaja(String nimi, int pisteet) {
		super();
		this.nimi = nimi;
		this.pisteet = pisteet;
	}

	@Override
	public String toString() {
		return "Pelaaja [nimi=" + nimi + ", pisteet=" + pisteet + "]";
	}

}
