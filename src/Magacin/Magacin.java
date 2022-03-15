package Magacin;

import java.util.LinkedList;
import java.util.List;

import Artikli.KancelarijskiMaterijal;
import Artikli.Knjiga;
import Artikli.KucnaHemija;

public class Magacin {
	private List<Knjiga> knjige = new LinkedList<Knjiga>();
	private List<KucnaHemija> kucnaHemija = new LinkedList<KucnaHemija>();
	private List<KancelarijskiMaterijal> kancelarijskiMaterijal = new LinkedList<KancelarijskiMaterijal>();
	public List<Knjiga> getKnjige() {
		return knjige;
	}
	public void setKnjige(List<Knjiga> knjige) {
		this.knjige = knjige;
	}
	public List<KucnaHemija> getKucnaHemija() {
		return kucnaHemija;
	}
	public void setKucnaHemija(List<KucnaHemija> kucnaHemija) {
		this.kucnaHemija = kucnaHemija;
	}
	public List<KancelarijskiMaterijal> getKancelarijskiMaterijal() {
		return kancelarijskiMaterijal;
	}
	public void setKancelarijskiMaterijal(List<KancelarijskiMaterijal> kancelarijskiMaterijal) {
		this.kancelarijskiMaterijal = kancelarijskiMaterijal;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kancelarijskiMaterijal == null) ? 0 : kancelarijskiMaterijal.hashCode());
		result = prime * result + ((knjige == null) ? 0 : knjige.hashCode());
		result = prime * result + ((kucnaHemija == null) ? 0 : kucnaHemija.hashCode());
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
		Magacin other = (Magacin) obj;
		if (kancelarijskiMaterijal == null) {
			if (other.kancelarijskiMaterijal != null)
				return false;
		} else if (!kancelarijskiMaterijal.equals(other.kancelarijskiMaterijal))
			return false;
		if (knjige == null) {
			if (other.knjige != null)
				return false;
		} else if (!knjige.equals(other.knjige))
			return false;
		if (kucnaHemija == null) {
			if (other.kucnaHemija != null)
				return false;
		} else if (!kucnaHemija.equals(other.kucnaHemija))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Magacin [knjige=" + knjige + ", kucnaHemija=" + kucnaHemija + ", kancelarijskiMaterijal="
				+ kancelarijskiMaterijal + "]";
	}
}
