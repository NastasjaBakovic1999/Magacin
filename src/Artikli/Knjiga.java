package Artikli;

public class Knjiga {
	private String Naziv;
	private int Sifra;
	private String Opis;
	private int Kolicina;
	public String getNaziv() {
		return Naziv;
	}
	public void setNaziv(String naziv) {
		Naziv = naziv;
	}
	public int getSifra() {
		return Sifra;
	}
	public void setSifra(int sifra) {
		Sifra = sifra;
	}
	public String getOpis() {
		return Opis;
	}
	public void setOpis(String opis) {
		Opis = opis;
	}
	public int getKolicina() {
		return Kolicina;
	}
	public void setKolicina(int kolicina) {
		Kolicina = kolicina;
	}
}
