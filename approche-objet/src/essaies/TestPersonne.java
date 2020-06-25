package essaies;

import entites.AdressePostale;

public class TestPersonne {

	public static void main(String[] args) {
		
		//instance de classe
		AdressePostale adresse1 = new AdressePostale(1,"Boulevard Bertrand",34000,"Montpellier");
		AdressePostale adresse2 = new AdressePostale(2,"Boulevard Bernard",75000,"Paris");;
		
		Personne personne1 = new Personne ("Martine","Marchand",adresse1);
		Personne personne2 = new Personne("Marion","Pimpin",adresse2);
	
	//adresse1.showAdresse("");	
	personne1.showNom("");	
	personne1.setPrénom("Jaja");
	personne1.setNom("Dupont");
	personne1.prenomNomMaj();
	
			
	}

}
