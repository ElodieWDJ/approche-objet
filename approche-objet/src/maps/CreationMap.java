package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import listes.entites.Ville.Villes;

public class CreationMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Paul", 1750);
		map.put("Hicham", 1825);
		map.put("Yu", 2250);
		map.put("Ingrid", 2015);
		map.put("Chantal", 2418);

			System.out.println(map.size());
			
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Iterator<Integer> valueIte = map.values().iterator();
		while (valueIte.hasNext()){
			Integer ville = valueIte.next();
		}
	}
	

}
