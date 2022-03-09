package palautettavat;

public class Kirja {
	private String nimi, isbn;
	private double hinta;
	private int vuosi;
	private Kustantaja kustantaja;
	
	public Kirja() {
		
	}	
	public Kirja(String nimi, String isbn, double hinta, int vuosi) {
		super();
		this.nimi = nimi;
		this.isbn = isbn;
		this.hinta = hinta;
		this.vuosi = vuosi;
	}

	public Kirja(String nimi, String isbn, double hinta, int vuosi, Kustantaja kustantaja) {
		super();
		this.nimi = nimi;
		this.isbn = isbn;
		this.hinta = hinta;
		this.vuosi = vuosi;
		this.kustantaja = kustantaja;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getHinta() {
		return hinta;
	}
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	public int getVuosi() {
		return vuosi;
	}
	public void setVuosi(int vuosi) {
		this.vuosi = vuosi;
	}
	
	public Kustantaja getKustantaja() {
		return kustantaja;
	}
	public void setKustantaja(Kustantaja kustantaja) {
		this.kustantaja = kustantaja;
	}
	@Override
	public String toString() {
		return "Kirja [nimi=" + nimi + ", isbn=" + isbn + ", hinta=" + hinta + ", vuosi=" + vuosi + ", kustantaja="
				+ kustantaja + "]";
	}
	

}
