package exercices;

import java.util.Scanner; 

public class exo2 {

    /* EXO2 : A l'aide de Scanner et Print, me faire afficher le résultat d'une soustraction (types entiers) 
    et vérifier si elle est inférieur à 0    
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a - b
 * 
 * resultat = -1
 * 
 * resutat est inférieur à 0
 * 
 * 
 * 
 */
    public static void main(String[] args) {
        
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

        // calcul du resultat de la soustraction
        resultat = a-b;


        //on presente la reponse selon son positionnement par rapport a 0
        if(resultat<0){
            System.out.println("Le résultat de A - B est inférieur à 0."); 
        }
        else{
            System.out.println("Le résultat de A - B vaut "+resultat+".");
        }

        entree.close();

    }

    
}
