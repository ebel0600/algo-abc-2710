import java.util.*;

public class Frequence_lettre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alphabet = new char[26];
        int[] tabfrequence = new int[26];
        String phrase = "Ses nombreuses pattes, lamentablement grêles par comparaison avec la corpulence qu'il avait par ailleurs,; grouillaient désespérément sous ses yeux.";

        do {
            System.out.println("Veuillez saisir une Phrase d'au moins 120 caractères !");
            phrase = sc.nextLine();

        } while (phrase.length() < 120);

        phrase = phrase.toLowerCase();
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

        char lettre = 'a';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = lettre;
            lettre++;
        }
        // GestionTab.afficherTableau(alphabet);
        for (int i = 0; i < tabfrequence.length; i++) {
            tabfrequence[i] = 0;
        }
        // GestionTab.afficherTableau(tabfrequence);
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < phrase.length(); j++) {

                if (alphabet[i] == phrase.charAt(j)) {

                    tabfrequence[i]++;

                }

            }

        }
        // for (int i = 0; i < tabfrequence.length; i++) {
        // if (tabfrequence[i]!=0) {

        // System.out.println("La lettre :"+ alphabet[i] + " est présente :"+
        // tabfrequence[i]+ " fois dans la phrase saisie. " );
        // }
        // }

        String[][] alphaFrequence = new String[26][2];

        for (int i = 0; i < alphabet.length; i++) {
            alphaFrequence[i][0] = "" + alphabet[i];
        }

        for (int i = 0; i < alphabet.length; i++) {
            alphaFrequence[i][1] = "" + tabfrequence[i];
        }
        for (String[] soustableau : alphaFrequence) {
            if (GestionTab.plusGrandQue(soustableau[1], "0"))
            System.out.println("lettre alphabet: " + soustableau[0] + " Fréquence d'apparition :" + soustableau[1]);
        }

        // GestionTab.triBulleTableau(alphaFrequence);

        boolean permut;
        do {
            permut = false;
            for (int i = 0; i < alphabet.length - 1; i++) {
                if (GestionTab.plusGrandQue(alphaFrequence[i][1], alphaFrequence[i + 1][1])) {
                    String tempFreq = alphaFrequence[i + 1][1];
                    String tempAlpha = alphaFrequence[i + 1][0];
                    alphaFrequence[i + 1][1] = alphaFrequence[i][1];
                    alphaFrequence[i + 1][0] = alphaFrequence[i][0];
                    alphaFrequence[i][1] = tempFreq;
                    alphaFrequence[i][0] = tempAlpha;
                    permut = true;
                }
            }
        } while (permut == true);

        System.out.println("\n -------------------- \n Après tri par effectif croissant");
        for (String[] soustableau : alphaFrequence) {
            if (GestionTab.plusGrandQue(soustableau[1], "0"))
                System.out.println("lettre alphabet: " + soustableau[0] + " Fréquence d'apparition :" + soustableau[1]);
        }

        sc.close();
    }

}
