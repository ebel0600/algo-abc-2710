package exercices3;

import java.util.Scanner;

public class Exo3_3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        // Version personnelle

        String fable;
        String phrase;
        int frequence[] = new int[26];
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

        phrase = fable.toLowerCase();
        phrase = phrase.replace('à', 'a');
        phrase = phrase.replace('é', 'e');
        phrase = phrase.replace('ê', 'e');
        phrase = phrase.replace('è', 'e');
        phrase = phrase.replace('ù', 'u');
        phrase = phrase.replace('ç', 'a');
        phrase = phrase.replace('î', 'i');
        phrase = phrase.replace('â', 'a');
        phrase = phrase.replace('ë', 'e');
        phrase = phrase.replace('ô', 'o');
        transcription = phrase.toCharArray();

        for (char value : transcription) {
            for (int i = 0; i < 26; i++) {
                charToInt = value;
                if (charToInt - 97 == i) {
                    frequence[i]++;
                }
            }
        }

        System.out.println("Voici le nombre d'occurence de chaque lettre de l'alphabet dans cette fable :");
        for (int j = 0; j < 26; j++) {
            lettre = (char) (j + 97);
            if (frequence[j] > 0) {
                System.out.println(lettre + " - " + frequence[j]);
            }
            System.out.println("Programme terminé");
        }
    }
}