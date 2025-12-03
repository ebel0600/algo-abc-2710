package entrainement;

import java.util.Scanner;

public class testBoole {
    
    public static void main(String[] args) {
        // declarations de variable
        boolean A;
        boolean B;
        boolean C;
        boolean resultat;
        Scanner entree = new Scanner(System.in);

        //attribution des valeurs
        System.out.println("Attribuez une valeur booleene a A :");
        A = entree.nextBoolean();
        System.out.println("Attribuez une valeur booleene a B :");
        B = entree.nextBoolean();
        System.out.println("Attribuez une valeur booleene a C :");
        C = entree.nextBoolean();

        // calcul resultat
        resultat = A || B && !C;

        //affichage du resultat
        System.out.println("Si A = "+A+", B = "+B+", et C = "+C+", alors le resultat de A OU B ET NON C est "+resultat);

        entree.close();
    }
}
