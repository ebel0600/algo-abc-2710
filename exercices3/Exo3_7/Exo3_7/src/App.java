
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entree = new Scanner(System.in);
        String recherche;

        String[] abcDev = new String[] { "Salah", "Anthony", "Jimmy", "Simon", "Thibaud", "Etienne", "Isis", "Laydi",
                "Benjamin", "Mathieu", "Steven", "Ozias", "Bilel" };
        int debut = 0, fin = abcDev.length - 1;
        int i = 1;

        // presentation
        Arrays.sort(abcDev);
        System.out.println("Voici l'effectif ABCDev :");
        for (String stagiaire : abcDev) {
            System.out.println(i + " : " + stagiaire);
            i++;
        }
        System.out.println("Qui souhaitez vous rechercher par dichotomie ?");
        recherche = entree.nextLine().toLowerCase();

        while (debut != fin) {
            if (strCompare(recherche, median(abcDev, debut, fin)).equals(recherche)) {
                fin = (fin + debut) / 2;

            } else if (strCompare(recherche, median(abcDev, debut, fin)).equals(median(abcDev, debut, fin))) {
                if ((debut + fin)%2==0) {
                    debut = (debut + fin) / 2;
                }
                else debut = ((debut + fin) / 2)+1;
            }
            System.out.println(recherche + " se trouve entre " + abcDev[debut] + " en poisition "+ (debut+1) +" et " + abcDev[fin] + " en position "+ (fin+1) );
        }

        if (!recherche.equals(median(abcDev, debut, fin).toLowerCase())){
            System.out.println("Mais il ou elle n'existe pas dans la formation !");
        }

        System.out.println("Programme terminé");

        entree.close();

    }

    public static String median(String[] subAbcDev, int debut, int fin) {
        if ((debut + fin) % 2 == 0)
            return subAbcDev[(debut + fin) / 2];
        else
            return subAbcDev[((debut + fin) / 2)+1];
    }

    public static String strCompare(String recherche, String median) {
        int char1, char2;
        int i = 0;
        do {
            char1 = recherche.charAt(i);
            char2 = median.toLowerCase().charAt(i);
            i++;
        } while (char1 == char2 && i < recherche.length() && i < median.length());

        if (char1 < char2) {
            return recherche;
        } else
            return median;
    }
}
