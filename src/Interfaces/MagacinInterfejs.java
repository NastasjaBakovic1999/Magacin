package Interfaces;

import Artikli.KancelarijskiMaterijal;
import Artikli.Knjiga;
import Artikli.KucnaHemija;

public interface MagacinInterfejs {

	public void DodajKnjigu(Knjiga k);
	public void DodajKancMaterija(KancelarijskiMaterijal km);
	public void DodajKucnuHemiju(KucnaHemija kh);
	
	public void IzbaciKnjigu(Knjiga k);
	public void IzbaciKancMaterija(KancelarijskiMaterijal km);
	public void IzbaciKucnuHemiju(KucnaHemija kh);
	
	public Knjiga NadjiKnjigu(int sifra);
	public KancelarijskiMaterijal NadjiKancMaterija(int sifra);
	public KucnaHemija NadjiKucnuHemiju(int sifra);
}
