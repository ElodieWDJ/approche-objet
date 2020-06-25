package essaies;

import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		
		//instance de classe
		AdressePostale adresse1 = new AdressePostale();
		adresse1.numeroRue = 1;
		adresse1.libelleRue = "Boulevard Bertrand";
		adresse1.codePostal = 34000;
		adresse1.ville = "Montpellier";
		
		AdressePostale adresse2 = new AdressePostale();;
		adresse2.numeroRue = 2;
		adresse2.libelleRue = "Boulevard Bernard";
		adresse2.codePostal = 75000;
		adresse2.ville = "Paris";
		
		Personne c = new Personne ();
		c.prénom = "Martine";
		c.nom = "Marchand";
		c.adresse = adresse1;
		
		Personne d = new Personne();
		d.prénom = "Marion";
		d.nom = "Pimpin";
		d.adresse = adresse2;
			
	}

}
