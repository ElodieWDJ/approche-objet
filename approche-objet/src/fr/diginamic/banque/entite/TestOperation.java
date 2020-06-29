package fr.diginamic.banque.entite;

public class TestOperation {

	Operation[] operations = new Operation[4];
	Operation[0] = new Credit("15/03/2020", 3000.0);
	Operation[1] = new Debit("15/04/2020", 1500.0);
	Operation[2] = new Credit("15/03/2020", 5000.0);
	Operation[3] = new Debit("15/03/2020", 2500.0);
	
	double solde = 0.0;
	for (int i = 0; i<operation.length; i++) {
		System.out.println(operations[i]);
		
		
		if (operations[i].getType().equals("credit")) {
			solde += operations[i].getMontant();
		} else {
			solde -= operations[i].getMontant();
		}
		System.out.println("Solde général=" + solde);
	}
	
}
}
