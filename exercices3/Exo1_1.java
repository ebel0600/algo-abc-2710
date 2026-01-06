package exercices3;

import java.util.Scanner;

public class Exo1_1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {

        String nombres;
        String[] tab;
        double moyenne;
        double total = 0;
        long conv;
        Scanner entree = new Scanner(System.in);
        double r[];
        double test;
        boolean wannaContinue;
        char saisie;

        do {
            System.out.println("Entrez une série de nombre entiers séparés par un espace");
            while (true) {
                try {
                    nombres = entree.nextLine();
                    tab = nombres.split(" ");
                    r = new double[tab.length];
                    for (int i = 0; i < tab.length; i++) {
                        test = Double.parseDouble(tab[i]);
                        r[i] = test;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println(e.getLocalizedMessage() + " on demande des nombres entiers");
                }
            }

            for (int j = 0; j < r.length; j++) {
                total += r[j];
            }
            // calcul et affichage du resultat
            moyenne = total / r.length;
            moyenne *= 100;
            conv = Math.round(moyenne);
            moyenne = conv;
            moyenne /= 100;

            for (int k = 0; k < tab.length; k++) {
                tab[k] = Math.round(r[k]) + ", ";
            }
            tab[tab.length - 2] = Math.round(r[tab.length - 2]) + " et ";
            tab[tab.length - 1] = Math.round(r[tab.length - 1]) + " ";

            System.out.println("La moyenne de ");
            for (int l = 0; l < tab.length; l++) {
                System.out.print(tab[l]);
            }
            System.out.println("est égale à " + moyenne);

            // voulez vous continuer ?
            System.out.println("Souhaitez vous continuer ? (O/N)");

            while (true) {
                try {
                    saisie = entree.next().charAt(0);
                    if (!(saisie == 'o' || saisie == 'O' || saisie == 'n' || saisie == 'N')) {
                        throw new Exception("Mauvaise saisie !");
                    } else {
                        if (saisie == 'O' || saisie == 'o') {
                            wannaContinue = true;
                        } else {
                            wannaContinue = false;
                        }
                        entree.nextLine();
                        break;
                    }
                } catch (Exception saisieErr) {
                    System.out.println(saisieErr.getMessage()+" saisissez une réponse O ou N");
                }
            }
        } while (wannaContinue == true);

        entree.close();
        System.out.println("Fin du programme");
    }
}
