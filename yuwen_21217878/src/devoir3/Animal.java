package devoir3;

/** Création et gestion d'animaux */
public abstract class Animal {
	private String espèce;
	private int NumPattes;

	/**
	 * création d'une nouvelle instance de la classe Animal
	 * 
	 * @param type   nom de l'espèce
	 * @param pattes nombre de pattes  on change jamais le superclasse,pour acceder sur espece et patte est de changer la superclasse,
	 */
	public Animal(String type, int pattes) {
		espèce = type;
		NumPattes = pattes;
	}

	/** présentation des caractéristiques de l'animal */
	public void présente() {
		System.out.println("je suis un représentant de l'espèce des " + espèce + " et j'ai " + NumPattes + " pattes");
	}

	/** cri de l'animal */
	
	public abstract void nage();
	
	public void move(){
		System.out.println("Animals can move");
	}
}