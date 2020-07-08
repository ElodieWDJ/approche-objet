package sets;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		Set<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		System.out.println(set);
		System.out.println(Collections.max(set));
		set.remove(Collections.min(set));
		
		Iterator<Double> iterator = set.iterator();
		while (iterator.hasNext()) {
			Double myUser = iterator.next();
			System.out.println(myUser);
		}
		
	}

}
