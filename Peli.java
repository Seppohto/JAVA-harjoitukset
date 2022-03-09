package palautettavat;

public class Peli {
	private int arvattava = 73;
	private Henkilo pelaaja;
	public Peli() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Peli(int arvattava, Henkilo pelaaja) {
		super();
		this.arvattava = arvattava;
		this.pelaaja = pelaaja;
	}
	public int getArvattava() {
		return arvattava;
	}
	public void setArvattava(int arvattava) {
		this.arvattava = arvattava;
	}
	public Henkilo getPelaaja() {
		return pelaaja;
	}
	public void setPelaaja(Henkilo pelaaja) {
		this.pelaaja = pelaaja;
	}
	@Override
	public String toString() {
		return "Peli [arvattava=" + arvattava + ", pelaaja=" + pelaaja + "]";
	}
	
	

}
