package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetPays {

	public static void main(String[] args) {
		HashSet<Pays> set = new HashSet<>();
		
		set.add(new Pays("USA", 45687564, 45 ));
		set.add(new Pays("France", 3645768, 73 ));
		set.add(new Pays("Allemagne", 6377489, 36 ));
		set.add(new Pays("UK", 585636868, 98 ));
		set.add(new Pays("Italie", 85685889, 76 ));
		set.add(new Pays("Japon", 54886796, 23 ));
		set.add(new Pays("Chine", 57980000, 12 ));
		set.add(new Pays("Russie", 65476588, 92 ));
		set.add(new Pays("Inde", 568678769, 65 ));
		
		
		

	}

}
