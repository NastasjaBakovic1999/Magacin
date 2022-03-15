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
		if(naziv == null || naziv.isEmpty()) {
			throw new IllegalArgumentException("Naziv ne moze biti prazan");
		}
		Naziv = naziv;
	}
	public int getSifra() {
		return Sifra;
	}
	public void setSifra(int sifra) {
		if(sifra<0) {
			throw new IllegalArgumentException("Sifra ne moze biti manja od 0");
		}
		Sifra = sifra;
	}
	public String getOpis() {
		return Opis;
	}
	public void setOpis(String opis) {
		if(opis == null || opis.isEmpty()) {
			throw new IllegalArgumentException("Opis ne moze biti prazan");
		}
		Opis = opis;
	}
	public int getKolicina() {
		return Kolicina;
	}
	public void setKolicina(int kolicina) {
		if(kolicina<0) {
			throw new IllegalArgumentException("Kolicina ne moze biti manja od 0");
		}
		Kolicina = kolicina;
	}
	public Date getRokTrajanja() {
		return RokTrajanja;
	}
	public void setRokTrajanja(Date rokTrajanja) {
		RokTrajanja = rokTrajanja;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Kolicina;
		result = prime * result + ((Naziv == null) ? 0 : Naziv.hashCode());
		result = prime * result + ((Opis == null) ? 0 : Opis.hashCode());
		result = prime * result + ((RokTrajanja == null) ? 0 : RokTrajanja.hashCode());
		result = prime * result + Sifra;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		if (Kolicina != other.Kolicina)
			return false;
		if (Naziv == null) {
			if (other.Naziv != null)
				return false;
		} else if (!Naziv.equals(other.Naziv))
			return false;
		if (Opis == null) {
			if (other.Opis != null)
				return false;
		} else if (!Opis.equals(other.Opis))
			return false;
		if (RokTrajanja == null) {
			if (other.RokTrajanja != null)
				return false;
		} else if (!RokTrajanja.equals(other.RokTrajanja))
			return false;
		if (Sifra != other.Sifra)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "KucnaHemija [Naziv=" + Naziv + ", Sifra=" + Sifra + ", Opis=" + Opis + ", Kolicina=" + Kolicina
				+ ", RokTrajanja=" + RokTrajanja + "]";
	}
}
