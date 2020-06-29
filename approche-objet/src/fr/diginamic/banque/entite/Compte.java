package fr.diginamic.banque.entite;
/**
 * 
 * @author perse
 *
 */
public class Compte {
	
	private String numCompte;
	private double soldeCompte;
	
	public Compte(String numCompte, double soldeCompte) {
		super();
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}
	@Override
    public String toString() {
        return "numero de compte: " + this.numCompte + " | solde: " + this.soldeCompte;
    }
	
/**
 * 
 * @return
 */
	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

}
