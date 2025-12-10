package exercices;
 
/*  EXERCICE 1 : Créer un algo qui définit si la valeur A est supérier ou égale à B */

import java.util.Scanner;

public class exo21 {
    public static void main(String[] args) {
        // declaration des variables
        Scanner entree = new Scanner(System.in);
        int A;
        int B;

        System.out.println("Entrez la valeur de A (nombre entier).");
        A = entree.nextInt();
        System.out.println("Entrez la valeur de B (nombre entier).");
        B = entree.nextInt();

        if(A>B){
            System.out.println("A est supérieur à B.");
        }
        else{
            System.out.println("A est inférieur ou égal à B");
        }

        entree.close();
    }
}
