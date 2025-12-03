package exercices;

import java.util.Scanner;

public class exo3 {

    public static void main(String[] args) {
        /* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
*/
        // declaration de variables
        int a;
        int b;
        Scanner entree = new Scanner(System.in);
        int resultat;

        // saisie des valeurs
        System.out.println("Sélectionner la valeur de A :");
        a = entree.nextInt();
        System.out.println("Sélectionner la valeur de B :");
        b = entree.nextInt();

        // actualisation du resultat
        resultat = a+b;

        //presentation du resultat
        System.out.println("Le résultat de A+B vaut "+resultat+".");

        //condition paire/impaire
        if(resultat%2==0){
            System.out.println("Ce résultat est pair.");
        }
        else{
            System.out.println("Ce résultat est impair.");
        }

        entree.close();


    }
    
}
