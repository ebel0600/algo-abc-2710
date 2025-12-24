package exercices2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exo3_1 {

    public static void main(String[] args) {
        Random alea = new Random();
        int solution = alea.nextInt(101);
        Scanner entree = new Scanner(System.in);
        int nbEssais = 0;
        int essai=0;
        int position;
        int minimum = 0;
        int maximum = 100;
        int[] tableau = new int[101];

        for (int i = 0; i < 101; i++) {
            tableau[i] = i;
        }

        position = Arrays.binarySearch(tableau, solution);

        System.out.println("Jouons à un jeu : devinez le nombre que j'ai choisi entre 0 et 100");

        woopDaLoop: do {
            while (true) {
                try {
                    essai = entree.nextInt();
                    if (essai > maximum || essai < minimum) {
                        throw new Exception("Chiffre en dehors de la plage demandée");
                    }
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage() + ", veuillez réessayer :");
                    continue woopDaLoop;
                }
            }

            nbEssais++;
            if (essai > (position+1)) {
                maximum = essai;
                System.out.println("Mauvaise réponse, mon nombre est entre" + minimum + " et " + maximum + ", réessaie !");
                essai = entree.nextInt();
            }
            if (essai < (position+1)){
                minimum = essai;
                System.out.println("Mauvaise réponse, mon nombre est entre" + minimum + " et " + maximum + ", réessaie !");
                essai = entree.nextInt();
            }

        } while (essai != solution);

        System.out.println("Bravo, vous avez trouvé en " + nbEssais + " essais.");
        entree.close();
    }

}
