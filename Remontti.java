package palautettavat;

import java.time.LocalDate;

public class Remontti {
	private int vuosi ;
	private String rkuvaus;
	private Henkilo tekija;
	
	public Remontti() {
		LocalDate date = LocalDate.now();
		vuosi = date.getYear();
	}
	
	public Remontti(int vuosi, String rkuvaus) {
		this.vuosi = vuosi;
		this.rkuvaus = rkuvaus;
	}



	public int getVuosi() {
		return vuosi;
	}

	public boolean setVuosi(int vuosi) {
		if (this.vuosi<vuosi) {
			boolean isyearfuture = false;
			return isyearfuture;
		}else {
			this.vuosi = vuosi;
			boolean isyearfuture = true;
			return isyearfuture;
		}
	}

	public String getRkuvaus() {
		return rkuvaus;
	}

	public void setRkuvaus(String rkuvaus) {
		this.rkuvaus = rkuvaus;
	}
	

	public Henkilo getTekija() {
		return tekija;
	}

	public void setTekija(Henkilo tekija) {
		this.tekija = tekija;
	}

	@Override
	public String toString() {
		return "Remontti [vuosi=" + vuosi + ", rkuvaus=" + rkuvaus + ", tekija=" + tekija + "]";
	}
	
}
