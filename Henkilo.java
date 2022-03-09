package palautettavat;

public class Henkilo {
	private String nimi;
	private String osoite;
	private Henkilo aiti;
	private Henkilo isa;
	
	public Henkilo() {
	}

	public Henkilo(String nimi, String osoite, Henkilo aiti, Henkilo isa) {
		this.nimi = nimi;
		this.osoite = osoite;
		this.aiti = aiti;
		this.isa = isa;
	}

	public Henkilo(String nimi, String osoite) {
		this.nimi = nimi;
		this.osoite = osoite;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public Henkilo getAiti() {
		return aiti;
	}

	public void setAiti(Henkilo aiti) {
		this.aiti = aiti;
	}

	public Henkilo getIsa() {
		return isa;
	}

	public void setIsa(Henkilo isa) {
		this.isa = isa;
	}

	@Override
	public String toString() {
		return "Henkilo [nimi=" + nimi + ", osoite=" + osoite + ", aiti=" + aiti + ", isa=" + isa + "]";
	}
	
}