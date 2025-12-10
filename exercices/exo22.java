package exercices;

/*  EXERCICE 2 : Créer un algo qui affiche successivement les puissances de 2 */
import java.lang.Math;
import java.util.Scanner;

public class exo22 { 
    public static void main(String[] args) {
        
        //declaration de variables
        int MAXIMUMPOWER;
        Scanner entree = new Scanner(System.in);

        //nombre de puissances à afficher
        System.out.println("Veuillez renseigner le nombre de puissances de 2 que vous souhaitez afficher.");
        MAXIMUMPOWER = entree.nextInt();

        //affichage du resultat
        for(int i=1;i<=MAXIMUMPOWER;i++){
            System.out.println("2 puissance "+i+" = "+Math.pow(2,i));
        }

        entree.close();
    }
    
}
