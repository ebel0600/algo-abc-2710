package exercices;

/* EXO17 : Avec PRINT & SCANNER : 
 * 
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction 
 * du type de carburant sur une distance en km. 
 * 
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 * 
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 * 
 * carburant par id
 * 
 * Gazole (B7) = 0
 * 
 * Sans Plomb 95 = 1
 * 
 * Sans Plomb 98 (E5) = 2
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le type de votre carburant ?
 * 
 * 0
 * 
 * Vous avez choisi : Gazole 
 * Quel est la distance à parcourir (en km) ?
 * 
 * 150
 * 
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 * 
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 * 
*/

import java.util.Scanner;

public class exo17 {
    
    public static void main(String[] args) {
        //declaration de variables
        double consoGazo = 5.5 * 1.646/100;
        double consoSsP95 = 6.5 * 1.718/100;
        double consoSsP98 = 6.5 * 1.807/100;
        double distance;
        double coef = 0;
        double resultat;
        int type;
        Scanner entree = new Scanner(System.in);

        // entree des valeurs
        System.out.println("Quel est le type de votre carburant ?");
        type = entree.nextInt();

        while(!(type < 3) || !(type >= 0)){
            System.out.println("Carburant inconnu, veuillez choisir un type entre gazole (0), Sans Plomb 95 (1) et Sans Plomb 98 (2).");
            type = entree.nextInt();
        }

        switch (type){
            case 0 : 
                System.out.println("Vous avez choisi Gazole");
                coef = consoGazo;
                break;
            case 1 : 
                System.out.println("Vous avez choisi Sans Plomb 95");
                coef = consoSsP95;
                break;
            case 2 :
                System.out.println("Vous avez choisi Sans Plomb 98");
                coef = consoSsP98;
                break;
        }
           
            System.out.println("Quelle est la distance à parcourir (en km) ?");
            distance = entree.nextDouble();

            // calcul et affichage du résultat
            resultat = distance * coef * 100;
            int resultatConv;
            resultatConv = (int) resultat;
            resultat = resultatConv;
            resultat /= 100;
            System.out.print("Pour "+ distance +" kms, vous allez dépenser en moyenne "+ resultat +"euros.");

            entree.close();
    }
}
