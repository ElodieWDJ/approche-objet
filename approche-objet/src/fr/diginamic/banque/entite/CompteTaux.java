package fr.diginamic.banque.entite;

public class CompteTaux extends Compte {
	
	private double taux;

	public CompteTaux(double tauxderemuneration, String numCompte, double soldeCompte) {
		super(numCompte, soldeCompte);
		
		this.taux = taux;
		
	}
	/**
	 * @overide
	 */
	public String toString() {
		return super.toString() +" - taux = " + taux;
	}

	public double getTauxderemuneration() {
		return taux;
	}

	public void setTauxderemuneration(double taux) {
		this.taux = taux;
	}

}
