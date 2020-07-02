package listes;

import java.util.ArrayList;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>();
		liste.add("Nice");
		liste.add("Carcassonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");
		
		String ref = liste.get(0);
		for (int i=0;i<liste.size();i++){
			String ville = liste.get(i);
			if (ville.length()>ref.length()){
				ref = ville;
			}
		}
		System.out.println(ref);
		
		for (int i = 0; i<villes.size();i++) {
			String ville = Villes.get(i);
			String villeMaj = ville.toUpperCase();
			villes.set(i,villeMaj);
		}
	}

}
