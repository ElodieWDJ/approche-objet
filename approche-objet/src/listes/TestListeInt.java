package listes;

import java.util.ArrayList;import java.util.Arrays;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {
		Integer [] array = {-1,5,7,3,-2,4,8,5};
		
		List<Integer> liste = new ArrayList<>();
		
		liste.addAll(Arrays.asList(array));
	
	System.out.println(liste);
	System.out.println("La taille de la liste est de : " +liste.size());
	
	int max=Integer.MIN_VALUE;
	for (int entier: liste) {
		if (entier>max) {
			max=entier;
		}
	}
	System.out.println("Le maximum est égal à : "+max);
	
	int min=Integer.MAX_VALUE;
	for (int entier: liste) {
		if (entier<min) {
			min=entier;
		}
	}
	System.out.println("Le maximum est égal à : "+min);
	
	
	for (int i = 0; i < liste.size(); i++){
		
		if (liste.get(i)<0);
		
		
		
	
	}
	}
}
