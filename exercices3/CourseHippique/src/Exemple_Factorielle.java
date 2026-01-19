import java.util.Scanner;

public class Exemple_Factorielle {

    public static void main(String[] args) {

        long nbchevaux, res;
        int choix;
        boolean ordre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de chevaux partant ?");
        nbchevaux = sc.nextLong();
        System.out.println("souhaitez-vous jouer :// un tiercé  1 // un quarté  2 // un quinté: 3?");
        choix = sc.nextInt();

        System.out.println("arrivée dnas l'ordre ou desordre ? true/false");
        ordre = sc.nextBoolean();
        switch (choix) {
            case 1:
                if (ordre) {
                    res = Exemple_Factorielle.nbArrangement(3, nbchevaux);
                    System.out.println("vous avez 1 chance de  gagner le tiercé dans l'ordre sur :" + res);

                } else {
                    res = Exemple_Factorielle.nbCombinaison(3, nbchevaux);
                    System.out.println("vous avez 1 chance de  gagner le tiercé dans le desordre sur :" + res);
                }
                break;
            case 2:
                if (ordre) {
                    res = Exemple_Factorielle.nbArrangement(4, nbchevaux);
                    System.out.println("vous avez 1 chance de  gagner le quarté dans l'ordre sur :" + res);

                } else {
                    res = Exemple_Factorielle.nbCombinaison(4, nbchevaux);
                    System.out.println("vous avez 1 chance de  gagner le quarté dans le desordre sur :" + res);
                }
                break;
            case 3:
                if (ordre) {
                    res = Exemple_Factorielle.nbArrangement(5, nbchevaux);
                    System.out.println("vous avez 1 chance de  gagner le quinté dans l'ordre sur :" + res);

                } else {
                    res = Exemple_Factorielle.nbCombinaison(5, nbchevaux);
                    System.out.println("vous avez 1 chance de  gagner le quinté dans le desordre sur :" + res);
                }
                break;
            default:
                System.out.println("Erreur veuillez taper un nombre entier entre 1 et 3 ");
                break;
        }

        sc.close();
    }

    // public static long factorielleClassique(long _nb) {
    // long resultat = _nb;

    // for (int i = 1; i < _nb; i++) {

    // resultat *= i;

    // }
    // return resultat;

    // }

    // public static long factorielleClassique2(long _nb) {
    // long resultat = 1;

    // for (long i = _nb; i > 1; i--) {

    // resultat*=i;

    // }
    // return resultat;

    // }

    public static long factorielleRecursive(long _nb) {
        if (_nb > 1) {
            return _nb * factorielleRecursive(_nb - 1);
        } else {
            return 1;
        }
    }

    public static long nbArrangement(int _nbchevauxJouer, long _nbchevauxPartant) {
        // X = n ! / (n - p) !
        return factorielleRecursive(_nbchevauxPartant)
                / factorielleRecursive(_nbchevauxPartant - (long) _nbchevauxJouer);

    }

    public static long nbCombinaison(int _nbchevauxJouer, long _nbchevauxPartant) { // Y = n ! / (p ! * (n – p) !)
        long resultat = factorielleRecursive(_nbchevauxPartant)
                / (factorielleRecursive(_nbchevauxJouer) * factorielleRecursive(_nbchevauxPartant - _nbchevauxJouer));

        return resultat;

    }

}
