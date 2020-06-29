package fr.diginamic.banque.entite;

public class LivretEpargne extends Compte {
	private double taux;
		public LivretEpargne(String numeroCompte, double soldeCompte, double taux) {
			super(numeroCompte, soldeCompte);
			this.taux = taux;
		}

}
