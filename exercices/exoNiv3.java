package exercices;

import java.util.Scanner;

/* Niveau 3 : A l'aide d'une boucle, PRINT & SCANNER 
*Imiter un distributeur de banque qui s'arrête uniquement 
quand vous appuyez, terminer(0). Voici les commandes suivantes

0 - Terminer
1 - Retirer
2 - Afficher compte
3 - Déposer

vous avez droit à un découvert de maximum 500€
Vous ne pouvez déposer minimum 5€ et une somme divisible par 5 (vu que c'est des billets)
Vous pouvez retirer qu'en multiple de 10


 * Vous avez 2000€ sur votre compte
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bienvenu sur votre compte bancaire, que puis-je faire pour vous :
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 1
 * 
 * Combien voulez-vous retirer ?:
 * 500€
 * 
 * Opération acceptée : 500€ ont été retiré,
 *  voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 2
 * 
 * Vous avez actuellement 1500€ sur votre solde
 *  voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 3
 * 
 * Combien voulez-vous retirer ?:
 * 577€
 * 
 * Désolé vous ne pouvez déposer que des billets
 * Voulez-vous autres-choses ?
 * (0)Quitter
 * (1)Retirer de l'argent
 * (2)Consulter votre solde
 * (3)Déposer de l'argent
 * 
 * 0
 * 
 * Merci de votre visite, au revoir :) !
 * 
 * 
 * 
 * 
 */

public class exoNiv3 {
    public static void main(String[] args) {
        int choix;
        int solde = 2000;
        int montant;
        Scanner entree = new Scanner(System.in);


        System.out.println("Bienvenue sur votre compte bancaire, que puis-je faire pour vous ?");
        do{
            System.out.println("(0)Quitter\n" + "(1)Retirer de l'argent\n" + "(2)Consulter votre solde\n" + "(3)Déposer de l'argent");
            choix = entree.nextInt();

            switch(choix){
                case 0:
                    System.out.println("Merci de votre visite, au revoir !");
                    break;
                case 1:
                    System.out.println("Combien souhaitez-vous retirer ?");
                    montant = entree.nextInt();
                    while(!(montant%10==0 && montant > 0)){
                        System.out.println("Somme demandée non conforme, veuillez entrer un multiple de 10.");
                        montant = entree.nextInt();
                    }
                    if(montant > solde){
                        System.out.println("Désolé, votre solde est insuffisant !");
                    }
                    else{
                        solde-=montant;
                        System.out.println("Vous avez retiré "+montant+" euros, il vous reste "+solde+" euros sur votre compte.");
                    }
                    System.out.println("Voulez-vous autre chose ?");
                    break;
                case 2:
                    System.out.println("Vous avez "+solde+" euros sur votre compte.");
                    System.out.println("Voulez-vous autre chose ?");
                    break;
                case 3:
                    System.out.println("Combien souhaitez-vous déposer ?");
                    montant = entree.nextInt();
                    while(!(montant%5==0 && montant > 0)){
                        System.out.println("Somme non conforme, veuillez rentrer un multiple de 5 à remettre en billets.");
                        montant = entree.nextInt();
                    }
                    solde+=montant;
                    System.out.print("Vous avez déposé "+montant+" euros, vous avez maintenant "+solde+" euros sur votre compte.");
                    System.out.println("Voulez-vous autre chose ?");
                    break;
                default : System.out.println("Commande inconnue");
                }             
        }while (choix!=0);
        entree.close();
    }
}