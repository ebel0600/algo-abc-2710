package exercices;

import java.util.Scanner;

public class exo1 {
/*A l'aide de Scanner et Print, me faire afficher le résultat d'une addition de deux entiers        
 * 
 * 
* **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resulat vaut 5
 * 
 * 
 * 
*/
    public static void main(String[] args) {
        // Declaration de variables
        int a;
        int b; 
        Scanner entree = new Scanner(System.in);
        int resultat;

        // entree des valeurs au clavier
        System.out.println("Sélectionner la valeur de A :");
        a = entree.nextInt();
        System.out.println("Sélectionner la valeur de B :");
        b = entree.nextInt();

        // on actualise la valeur resultat
        resultat = a+b;

        // on presente la reponse sur la sortie
        System.out.println("Le résultat de A+B vaut "+resultat+".");

        // fin de l'entree clavier
        entree.close();
    }
}
