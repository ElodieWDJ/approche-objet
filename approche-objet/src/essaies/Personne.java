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
	
	public String getIdentite() {
		return nom.toUpperCase() +" "+ prénom;
	}

	public void getNom() {
		this.nom = nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	public AdressePostale getAdresse() {
		return adresse;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}
	

}
