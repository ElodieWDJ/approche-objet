package fr.diginamic.banque.entite;

public class Rectangle {

		private double largeur;
	    private double hauteur;
	    
	  //constructeur
	    public Rectangle(double largeur, double hauteur) {
	    	super ();
	    	this.largeur = largeur;
	        this.hauteur = hauteur;
	    }
	    public void setLargeur(double largeur) {
	        this.largeur = largeur;
	    }
	 
	    public double getLargeur() {
	        return largeur;
	    }
	 
	    public void setHauteur(double hauteur) {
	        this.hauteur = hauteur;
	    }
	 
	    public double getHauteur() {
	        return hauteur;
	    }
	 
	    public double calculerSurface() {
	    	double surface = largeur * hauteur;
	        return (surface);
	    }
	    
	    public double calculerPerimetre() {
	    	double perimetre = (2 * (largeur + hauteur));
	        return perimetre;
	    }
	    
	   
	}


