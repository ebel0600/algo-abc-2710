package exercices2;

import java.util.Scanner;

public class Exo3_4 {
    public static void main(String[] args) {
        // declaration des variables
        int compteLettres = 0;
        Scanner entree = new Scanner(System.in);
        String phrase;
        String dernier;
        char lettre;
        String positions = "";
        String resultat;
        char[] lettres;
        int occurences = 0;

        // parametrage du tableau

        System.out.println("Définissez votre chaine de caracteres :");
        // controle du point en dernier caractère
        do {
            phrase = entree.nextLine();
            dernier = phrase.substring(phrase.length() - 1);
            if (!dernier.equals(".")) {
                System.out.println("La phrase doit se terminer par un point, veuillez recommencer.");
            }
        } while (!dernier.equals("."));

        // recherche de caracteres dans le mot
        System.out.println("Entrez le caractère à rechercher :");
        lettre = entree.nextLine().charAt(0);
        lettres = phrase.toCharArray();
        for (int i = 0; i < lettres.length; i++) {
            if (lettres[i] != '.') {
                compteLettres++;
            }
        }

        // si la chaine n'est pas vide
        if (compteLettres > 0) {
            for (int k = 0; k < lettres.length; k++) {
                if (lettres[k] == lettre) {
                    positions += (k + 1) + ", ";
                    occurences++;
                }
            }
            // calcul du resultat
            if (positions.length() > 0) {
                resultat = positions.substring(0, positions.length() - 2);
            } else {
                resultat = positions;
            }

            // affichage du resultat
            if (resultat.length() > 0) {
                System.out.println(
                        "La lettre recherchée est trouvée " + occurences + " fois en position : " + resultat + ".");

            } else {
                System.out.println("La lettre recherchée n'est pas dans la chaine.");
            }
        } else {
            System.out.println("La chaine est vide !");
        }
        System.out.println("Programme terminé");
        entree.close();

    }
}