package exercices3;

import java.util.Scanner;

public class Exo2_2 {
    public static void main(String[] args) throws Exception {
        //declaration des variables
        String x;
        double valeur;
        double resultat;
        double MAXIMUM = 5000000;
        double MINIMUM = -459.67;
        String[] temperature;
        Scanner entree = new Scanner(System.in);

        System.out.println("Entrez une température avec sa valeur (comprise entre -459.67 et 5 000 000) puis son unité (C ou F) avec un espace (ex : 17 C)");
        // fonctionnalité de controle de la saisie
         do {
            try {
                x = entree.nextLine();
                temperature = x.split(" ");
                valeur = Double.parseDouble(temperature[0]);
                if (valeur < MINIMUM || valeur > MAXIMUM) {
                    throw new Exception("Le nombre doit être compris entre -459,67 et 5 000 000");
                }
                if (!(temperature[1].toUpperCase()).equals("C") && !(temperature[1].toUpperCase()).equals("F")) {
                    throw new Exception("Mauvaise saisie d'unité !");
                }
                break;
            } catch (NumberFormatException e) {
                System.out
                        .println(e.getMessage() + " un nombre doit être présenté en premier terme, veuillez réessayer");

            } catch (Exception saisieErr) {
                System.out.println(saisieErr.getMessage() + " veuillez réessayer");
            }

        } while (true);

        // calcul et affichage du resultat
        if ((temperature[1].toUpperCase()).equals("C")) {
            resultat = (valeur * 9 / 5) + 32;
            System.out.println(valeur + " en celsius vaut " + resultat + "°F");
        } else {
            resultat = (valeur - 32) * 5 / 9;
            System.out.println(valeur + " en fahrenheit vaut " + resultat + "°C");
        }

        //fin du programme
        entree.close();
        System.out.println("Programme terminé !");
    }
}
