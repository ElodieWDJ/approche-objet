package essaies;

import entites.AdressePostale;

public class Personne {
	
	public String nom;
	public String pr�nom;
	public AdressePostale adresse;
	
	//constructeur avec param�tres
	
	public Personne (String nvnom,String nvpr�nom,AdressePostale nvadresse) {
		this.nom = nvnom;
		this.pr�nom = nvpr�nom;
		this.adresse = nvadresse;
	}

}
