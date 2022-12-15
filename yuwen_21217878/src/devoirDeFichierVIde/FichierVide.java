package devoirDeFichierVIde;

public class FichierVide extends Exception {

	// constructeur par défaut
	public FichierVide() {
		super("le fichier est vide");
	}

	// constructeur avec message d'erreur
	public FichierVide(String message) {
		super(message);
	}
}


