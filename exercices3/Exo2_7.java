package exercices3;

import java.util.Scanner;

public class Exo2_7 {
    public static void main(String[] args){

        Scanner entree = new Scanner(System.in);
        int[] tabAge = new int[20];
        int jeunes = 0;

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
        System.out.println("Parmi ces 20 personnnes, "+jeunes+" d'entres elles sont jeunes.\nProgramme terminé.");

    }
}
