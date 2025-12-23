package exercices3;

import java.util.Random;
import java.util.Scanner;

public class Exo2_5 {
    public static void main(String[] args) {
        // declaration de variables
        Scanner entree = new Scanner(System.in);
        Random alea = new Random();
        int numberIa;
        int numberPlayer;
        int scorePlayer = 0;
        int scoreIA = 0;

        // Deroule du jeu
        
        jeu: do {
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
                break jeu;
            }

            if (numberPlayer > numberIa) {
                switch (numberPlayer - numberIa) {
                    case 1:
                        scoreIA++;

                        System.out.println("J'ai lancé un " + numberIa + "\nJe gagne la manche : vous " + scorePlayer + " - moi " + scoreIA);
                        break;
                    case 2:
                        scorePlayer++;
                        System.out.println("J'ai lancé un " + numberIa + "\nVous gagnez la manche : vous " + scorePlayer + " - moi " + scoreIA);
                        break;
                    default:
                        System.out.println(("Situation inconnue"));
                }
            } else if (numberIa > numberPlayer) {
                switch (numberIa - numberPlayer) {
                    case 1:
                        scorePlayer++;
                        System.out.println("J'ai lancé un " + numberIa + "\nVous gagnez la manche : vous " + scorePlayer + " - moi " + scoreIA);
                        break;
                    case 2:
                        scoreIA++;
                        System.out.println("J'ai lancé un " + numberIa + "\nJe gagne la manche : vous " + scorePlayer + " - moi " + scoreIA);
                        break;
                    default:
                        System.out.println(("Situation inconnue"));
                }
            } else {
                System.out.println("J'ai lancé un " + numberIa + "\nEgalité : vous " + scorePlayer + " - moi " + scoreIA);
            }

        } while (scorePlayer < 10 && scoreIA < 10);

        if(scorePlayer == 10){
            System.out.println("Vous avez gagné ! Félicitations !");
        }
        if(scoreIA == 10){
            System.out.println("J'ai gagné ! Vous aurez plus de chance la prochaine fois !");
        }

        entree.close();
        System.out.println("Programme terminé !");
    }
}
