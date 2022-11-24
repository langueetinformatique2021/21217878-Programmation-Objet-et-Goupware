package devoir4;

public class TestCercle {
	public static void  main(String[] args) {
		Cercle o1 = new Cercle("blue",8);
		Cercle o2 = new Cercle("yellow",5);
		System.out.println("the first cercle");
		o1.afficher();
		System.out.println("the second  cercle");
		o2.afficher();
		o1.compare(o2);
		
		
	}

}
