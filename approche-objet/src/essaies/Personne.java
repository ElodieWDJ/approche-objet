package essaies;

import entites.AdressePostale;

public class Personne {
	
	public String nom;
	public String prénom;
	public AdressePostale adresse;
	
	//constructeur avec paramétres
	
	public Personne (String nvnom,String nvprénom,AdressePostale nvadresse) {
		this.nom = nvnom;
		this.prénom = nvprénom;
		this.adresse = nvadresse;
	}

}
