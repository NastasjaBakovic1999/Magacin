package Magacin;

import java.util.LinkedList;
import java.util.List;

import Artikli.KancelarijskiMaterijal;
import Artikli.Knjiga;
import Artikli.KucnaHemija;
import Interfaces.MagacinInterfejs;

public class Magacin2 implements MagacinInterfejs {

	private List<Knjiga> knjige = new LinkedList<Knjiga>();
	private List<KucnaHemija> kucnaHemija = new LinkedList<KucnaHemija>();
	private List<KancelarijskiMaterijal> kancelarijskiMaterijal = new LinkedList<KancelarijskiMaterijal>();
	public List<Knjiga> getKnjige() {
		return knjige;
	}
	public void setKnjige(List<Knjiga> knjige) {
		if(knjige == null) {
			throw new IllegalArgumentException("Morate dodati knjige za unos");
		}
		this.knjige = knjige;
	}
	public List<KucnaHemija> getKucnaHemija() {
		return kucnaHemija;
	}
	public void setKucnaHemija(List<KucnaHemija> kucnaHemija) {
		if(kucnaHemija == null) {
			throw new IllegalArgumentException("Morate dodati kucnu hemiju za unos");
		}
		this.kucnaHemija = kucnaHemija;
	}
	public List<KancelarijskiMaterijal> getKancelarijskiMaterijal() {
		return kancelarijskiMaterijal;
	}
	public void setKancelarijskiMaterijal(List<KancelarijskiMaterijal> kancelarijskiMaterijal) {
		if(kancelarijskiMaterijal == null) {
			throw new IllegalArgumentException("Morate dodati kanc materijal za unos");
		}
		this.kancelarijskiMaterijal = kancelarijskiMaterijal;
	}
	

	@Override
	public void DodajKnjigu(Knjiga k) {
		knjige.add(k);
	}

	@Override
	public void DodajKancMaterija(KancelarijskiMaterijal km) {
		if(km == null) {
			throw new IllegalArgumentException("Morate uneti materijal koju zelite da dodate");
		}
		if(kancelarijskiMaterijal.contains(km)) {
			throw new IllegalArgumentException("Materijal se vec nalazi u listi materijala");
		}
		kancelarijskiMaterijal.add(km);
	}

	@Override
	public void DodajKucnuHemiju(KucnaHemija kh) {
		kucnaHemija.add(kh);
	}

	@Override
	public void IzbaciKnjigu(Knjiga k) {
		if(k == null) {
			throw new IllegalArgumentException("Morate uneti knjigu koju zelite da obrisete");
		}
		if(!knjige.contains(k)) {
			throw new IllegalArgumentException("Knjiga se ne nalazi u listi knjiga");
		}
		knjige.remove(k);
	}

	@Override
	public void IzbaciKancMaterija(KancelarijskiMaterijal km) {
		if(km == null) {
			throw new IllegalArgumentException("Morate uneti materijal koju zelite da obrisete");
		}
		if(!kancelarijskiMaterijal.contains(km)) {
			throw new IllegalArgumentException("Materijal se ne nalazi u listi materijala");
		}
		kancelarijskiMaterijal.remove(km);
	}

	@Override
	public void IzbaciKucnuHemiju(KucnaHemija kh) {
		kucnaHemija.remove(kh);
	}

	@Override
	public Knjiga NadjiKnjigu(int sifra) {
		return null;
	}

	@Override
	public KancelarijskiMaterijal NadjiKancMaterija(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KucnaHemija NadjiKucnuHemiju(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}
