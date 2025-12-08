package exercices;

/* EXO12 : Avec PRINT & Scanner , vous allez me créer un algo 
 * qui applique une réduction (en pourcentage %) sur un prix (en décimal) donnée :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prix ?
 * 
 * 100.00
 * 
 * Votre réduction (en pourcentage %) ?
 * 
 * 20
 * 
 * 
 * Prix après réduction de 20% :
 * 
 * 80.00
 * 
 * 
 * 
*/

import java.util.Scanner;

public class exo12 {
    public static void main(String[] args) {
        // declaration de variables
        double prix;
        double reduction;
        double resultat;
        Scanner entree = new Scanner(System.in);

        //entree des valeurs
        System.out.println("Votre prix ?");
        prix = entree.nextDouble();

        System.out.println("Votre réduction (en %) ?");
        reduction = entree.nextDouble();

        //on s'assure que la valeur de la reduction soit correcte
        while(reduction < 0 || reduction > 100){
            System.out.println("Valeur incorrecte, veuillez recommencer :");
            reduction = entree.nextDouble();
        }

        // calcul et affichage du resultat
        resultat = prix * (100-reduction)/100;
        System.out.print("Prix après reduction de "+reduction+"% : "+resultat);

        entree.close();
    }
}
