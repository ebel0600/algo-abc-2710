package exercices;

/* EXO11 : Avec PRINT & Scanner , vous allez simuler un distributeur de banque :
 * 
 * Vous avez 3000€ sur votre compte, créer un algo qui retire un montant sur votre compte banquaire
 * votre solde ne peut pas être négatif
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, combien voulez-vous retirer ?
 * 
 * 3500
 * 
 * Opération refusée, fond insuffissant !
 * 
 * 
*/

import java.util.Scanner;

public class exo11 {
    public static void main(String[] args) {
        
        //declaration de variables
        Scanner entree = new Scanner(System.in);
        int fonds = 3000; //maximum autorise
        int retrait;

        System.out.println("Bonjour, combien souhaitez vous retirer (max 3000) ? ");
        retrait = entree.nextInt();

        //test d'adequation entre retrait et max
        if(retrait > fonds){
            System.out.print("Impossible : fonds insuffisants !");
        }
        else{
            //on affiche le resultat
            fonds-=retrait;
            System.out.print("Vous retirez "+retrait+" euros, il vous reste "+fonds+" euros.");
        }

        entree.close();
    }
}
