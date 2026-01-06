package exercices3;

import java.util.Scanner;

public class Exo1_10 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int nombres;
        int diviseurs = 1;
        int parfait = 0;
        int compteur = 0;
        Scanner entree = new Scanner(System.in);

        System.out.println("Veuillez le nombre de parfaits que vous souhaitez afficher :");
        nombres = entree.nextInt();
        while(compteur<nombres){
            for(int j=1;j<(diviseurs/2)+1;j++){
                if(diviseurs%j == 0 ){
                    parfait += j;
                }
            }
            if (parfait == diviseurs){
                System.out.print(diviseurs+" ");
                compteur++;
            }
            parfait = 0;
            diviseurs ++;
            
        }
        entree.close();
        System.out.println("\nProgramme terminé !");
    }
}
