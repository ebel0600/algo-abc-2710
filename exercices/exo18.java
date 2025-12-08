package exercices;

/* EXO18 : Avec PRINT & SCANNER : 
 * 
 * 
 * Vous souvenez de l'exercice d'algèbre de Boole de la banque ? Une banque vous accorde un prêt immobilier 
 * si vous répondez aux critères suivants :
 * 
 * condition 1 : Avoir un CDI avec un salaire de plus 3000€/ mois
 * 
 * condition 2 : Avoir un apport de 25% de la somme demandé
 * 
 * condition 3 (Si la condition 1 n'est pas rempli ) : Avoir une autre propriété 
 * valant minimum 75% du prêt demandé
 * 
 * 
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est le montant de votre prêt ?
 * 
 * 150000
 * 
  * Quel est votre salaire ?
 * 
 * 150000
 * 
 * 
 * Êtes-vous en CDI ?
 * 
 * TRUE
 * 
 * Combien avez-vous d'apport ?
 * 
 * 1500
 * 
 * Vous ne pouvez pas hélas obtenir de prêt !

 * 
*/
import java.util.Scanner;

public class exo18 {   

    public static void main(String[] args) {
        // declaration de variables 
        boolean SalaireCDI=true;
        double pret;
        double salaire;
        double apport;
        boolean CDI;
        boolean propriete;
        double valeur_propriete;
        Scanner entree = new Scanner(System.in);

        // entree des valeurs
        System.out.println("Quel est le montant de votre prêt ?");
        pret = entree.nextDouble();

        System.out.println("Quel est votre salaire ?");
        salaire = entree.nextDouble();

        System.out.println("Etes vous en CDI ?");
        CDI = entree.nextBoolean();

        if(salaire < 3000 || !CDI){
            SalaireCDI = false;
        }

        System.out.println("Quel est votre apport ?");
        apport = entree.nextDouble();

        // Determination des resultats
        if(SalaireCDI && apport>pret/4){
            System.out.print("Vous pouvez obtenir un prêt !");
        }
        else if(apport < pret/4){
            System.out.println("Vous ne pouvez pas obtenir de prêt !");
        }
        // Cas de la seconde propriete
        else {
            System.out.println("Disposez vous d'une autre propriété");
            propriete = entree.nextBoolean();
            if(propriete){
                System.out.println("Quel est son montant ?");
                valeur_propriete=entree.nextDouble();
                if(valeur_propriete>=pret*0.75){
                    System.out.println("Vous pouvez obtenir un prêt !");
                }
                else{
                    System.out.println("Vous ne pouvez pas obtenir de prêt !");
                }
            }
            else {
                System.out.println("Vous ne pouvez pas obtenir de prêt !");
            }
        }

        entree.close();
    }
}
    

