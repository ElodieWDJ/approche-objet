package entites;

public class AdressePostale {
	public int numeroRue;
	public String libelleRue;
	public int codePostal;
	public String ville;
	
//constructeur par d�faut
	
public AdressePostale() {
	
}

//constructeur avec param�tres

public AdressePostale (int nvnumeroRue, String nvlibelleRue, int nvcodePostal, String nvville){
	this.numeroRue = nvnumeroRue;
	this.libelleRue = nvlibelleRue;
	this.codePostal = nvcodePostal;
	this.ville = nvville;
	
}


}
