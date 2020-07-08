package sets;

public class Pays {

		private String nom;
		private Integer nbHabitants;
		private Integer pibHabitant;
		public Pays(String nom, Integer nbHabitants, Integer pibHabitant) {
			
			this.nom = nom;
			this.nbHabitants = nbHabitants;
			this.pibHabitant = pibHabitant;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public Integer getNbHabitants() {
			return nbHabitants;
		}
		public void setNbHabitants(Integer nbHabitants) {
			this.nbHabitants = nbHabitants;
		}
		public Integer getPibHabitant() {
			return pibHabitant;
		}
		public void setPibHabitant(Integer pibHabitant) {
			this.pibHabitant = pibHabitant;
		}

	

}
