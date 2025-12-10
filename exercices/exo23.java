package exercices;

 /*  EXERCICE 3 : Vérifier si les 3 entrée ( A ou B ) ET C sont vrai* , afficher sa sortie */

import java.util.Scanner;

public class exo23 {

    public static void main(String[] args) {
        //declaration de variables
        boolean A;
        boolean B;
        boolean C;
        Scanner entree = new Scanner(System.in);
        boolean resultat;

        //entree des valeurs
        System.out.println("Entrez la valeur de A");
        A = entree.nextBoolean();
        System.out.println("Entrez la valeur de B");
        B = entree.nextBoolean();
        System.out.println("Entrez la valeur de C");
        C = entree.nextBoolean();


        //affichage des entrees
        if(A){
            System.out.println("A est Vrai");
        }
        else{
            System.out.println("A est Faux");
        }
        if(B){
            System.out.println("B est Vrai");
        }
        else{
            System.out.println("B est Faux");
        }if(C){
            System.out.println("C est Vrai");
        }
        else{
            System.out.println("C est Faux");
        }

        //calcul et affichage du resultat
        resultat = A || B & !C;

        if(resultat){
            System.out.println("A OU B ET NON C est Vrai.");
        }
        else{
            System.out.println("A OU B ET NON C est Faux.");
        }

        entree.close();
    }
}