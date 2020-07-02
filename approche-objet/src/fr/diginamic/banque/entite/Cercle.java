package fr.diginamic.banque.entite;

public class Cercle {
	private double rayon;
	
	//constructeur
	public Cercle(double rayon) {
		super ();
		this.rayon = rayon;

	}
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
public double Perimetre() {
		
		double perimetre = (rayon*2)*Math.PI;
		return perimetre;
		
	}
	
public double calculerSurface() {
	
		double surface = Math.PI * rayon * rayon;
		return  surface;
		
	}

}
