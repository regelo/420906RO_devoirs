package dev4q1;

import java.util.Scanner;

public class Devoir4Q1 {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		float valeur_lue = 0;
		do {
			System.out.print("Entrez une valeur flottante >=-5 et <=+5 : ");
			boolean tampon_contient_flottant = clavier.hasNextFloat();
			if (tampon_contient_flottant == true) {
				valeur_lue = clavier.nextFloat();
				// On enlève le '\n' qui traîne
				clavier.nextLine();
			}
			else {
				// On enlève les caractères incorrects
				clavier.nextLine();
			}
			
		} while (valeur_lue <-5 || valeur_lue > 5);
		
		clavier.close();
		
		System.out.println("La valeur lue est " + valeur_lue);
	}

}
