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
}
