package exercices3;

import java.util.Scanner;

public class Exo3_5 {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);
        String phrase, dernier;
        char[] tabChar;
        boolean isPalindrome = true;

        System.out.println("Définissez votre chaine de caracteres :");
        // controle du point en dernier caractère
        do {
            phrase = entree.nextLine().toLowerCase();
            dernier = phrase.substring(phrase.length() - 1);
            if (!dernier.equals(".")) {
                System.out.println("La phrase doit se terminer par un point, veuillez recommencer.");
            }
        } while (!dernier.equals("."));
        entree.close();

        tabChar = (phrase.replaceAll("\\s+", "")).toCharArray();
        if (tabChar.length == 1) {
            System.out.println("La chaine est vide.");
        } else {
            for (int i = 0; i < tabChar.length / 2; i++) {
                if (tabChar[i] != tabChar[tabChar.length - (i + 2)]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("La phrase est un palindrome");
            } else
                System.out.println("La phrase n'est pas un palindrome");

            System.out.println("Programme terminé");
        }

    }
}
