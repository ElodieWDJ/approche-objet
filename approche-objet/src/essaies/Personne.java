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
	
	public void prenomNomMaj() {
		System.out.println(nom.toUpperCase() +" "+ prénom);
	}
	
	public void setNom(String nvnom) {
		this.nom = nvnom;
		
	}
	
	public void setPrénom(String nvprénom) {
		this.prénom = nvprénom;
	}
	
	public void setAdresse(AdressePostale nvadresse) {
		this.adresse = nvadresse;
	}
	
	public String showNom(String nvnom) {
		return nvnom + "";
		
	}
	
	public String showPrénom(String nvprénom) {
		return nvprénom + "";
		
	}
	public String showAdresse(String nvadresse) {
		return nvadresse + "";
		
	}

}
