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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Kolicina;
		result = prime * result + ((Naziv == null) ? 0 : Naziv.hashCode());
		result = prime * result + ((Opis == null) ? 0 : Opis.hashCode());
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
		Knjiga other = (Knjiga) obj;
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
		if (Sifra != other.Sifra)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Knjiga [Naziv=" + Naziv + ", Sifra=" + Sifra + ", Opis=" + Opis + ", Kolicina=" + Kolicina + "]";
	}
	
	
}
