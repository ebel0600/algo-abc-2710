package exercices2;

import java.lang.Math;
import java.util.Scanner;

public class Exo2_7 {
    public static void main(String[] args) {
        // déclaration de variables
        String chaineresult;
        Scanner entree = new Scanner(System.in);
        double resultat;
        double conversion;
        double test = 0;

        // affectation de la variable de distance
        forbreak: do {
            System.out.println(
                    "Entrez une distance entre 0,01 et 100 000 a convertir en miles ou Km suivi d'un espace et de l'unité K ou M.\nSélectionnez q pour terminer le programme.");
            chaineresult = entree.nextLine();
            String[] tabchaine = chaineresult.split(" ");
            // on teste la bonne saisie de chaineresult
            if (!(tabchaine[0].equals("q"))) {
                try {
                    test = Double.parseDouble(tabchaine[0]);
                } catch (NumberFormatException e) {
                    System.out.println("Erreur : " + e.getMessage() + " n'est pas valide.");
                    continue forbreak;
                }
            } else {
                break forbreak;
            }

            if (Double.parseDouble(tabchaine[0]) < 100000 && Double.parseDouble(tabchaine[0]) > 0.01) {
                switch (tabchaine.length) {
                    case 1:
                        // si on met une distance sans unite de mesure
                        resultat = Double.parseDouble(chaineresult) / 1.609;
                        resultat *= 100;
                        conversion = Math.round(resultat);
                        resultat = conversion;
                        resultat /= 100;
                        System.out.println("La conversion en miles est de " + resultat);
                        break;
                    // avec une unite de mesure
                    case 2:
                        if ((tabchaine[1].toUpperCase()).equals("M")) {
                            resultat = Double.parseDouble(tabchaine[0]) * 1.609;
                            resultat *= 100;
                            conversion = Math.round(resultat);
                            resultat = conversion;
                            resultat /= 100;
                            System.out.println("La conversion en kilometres est de :" + resultat);
                            break;
                        } else if (tabchaine.length > 1 && (tabchaine[1].toUpperCase()).equals("K")) {
                            resultat = Double.parseDouble(tabchaine[0]) / 1.609;
                            resultat *= 100;
                            conversion = Math.round(resultat);
                            resultat = conversion;
                            resultat /= 100;
                            System.out.println("La conversion en miles est de " + resultat);
                            break;
                        }
                    default:
                        System.out.println("Erreur de saisie");
                        break;
                }
            } else {
                System.out.println("Valeur en dehors de la plage autorisée");
            }
        } while (!chaineresult.equals("q"));

        System.out.println("Programme terminé");
        entree.close();

    }
}
