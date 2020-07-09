package sets;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Pays {

	private Object nbHabitant;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nbHabitants == null) ? 0 : nbHabitants.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((pibHabitant == null) ? 0 : pibHabitant.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Pays))
			return false;
		
		Pays other = (Pays) obj; //downcasting
		
		EqualsBuilder builder = new EqualsBuilder();
		return builder.append(this.nom,  other.getNom())
			   .append(this.nbHabitant, other getNbHabitant())
			  
			   .append(this.pibHabitant, other getPibHabitant())
			   .isEquals();
		boolean resultat;
		return resultat;
	
		
				
		if (nbHabitants == null) {
			if (other.nbHabitants != null)
				return false;
		} else if (!nbHabitants.equals(other.nbHabitants))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (pibHabitant == null) {
			if (other.pibHabitant != null)
				return false;
		} else if (!pibHabitant.equals(other.pibHabitant))
			return false;
		return true;
	}

	private Object other() {
		// TODO Auto-generated method stub
		return null;
	}

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
