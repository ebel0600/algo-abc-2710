package exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* Niveau 2 : A l'aide d'une boucle, PRINT & SCANNER 
*Me faire un système de listing pour de vos courses alimentaires
Les afficher à la fin avec le coût total de vos courses et demander si vous voulez supprimer un article de votre course
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, que voulez vous acheter ? :
 * Farine
 * 
 * Combien, ça côute ?:
 * 1.45
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Oeufs
 * 
 * Combien, ça côute ?:
 * 2.54
 * 
 * Voulez-vous acheter autre choses (true/false)?
 * true
 * 
 * Que voulez vous acheter ?
 * Lait
 * 
 * Combien, ça côute ?:
 * 1.30
 * 
    * Voulez-vous acheter autre choses (true/false)?
 * false
 * 
 * 
 * Récapitulatif de vos courses :
 * 
 * -Oeufs , 1.45 euros
 * -Farine , 2.54 euros
 * -Lait , 1.30 euros
 * 
 * Total de vos courses : 5,29€
 * 
 * 
 * 
 */

   public class exoNiv2 {
      public static void main(String[] args) {

         //declaration de variables
         int i = 0;
         String achat="";
         double prix;
         double total=0;
         int eur;
         boolean encore;
         Scanner entree = new Scanner(System.in);
         int retrait;

         //processus d'achats
         do{
            if(i==0){
               System.out.println("Bonjour, que voulez vous acheter ?");
            }
            else{
               System.out.println("Que voulez vous acheter ?");
            }
            achat +=entree.nextLine()+": ";

            System.out.println("A quel prix ?");
            prix = entree.nextDouble();
            entree.nextLine();
            total +=prix;
            achat += prix+" euros\n";

            System.out.println("Souhaitez vous continuer (true/false)?");
            encore = entree.nextBoolean();
            entree.nextLine();
            i++;
         }while(encore);

            //limitation du total a deux decimaux
            total*=100;
            eur = (int) total;
            total = eur;
            total /=100;

            //affichage de resultat
            System.out.println("Pour récapituler, vous achetez \n"+achat+"\nTotal : "+total+" euros. \nSouhaitez vous retirer un article (true/false)?");
            encore = entree.nextBoolean();
            entree.nextLine();
            List<String> listeAchat = new ArrayList<String>(Arrays.asList(achat.split("\n")));

            //procedure de retrait d'articles dans un tableau de caractères delimite par un saut a la ligne
               while(encore){
               System.out.println("Choisissez l'article à retirer :");
               retrait = entree.nextInt();
               

               while(retrait > i){
                  System.out.println("Saisie incorrecte, veuillez entrer une ligne de la liste (de 1 à "+i+").");
                  retrait = entree.nextInt();
               }

               for(int j=retrait; j<i;j++){
                  listeAchat.set(j-1,achat.split("\n")[j]);
               }
               listeAchat.remove(i-1);
               
              i--;

              System.out.println("Il vous reste "+i+" articles. Souhaitez vous en retirer un autre ?");
              encore = entree.nextBoolean();
            }

            System.out.println("Voici ce que vous avez acheté :");
            for (int j=0; j<i;j++){
               System.out.println(listeAchat.get(j));
            } 
            System.out.println("Nous vous en remercions, à bientôt !");

         entree.close();
      }
      
   }