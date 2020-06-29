package fr.diginamic.banque;

import fr.diginamic.banque.entite.Compte;
import fr.diginamic.banque.entite.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte cpt = new Compte("123A", 200.2);
		System.out.println(cpt);
		
		Compte [] tabComptes = new Compte[2];//Je créer un tableau de compte de longueur = 2
		tabComptes[0] = new Compte("A0001", 3000.0);//Compte normal
		tabComptes[1] = new CompteTaux("A0001", 3000.0, -150.0, 0.15);//Compte avec taux
		
		
		
		for (int i = 0; i<= tabComptes.length-1;i++) {
			 System.out.println(tabComptes[i]);
		}

	}

}
