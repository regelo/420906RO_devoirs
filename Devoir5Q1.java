package dev5q1;

import java.util.Scanner;

public class Dev5Q1 {

	public static void main(String[] args) {
		Scanner lecteur = new Scanner(System.in);

		// Création du tableau statique
		final int NB_VALEURS = 5;
		int[] tableau = new int[NB_VALEURS];
		
		// On a besoin de NB_VALEURS entières valides entrées au clavier
		for(int i=0 ; i<tableau.length ; i++) {
			
			// On boucle tant que la valeur entrée est invalide
			boolean valeur_entree_valide = false;
			int valeur = 0;
			do {
				System.out.print("Entrez la valeur entière #" + i + " : ");
				if (lecteur.hasNextInt()) {
					valeur = lecteur.nextInt();
					// On vide le tampon du '\n' qui traîne
					lecteur.nextLine();
				}
				else {
					// On vide le tampon des mauvais caractères
					lecteur.nextLine();
				}	
			} while(valeur_entree_valide == false);
			
			// On ajoute la valeur valide au tableau
			tableau[i] = valeur;
		}
		
		lecteur.close();
		
		// Affichage des valeurs entrées
		for(int i=0 ; i<tableau.length ; i++) {
			System.out.println("Valeur à la case #" + i + " est " + tableau[i]);
		}
	}

}
