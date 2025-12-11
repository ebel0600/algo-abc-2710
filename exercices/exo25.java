package exercices;

import java.util.Scanner;

public class exo25 {
    public static void main(String[] args) {
        // declaration de variables
        Scanner entree = new Scanner(System.in);
        int facto;
        int resultat = 1;

        //entree de la valeur de factorielle
        System.out.println("Entrez la valeur de factorielle à calculer :");
        facto = entree.nextInt();

        //calcul du resultat
        for(int i=1; i<= facto; i++){
            resultat *= i;
        }

        //affichage du resultat
        System.out.print("Factorielle de "+facto+" = "+resultat);
        entree.close();
    }   
}