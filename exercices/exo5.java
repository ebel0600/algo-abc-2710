package exercices;

import java.util.Scanner; 

public class exo5 {

    public static void main(String[] args) {
        /* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser par C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/
        // declaration de variables
        int a;
        int b;
        int c;
        Scanner entree = new Scanner(System.in);
        int equation;

        // saisie des valeurs
        System.out.println("Sélectionner la valeur de A :");
        a = entree.nextInt();
        System.out.println("Sélectionner la valeur de B :");
        b = entree.nextInt();
        System.out.println("Sélectionner la valeur de C :");
        c = entree.nextInt();

        //calcul
        equation=a*b/c;

        //presentation resultat
        System.out.println("Le resultat de a*b/c vaut "+equation+".");

        //condition de positionnement à 10
        if(equation>10){
            System.out.println("Le resultat est superieur a 10.");
        }
        else{
            System.out.println("Le resultat est inferieur ou egal a 10.");
        }

        entree.close();
    }

}