package exercices3;

import java.util.Scanner;

public class Exo3_4 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        //declaration de variables
        int[] tableau;
        int taille;
        int permuteur;
        Scanner entree = new Scanner(System.in);

        //parametrage du tableau
        System.out.println("Veuillez attribuer une taille de tableau");
        taille = entree.nextInt();
        entree.nextLine();
        tableau = new int[taille];
        System.out.println("Remplissez le tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("en position " + i);
            tableau[i] = entree.nextInt();
            entree.nextLine();
        }

        // tri par ordre croissant
        for (int k = 0; k < tableau.length; k++) {
            for (int j = k; j < tableau.length; j++) {
                if (tableau[k] > tableau[j]) {
                    permuteur = tableau[j];
                    tableau[j] = tableau[k];
                    tableau[k] = permuteur;
                }

            }
        }

        //affichage du tableau
        System.out.println("Voici le tri du tableau :");
        for (int l = 0; l < tableau.length; l++) {
            System.out.println(tableau[l]);
        }

        entree.close();
    }

}
