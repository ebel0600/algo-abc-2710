package exercices;

/* EXO16 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me faire un algo qui change le prix d'un vol selon les paramètres suivants :
 * 
 * Réduction de 20% si le passager est mineur
 * 
 * Réduction de 40% si le passager est senior de plus 60 ans
 * 
 * Réduction de 20% si il y a plus de 60 places disponibles
 * 
 * Augmentation de 20% si il y a moins de 20 places disponibles
 * 
 * Augmentation de 20% si le passager a choisit la classe business 
 * 
 * -----Vous définisserez vous même le prix initial du vol, le nombre de place disponible, l'âge du voyageur
 * 
 * Si le voyageur a choisi une classe business
 * 
 * 
 *  * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Quel est l'âge de votre passager ?
 * 
 * 15
 * 
 * Le passager veut-il une classe business (oui/non) ?
 * 
 * oui
 * 
 * Le prix du vol :
 * 
 * 1200
 * 
 * Nombre de places disponibles :
 * 
 * 50
 * 
 * Le prix du vol est de 1200 euros
 * 
 * 
*/

import java.util.Scanner;

public class exo16 {

public static void main(String[] args) {
    
    // declaration des variables
    Scanner entree = new Scanner(System.in);
    float coef = 1;
    int age;
    int places;
    String business;
    float prix;
    float resultat;


    //entree des valeurs
    System.out.println("Quel est l'âge de votre passager ?");
    age = entree.nextInt();

    if(age <18){
        coef-=0.2;
    }
    else if(age > 60){
        coef-=0.4;
    }

    System.out.println("Le passager veut-il une classe business (oui/non) ?");
    //debug
    entree.nextLine();
    business = entree.nextLine();
    while(!(business.equals("oui")||business.equals("non"))){
        System.out.print("Veuillez entrer une réponse adéquate : ");
        business = entree.nextLine();
    }
    if(business.equals("oui")){
        coef+=0.2;
    }

    System.out.println("Le prix du vol : ");
    prix = entree.nextFloat();

    System.out.println("Nombre de places disponibles :");
    places = entree.nextInt();

    if(places <20){
        coef+=0.2;
    }
    else if(places > 60){
        coef-=0.2;
    }


    // conversion a deux decimaux
    resultat = prix*coef*100;
    int resultatConv;
    resultatConv = (int) resultat;
    resultat = resultatConv;
    resultat /= 100;

    System.out.print("Le vol coutera "+resultat+" Euros.");

    entree.close();
}
    
}
