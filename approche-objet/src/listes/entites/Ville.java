package listes.entites;

import java.util.ArrayList;
import java.util.List;

public class Ville {

	public static class Villes {
		//List<Ville>villes = new ArrayList<>();
		
		
		//villes.add(new Ville("Nice", 343_000));
		//villes.add(new Ville("Carcassonne", 47_800));
		//villes.add(new Ville("Narbonne", 53_400 ));
		//villes.add(new Ville("Lyon", 484_000));
		//villes.add(new Ville("Foix", 9_700 ));
		//villes.add(new Ville("Pau", 7_200));
		//villes.add(new Ville("Marseille", 850_700 ));
		//villes.add(new Ville("Tarbes", 40_600 ));
		
	

		/** nom */
		private String nom;
		
		/** Nombre d'habitants */
		private int nbHabitants;

		/** Constructeur
		 * @param nom nom
		 * @param nbHabitants nombre d'habitants
		 * @return 
		 */
		public void Ville(String nom, int nbHabitants) {
			
			this.nom = nom;
			this.nbHabitants = nbHabitants;
		}

		@Override
		public String toString() {
			return "Nom=" + nom + ", Habitants=" + nbHabitants;
		}

		/** Getter
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}

		/** Setter
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}

		/** Getter
		 * @return the nbHabitants
		 */
		public int getNbHabitants() {
			return nbHabitants;
		}

		/** Setter
		 * @param nbHabitants the nbHabitants to set
		 */
		public void setNbHabitants(int nbHabitants) {
			this.nbHabitants = nbHabitants;
		}

		public static String get(int i) {
			// TODO Auto-generated method stub
			return null;
		}
		
		

	}

	public Ville(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public int getNbHabitants() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNom(String nomVilleMaj) {
		// TODO Auto-generated method stub
		
	}
}

