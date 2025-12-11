package exercices;

import java.util.Scanner;

public class exo27 {
    public static void main(String[] args) {
        //declaration de variables
        int prix;
        int total=0;
        int paiement;
        int billets10;
        int billet5;
        int euros;
        Scanner entree = new Scanner(System.in);

        //procédure d'encaissement
        System.out.println("Veuillez encaisser vos articles (terminez la procédure en appuyant sur 0");
        do{
            prix = entree.nextInt();
            while(prix<0){
                System.out.println("Nous ne payons pas les gens à recevoir nos articles ! Entrez une valeur entière positive :");
                prix = entree.nextInt();
            }       
            total += prix;
        }while (prix!=0);

        System.out.println("Vous achetez pour un total de "+total+" euros. Quelle somme souhaitez vous avancer ?");
        paiement = entree.nextInt();

        while(paiement<total){
            System.out.println("Somme insuffisante, veuillez l'éditer pour payer vos achats");
            paiement = entree.nextInt();
        }

        if(paiement > total){
            billets10 = (paiement-total)/10; 
            billet5 = (paiement-total)%10/5; 
            euros = (paiement-total)%5; 

            System.out.println("Nous vous rendons :");
            while(billets10 > 0){
                System.out.println("Billet de 10");
                billets10--;
            }
            while(billet5 > 0){
                System.out.println("Billet de 5");
                billet5--;
            }
            while(euros > 0){
                System.out.println("1 euro");
                euros--;
            }
        }

        entree.close();

    }
}
