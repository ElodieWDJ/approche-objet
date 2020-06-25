package entites;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		
		//variables locales
		AdressePostale a = new AdressePostale();
		a.numeroRue = 1;
		a.libelleRue = "Boulevard Bertrand";
		a.codePostal = 34000;
		a.ville = "Montpellier";
		
		AdressePostale b = new AdressePostale();;
		b.numeroRue = 2;
		b.libelleRue = "Boulevard Bernard";
		b.codePostal = 75000;
		b.ville = "Paris";
	}

}
