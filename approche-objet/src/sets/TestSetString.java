package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add(" Inde");
		
		System.out.println(set.size());
		System.out.println(set.toString());
		
	
	double maxValue = Double.MIN_VALUE;
	String paysAvecPlusDeLettre = "";
	
		for (String element: set) {
			if (element.length()>maxValue) {
				maxValue = element.length();
				paysAvecPlusDeLettre = element;
			}
			
		}
		System.out.println("Le pays qui compte le plus de lettre est : " + paysAvecPlusDeLettre);
		set.remove(paysAvecPlusDeLettre);
		
		for (String element: set) {
			
		System.out.println(element);
			}
	}	
}

