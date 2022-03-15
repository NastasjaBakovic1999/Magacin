package Artikli;

import java.util.Date;

public class KucnaHemija {
	private String Naziv;
	private int Sifra;
	private String Opis;
	private int Kolicina;
	private Date RokTrajanja;
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
	public Date getRokTrajanja() {
		return RokTrajanja;
	}
	public void setRokTrajanja(Date rokTrajanja) {
		RokTrajanja = rokTrajanja;
	}
}
