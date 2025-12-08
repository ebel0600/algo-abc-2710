package exercices;

/* EXO19 : Avec PRINT & SCANNER : 
 * 
 * 
 * Me créer un convertisseur de secondes au format heures : minutes : secondes
 * 
 * 
 * 
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 * 
* Combien de secondes ?
 * 
 * 156000
 * 
 * 156 000 secondes correspond à 43 heures, 20 minutes et 0 seconde
 * 
 * 
 * 
*/

import java.util.Scanner;

public class exo19 {   

    public static void main(String[] args) {
        // declaration de variable
        int heures;
        int minutes;
        int secondes;
        int temps;
        Scanner entree = new Scanner(System.in);

        //entree de valeur
        System.out.println("Choisissez une période en secondes");
        temps = entree.nextInt();

        heures = temps/3600;
        minutes = (temps%3600)/60;
        secondes = temps%60;

        //affichage du resultat 
        System.out.println(temps+"secondes valent "+heures+":"+minutes+":"+secondes);

        entree.close();

    }
    
}
