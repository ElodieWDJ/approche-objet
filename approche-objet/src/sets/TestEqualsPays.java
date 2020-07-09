package sets;

public class TestEqualsPays {
	public static void main (String[]args) {
		Pays pays1 = new Pays("",45_687_564, 45000);
		Pays pays2 = new Pays("",45_687_564, 45000);
		
		System.out.println(pays1.equals(pays2));
	}
		
}
