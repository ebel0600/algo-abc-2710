package exercices3;

import java.util.Scanner;

public class Exo3_3 {
    public static void main(String[] args) {
        String fable;
        int alphabet[] = new int[24];
        char[] transcription;
        int charToInt;
        char lettre;
        Scanner entree = new Scanner(System.in);

        System.out.println("Ecrivez moi une histoire ! (120 caractères minimum)");
        do {
            fable = entree.nextLine();
            if (fable.length() < 120) {
                System.out.println("Je souhaite lire une histoire longue d'au moins 120 caractères.");
                fable = entree.nextLine();
            }
        } while (fable.length() < 120);
        entree.close();
        transcription = (fable.toLowerCase()).toCharArray();

        for (char value : transcription) {
            for (int i = 0; i < 24; i++) {
                charToInt = value;
                if (charToInt - 97 == i) {
                    alphabet[i]++;
                }
            }
        }

        System.out.println("Voici le nombre d'occurence de chaque lettre de l'alphabet dans cette fable :");
        for(int j = 0; j<24;j++){
            lettre = (char)(j+97);
            if(alphabet[j]>0){
            System.out.println(lettre + " - "+alphabet[j]);
            }
        }

        System.out.println("Programme terminé");
        
    }
}
