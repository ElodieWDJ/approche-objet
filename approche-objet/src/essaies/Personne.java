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
	
	public void prenomNomMaj() {
		System.out.println(nom.toUpperCase() +" "+ pr�nom);
	}
	
	public void setNom(String nvnom) {
		this.nom = nvnom;
		
	}
	
	public void setPr�nom(String nvpr�nom) {
		this.pr�nom = nvpr�nom;
	}
	
	public void setAdresse(AdressePostale nvadresse) {
		this.adresse = nvadresse;
	}
	
	public String showNom(String nvnom) {
		return nvnom + "";
		
	}
	
	public String showPr�nom(String nvpr�nom) {
		return nvpr�nom + "";
		
	}
	public String showAdresse(String nvadresse) {
		return nvadresse + "";
		
	}

}
