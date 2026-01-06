package exercices3;

import java.util.Scanner;

public class Exo3_4 {
    public static void main(String[] args) {
        int[] tableau;
        int taille;
        int permuteur;
        Scanner entree = new Scanner(System.in);

        System.out.println("Veuillez attribuer une taille de tableau");
        taille = entree.nextInt();
        entree.nextLine();
        tableau = new int[taille];

        System.out.println("Remplissez le tableau :");
        for(int i = 0; i<tableau.length; i++){
            System.out.println("en position "+i);
            tableau[i] = entree.nextInt();
            entree.nextLine();
        }

        //recherche du plus petit élément
        permuteur = tableau[0];
        for(int j=0; j<tableau.length;j++){
            if(permuteur > tableau[j]){
                permuteur = tableau[j];
                tableau[j] = tableau[0];
                tableau[0] = permuteur;
            }
        }

        for (int l = 0; l < tableau.length; l++) {
            System.out.println(tableau[l]);
        }

    }
    
}
