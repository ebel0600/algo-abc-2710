package exercices;

/* EXO20 : Avec PRINT & SCANNER : 
 * 
 * Vous allez créer un algo de sondage pour des élections, 
 * la candidate Joseline Inutile et le candidat Vincent Escreau pour la mairie de Mulhouse.
 * Vous avez 150 000 votants, donnez le nombre de votant pour Escreau et pour Inutile, et le nombre de vote blanc
 * Si le total des votes n'est pas atteint, les votes manquants seront comptés blanc
 * Si le total de vote est supérieur aux nombres de votants alors il y a une erreur
 * Puis calculez en pourcentage en fonction du nombres de votants ( ceux qui n'ont pas voter blanc)
 * Le score en pourcentage, le gagnant doit avoir plus de 60% sinon il devra y avoir un second tour :
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de gens ont voté pour Joseline Inutile ?
 * 
 * 100 000
 * 
* Combien de gens ont voté pour Vincent Escreau ?
 * 
 * 20 000
 * 
* Vous avez 30 000 d'abstentions, ils seront compté nul
 * 
 * 
 * Joseline Inutile : 66.7%
 * 
 * Vincent Escreau : 33.3%
 * 
 * 
 * Joseline Inutile est la nouvelle maire de Mulhouse
 * 
 * 
*/

import java.util.Scanner;

public class exo20{
    public static void main(String[] args) {

        //declaration variables
        int totalVotants = 150000;
        int votantsJI;
        int votantsVE;
        int votesBl;
        Scanner entree = new Scanner(System.in);
        double coefJI;
        double coefVE;
        int conv;

        //entree des valeurs
        System.out.println("Combien ont voté pour Joselyne ?");
        votantsJI=entree.nextInt();
        System.out.println("Combien ont voté pour Vincent ?");
        votantsVE=entree.nextInt();

        while(votantsJI+votantsVE>totalVotants){
            System.out.println("Erreur de saisie, veuillez recommencer en saisissant les votants de Joselyne, puis Vincent.");
            votantsJI=entree.nextInt();
            votantsVE=entree.nextInt();
        }

        //traitement des votes blancs
        votesBl = totalVotants-(votantsJI+votantsVE);
        System.out.println("Il y a "+votesBl+" votes blancs, ils seront comptés nuls.");

        //calcul pourcentages
        coefJI = ((double)votantsJI/((double)votantsJI+(double)votantsVE))*100;
        conv = (int) coefJI*100;
        coefJI = conv;
        coefJI/=100;
        coefVE = 100 - coefJI;

        if(!(coefJI>60||coefVE>60)){
            System.out.print("Passage au second tour !");
        }
        else if(coefJI>coefVE){
            System.out.print("Joselyne Utile est la nouvelle maire de Mulhouse avec " + coefJI+ "% des votes.");
        }
        else{
            System.out.print("Vincent Escreau est le nouveau maire de Mulhouse avec "+ coefVE + "% des votes.");
        }

        entree.close();
    }
}