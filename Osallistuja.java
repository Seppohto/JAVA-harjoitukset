package palautettavat;

public class Osallistuja {
	String nimi, kansallisuus;
	int syntymavuosi;
	public Osallistuja() {
	}
	public Osallistuja(String nimi, String kansallisuus, int syntymavuosi) {
		this.nimi = nimi;
		this.kansallisuus = kansallisuus;
		this.syntymavuosi = syntymavuosi;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getKansallisuus() {
		return kansallisuus;
	}
	public void setKansallisuus(String kansallisuus) {
		this.kansallisuus = kansallisuus;
	}
	public int getSyntymavuosi() {
		return syntymavuosi;
	}
	public void setSyntymavuosi(int syntymavuosi) {
		this.syntymavuosi = syntymavuosi;
	}
	@Override
	public String toString() {
		return "Osallistuja [nimi=" + nimi + ", kansallisuus=" + kansallisuus + ", syntymavuosi=" + syntymavuosi + "]";
	}
	
	

}
