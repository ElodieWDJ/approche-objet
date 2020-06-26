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
	
	public String getIdentite() {
		return nom.toUpperCase() +" "+ pr�nom;
	}

	public void getNom() {
		this.nom = nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPr�nom() {
		return pr�nom;
	}

	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}

	public AdressePostale getAdresse() {
		return adresse;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	

}
