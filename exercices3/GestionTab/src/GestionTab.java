
import java.util.*;

public class GestionTab {

    public static void trierTableau(int[] _tableau) {
        int encours, pluspetit, temp, j;

        for (encours = 0; encours < _tableau.length - 1; encours++) {
            pluspetit = encours;
            for (j = encours + 1; j < _tableau.length; j++) {
                if (_tableau[j] <= _tableau[pluspetit]) {
                    pluspetit = j;
                }
            }
            temp = _tableau[encours];
            _tableau[encours] = _tableau[pluspetit];
            _tableau[pluspetit] = temp;
        }
    }

    public static void triBulleTableau(int[] monTab) {
        boolean permut;
        int passage = 0;
        do {

            permut = false;

            for (int i = 0; i < monTab.length - 1; i++) {

                if (monTab[i] > monTab[i + 1]) {
                    int temp = monTab[i + 1];
                    monTab[i + 1] = monTab[i];
                    monTab[i] = temp;

                    permut = true;
                }

            }
            passage++;

        } while (permut == true);
    }

    public static void remplirTableau(int[] _tableau) {
        Random aleas = new Random();

        for (int i = 0; i < _tableau.length; i++) {

            _tableau[i] = aleas.nextInt(101);

        }

    }

    public static void afficherTableau(int[] _tableau) {
        System.out.print("\n[ ");
        for (int element : _tableau) {
            System.out.print(element + " ");

        }
        System.out.print("]\n");

    }

}