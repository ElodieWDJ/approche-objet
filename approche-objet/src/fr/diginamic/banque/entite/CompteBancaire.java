package fr.diginamic.banque.entite;

public class CompteBancaire<personne> {

	private String numeroCompte;
	private double solde;
	private personne proprietaire;
	
	//constructeur
	
	public CompteBancaire(String numeroCompte, double solde, personne proprietaire)
    	super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.proprietaire = proprietaire;
}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public personne getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(personne proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	public void crediterMontant() {
		return crediterMontant;
	
	}
	public void debiterMontant() {
		return debiterMontant;
	
	}
	/**
	 * @overide
	 */
	public String toString() {
		return super.toString() + CompteBancaire;
	}
}
