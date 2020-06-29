package fr.diginamic.banque.entite;

public class Credit extends Operation {

	public Credit(String date, double montant) {
		super (date, montant);
		
		public String getCredit() {
			return "Credit";
		}
		
	}

}
