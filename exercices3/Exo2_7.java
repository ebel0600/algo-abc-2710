package exercices3;

import java.util.Scanner;

public class Exo2_7 {
    public static void main(String[] args){

        Scanner entree = new Scanner(System.in);
        int[] tabAge = new int[20];
        int jeunes = 0;
        String djeuns="";
        String adultes="";

        System.out.println("Entrez l'age de 20 personnes.");
        for (int i = 0; i < tabAge.length; i++) {
            tabAge[i] = entree.nextInt();
            entree.nextLine();
        }
        for (int j = 0; j<tabAge.length;j++) {
            if(tabAge[j]<20){
                jeunes++;
            }
        }
        entree.close();
        if(jeunes == 20){
            System.out.println("Toutes les personnes ont moins de 20 ans.");
        }
        else if(jeunes == 0){
            System.out.println("Toutes les personnes ont plus de 20 ans.");
        }
        else{
            for(int k = 0; k < tabAge.length; k++){
                if(tabAge[k]<20){
                    djeuns+=tabAge[k]+" ";
                }
                else{
                    adultes+=tabAge[k]+" ";
                }
            }
            System.out.println("Liste des personnes jeunes :\n"+djeuns+"\nListe de personnes non-jeunes :\n"+adultes);
        }

        System.out.println("Programme terminé");

    }
}
