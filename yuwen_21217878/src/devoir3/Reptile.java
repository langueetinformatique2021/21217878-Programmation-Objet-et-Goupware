package devoir3;

public abstract class Reptile extends Animal  {
	protected boolean deux_oeils = true ;

	public Reptile(String type, int pattes) {
		super(type, pattes);
		// TODO Auto-generated constructor stub
	}
public void présente() {
	super.présente();
	String etat = (deux_oeils)?"avec deux oeils":"avec trois oeils";
	System.out.println("je suis un animal " + etat +".");
	System.out.println("je suis dans la famille des reptiles.");
	
}
public void nage() {
	System.out.println("je nage hyper vite.");
	
}
}