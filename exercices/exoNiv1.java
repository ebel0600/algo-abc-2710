package exercices;

import java.util.Scanner;

/* Niveau 1 : A l'aide d'une boucle, PRINT & SCANNER 
*Créer un système de commande de restauration
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Bonjour, votre commande est avec viande (true) ou vegetarien (false)
 * true
 * 
 * (CETTE QUESTION NE S'AFFICHE PAS SI VOUS AVEZ CHOISI FALSE A LA PREMIERE)
 * Votre steak vous le voulez saignant (true) ou à point (false) ? 
 * false
 * 
 * 
 * Frites (true) ou riz (false)
 * true
 * 
 * 
 * Soda (true) ou eau gazeuse (false)
 * false
 * 
 * 
 * Merci pour votre commande, ça sera près dans 20min,
 * 
 * 
 * 
 */

public class exoNiv1{
    public static void main(String[] args) {
        
        //declaration de variables
        Scanner entree = new Scanner(System.in);   
        boolean reponse;
        String menu="Votre menu se constitue de\n";
        boolean encore=true;
        int preparation=0;

        //Simulation de commande
        while(encore){
            System.out.println("Souhaitez vous un menu viande (true) ou végétarien (false) ?");
            reponse = entree.nextBoolean();

            if(reponse){
                System.out.println("La voulez vous saignante (true) ou à point (false) ?");
                reponse = entree.nextBoolean();
                if(reponse){
                    menu+="Viande saignante\n";
                }
                else{
                    menu+="Viande cuite à point\n";
                }
            }
            else{
                menu+="Végétarien\n";
            }

            System.out.println("Préférez vous du riz (true) ou des frites (false) ?");
            reponse = entree.nextBoolean();
            if(reponse){
                menu+="Riz\n";
            }
            else{
                menu+="Frites\n";
            }

            System.out.println("Eau gazeuse (true) ou Soda (false) ?");
            reponse = entree.nextBoolean();
            if(reponse){
                menu+="Eau Gazeuse\n";
            }
            else{
                menu+="Soda \n";
            }
            System.out.print("Souhaitez vous commander un autre menu ?");
            encore = entree.nextBoolean();

            preparation+=7;
    }
        System.out.println(menu+"Merci d'avoir passé commande ! Elle sera prête en " + preparation + " minutes.");

        entree.close();
    }
}


