package exercices2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exo3_1 {
    
    public static void main(String[] args) {
        Random alea = new Random();
        int solution = alea.nextInt(100);
        Scanner entree = new Scanner(System.in);
        int nbEssais=0;
        int essai;
        int position;
        String fourchette;
        int[] tableau = new int[101];

        for(int i = 0; i < 101; i++){
            tableau[i]=i;
        }
        
        position = Arrays.binarySearch(tableau, solution);
        if(position <25){
            fourchette = "entre 0 et 24";
        }
        if(position<50){
            fourchette = "entre 25 et 49";
        }
        if(position<75){ 
            fourchette = "entre 50 et 74";
        }
        else{
            fourchette = "entre 75 et 100";
        }

        System.out.println("Jouons à un jeu : devinez le nombre que j'ai choisi entre 0 et 100");
        essai = entree.nextInt();
        while(essai>100 || essai<0){
            System.out.println("Chiffre en dehors de la plage demandée ! réessaie :");
            essai = entree.nextInt();
        }
        do{
            nbEssais++;
            if(essai!=solution){
                System.out.println("Mauvaise réponse, mon nombre est "+fourchette+", réessaie !");
                essai = entree.nextInt();
            }
            
        }while(essai!=solution);

        System.out.println("Bravo, vous avez trouvé en "+nbEssais+" essais.");
        entree.close();
    }

}
