package exercices;

import java.util.Scanner;

/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * 
 * 
*/

public class exo6 {
    public static void main(String[] args) {
        int age;
        String prenom;
        Scanner entree = new Scanner(System.in);

        System.out.print("Entrez votre prenom :");
        prenom = entree.nextLine();
        System.out.print("Entrez votre age :");
        age = entree.nextInt();

        System.out.print("Je m'appelle "+prenom+", j'ai "+age+" ans.");

        entree.close();
    }   
}
