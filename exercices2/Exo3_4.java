package exercices2;

import java.util.Arrays;
import java.util.Scanner;

public class Exo3_4 {
    public static void main(String[] args) {
        // declaration des variables
        int compteLettres = 0;
        Scanner entree = new Scanner(System.in);
        char[] mot;
        int position;
        int taille;
        char lettre;

        // parametrage du tableau
        System.out.println("Définissez la taille de la chaine de caractères :");
        taille = entree.nextInt();
        mot = new char[taille];
        System.out.println("Définissez votre chaine de caracteres :");
        for (int i = 0; i < taille; i++) {
            mot[i] = entree.next().charAt(0);
        }

        // recherche de caracteres dans le mot
        System.out.println("Entrez le caractère à rechercher :");
        lettre = entree.next().charAt(0);

        for (int j = 0; j < taille; j++) {
            if (mot[j] != '.') {
                compteLettres++;
            }
        }

        if (compteLettres > 0) {
            position = Arrays.binarySearch(mot, lettre);
            if (position >= 0) {
                for (int k = 0; k < taille; k++) {
                    if (mot[k] == lettre) {
                        System.out.println("La lettree recherchée est en position " + (k + 1));
                    }
                }
            } else {
                System.out.println("La lettre recherchée n'est pas dans le mot");
            }

        } else {
            System.out.println("La chaine est vide !");
        }
        System.out.println("Programme terminé");
        entree.close();
    }
}
