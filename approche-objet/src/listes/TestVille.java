package listes;

import java.util.ArrayList;
import java.util.List;

import listes.entites.Ville;

public class TestVille {

	public static void main(String[] args) {
		
		List<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343_000));
		villes.add(new Ville("Carcassonne", 47_800));
		villes.add(new Ville("Narbonne", 53_400));
		villes.add(new Ville("Lyon", 484_000));
		villes.add(new Ville("Foix", 9_700));
		villes.add(new Ville("Pau", 77_200));
		villes.add(new Ville("Marseille", 850_700));
		villes.add(new Ville("Tarbes", 40_600));
		villes.add(new Ville("Pau", 77_200));
		
		// Recherchez et affichez la ville la plus peupl�e	
		Ville plusGrandeVille = villes.get(0);
		for (Ville ville: villes) {
			if (ville.getNbHabitants()>plusGrandeVille.getNbHabitants()) {
				plusGrandeVille = ville;
			}
		}
		System.out.println("Ville la plus peupl�e: "+ plusGrandeVille);
		
		// Supprimez la ville la moins peupl�e
		Ville villeMoinsPeuplee = villes.get(0);
		for (Ville ville: villes) {
			if (ville.getNbHabitants()<villeMoinsPeuplee.getNbHabitants()) {
				villeMoinsPeuplee = ville;
			}
		}
		villes.remove(villeMoinsPeuplee);
		
		System.out.println("\nAffichage apr�s suppression de la ville la moins peupl�e:");
		for (Ville ville: villes) {
			System.out.println(ville);
		}
		
		// Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules
		for (Ville ville: villes) {
			if (ville.getNbHabitants()>100_000) {
				String nomVille = ville.getNom();
				String nomVilleMaj = nomVille.toUpperCase();
				ville.setNom(nomVilleMaj);
			}
		}
		
		System.out.println("\nAffichage apr�s mise en MAJ des villes de + de 100 000 Habs:");
		for (Ville ville: villes) {
			System.out.println(ville);
		}
		
	}
	}


