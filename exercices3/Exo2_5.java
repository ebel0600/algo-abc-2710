package exercices3;

import java.util.Random;
import java.util.Scanner;

public class Exo2_5 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // declaration de variables
        Scanner entree = new Scanner(System.in);
        Random alea = new Random();
        int numberIa;
        int numberPlayer;
        int scorePlayer = 0;
        int scoreIA = 0;

        // Deroule du jeu

        do {
            System.out.println("Entrez la valeur de la main que vous souhaitez jouer :");
            numberPlayer = entree.nextInt();
            numberIa = alea.nextInt(3);
            // controle de numberPlayer
            while (numberPlayer > 2) {
                System.out.println("Vous devez entrer une valeur entière de 0 à 2 pour jouer.");
                numberPlayer = entree.nextInt();
            }
            if (numberPlayer < 0) {
                System.out.println("Arrêt du jeu");
                break;
            }

            switch (Math.abs(numberIa - numberPlayer)) {
                case 0 -> System.out.println("J'ai lancé un " + numberIa + "\nEgalité ! pas d'évolution de scores");
                case 1 -> {
                    if (numberIa < numberPlayer) {
                        scoreIA++;
                    } else
                        scorePlayer++;
                    System.out.println("J'ai lancé un " + numberIa + "\nLe plus petit score gagne, donc vous - "
                            + scorePlayer + ", moi - " + scoreIA);
                }
                case 2 -> {
                    if (numberIa > numberPlayer) {
                        scoreIA++;
                    } else
                        scorePlayer++;
                    System.out.println("J'ai lancé un " + numberIa + "\nLe plus grand score gagne, donc vous - "
                            + scorePlayer + ", moi - " + scoreIA);
                }
                default -> System.out.println("Etrange situation !");
            }

        } while (scorePlayer < 10 && scoreIA < 10);

        if (scorePlayer == 10) {
            System.out.println("Vous avez gagné ! Félicitations !");
        }
        if (scoreIA == 10) {
            System.out.println("J'ai gagné ! Vous aurez plus de chance la prochaine fois !");
        }

        entree.close();
        System.out.println("Programme terminé !");
    }
}
