package exercices;

/* EXO14 : Avec PRINT & SCANNER : Tester l'expression algèbrique booléenne A OU B ET NON C
 * 
 * A , B ou C sont des booléens et ne peuvent être qu'égale à TRUE ou FALSE.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une valeur A OU B ET NON C
 * 
 * FALSE
 * TRUE
 * FALSE
 * 
 * Résultat : TRUE
 * 
 * 
*/

import java.util.Scanner;

public class exo14 {

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
