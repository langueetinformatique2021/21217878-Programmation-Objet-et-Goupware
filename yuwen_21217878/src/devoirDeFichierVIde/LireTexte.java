package devoirDeFichierVIde;

import java.io.*;
import java.util.*;

public class LireTexte {

	private String NomFichier;
	private BufferedReader entree;
	private String ligne;
	private StringTokenizer tok;

	/**
	 * Création d'une nouvelle instance de LireTexte
	 * 
	 * @param ft nom du fichier texte
	 */
	public LireTexte(String ft) {
		NomFichier = ft;
	}

	/**
	 * Ouverture d'un fichier texte, Lecture de la première ligne, Teste si le
	 * fichier est vide
	 * 
	 * @throws IOException Erreur à l'ouverture
	 * @throws FichierVide Fichier vide
	 */

	public void ouvrirFichier() throws IOException {
		LireTexte lecteur = new LireTexte("Nom.txt");

		try {
			// ouvrir le fichier texte
			lecteur.ouvrirFichier();
			// lire la première ligne
			String premiereLigne = lecteur.lirePremiereLigne();
			// afficher la première ligne lue
			System.out.println("La première ligne du fichier est: " + premiereLigne);
			// fermer le fichier texte
			lecteur.fermerFichier();
		} catch (IOException ex) {
			// gérer les erreurs d'entrée/sortie ici...
		} catch (FichierVide ex) {
			// gérer le cas où le fichier est vide ici...
		}
	}
	private String lirePremiereLigne() throws IOException, FichierVide {
		// on lit la première ligne du fichier
		ligne = entree.readLine();
		// on vérifie si la ligne est nulle (fichier vide)
		if (ligne == null) {
			// dans ce cas, on lève une exception pour indiquer que le fichier est vide
			throw new FichierVide("Le fichier " + NomFichier + " est vide");
		}
		// on retourne la ligne lue
		return ligne;
	}
		
		
	

	/**
	 * Clôture le fichier texte ouvert
	 * 
	 * @throws IOException Erreur lors de la fermeture
	 */
	public void fermerFichier() throws IOException {
		entree.close();
	}

	/**
	 * Fermeture du fichier
	 * 
	 * @throws IOException Erreur à la fermeture
	 */
	protected void Fermer() throws IOException {
		entree.close();
	}

	/**
	 * Lecture mot à mot du fichier
	 * 
	 * @return prochain mot
	 * @throws IOException Erreur de lecture
	 */
	public String readWord() throws IOException {

		if (tok.hasMoreTokens()) {
			return tok.nextToken();
		} else {
			ligne = entree.readLine();
			if (ligne == null) {
				return null;
			} else {
				tok = new StringTokenizer(ligne);
				return tok.nextToken();
			}
		}

	}
}
