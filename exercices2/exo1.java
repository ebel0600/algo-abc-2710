package exercices2;

import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        //declaration de variables
        int A;
        int B;
        double moyenne;
        Scanner entree = new Scanner (System.in);
        
        //entree des valeurs
        System.out.println("Entrez la valeur de A");
        A = entree.nextInt();
        System.out.println("Entrez la valeur de B");
        B = entree.nextInt();
        entree.close();

        //calcul de la moyenne :
        moyenne = (((double)A+(double)B)/2);

        System.out.printf("La moyenne de A et B est de %.2f",moyenne);

    }
    
}
