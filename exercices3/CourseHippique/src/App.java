
import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entree = new Scanner(System.in);
        int chevauxPartants, chevauxJoues;
        BigInteger probaOrdre, probaDesordre;

        System.out.println("Combien de chevaux sont en ligne de départ ?");
        chevauxPartants = entree.nextInt();
        entree.nextLine();
        System.out.println("Sur combien de chevaux allez vous parier ?");
        chevauxJoues = entree.nextInt();
        entree.close();

        probaOrdre = factoriel(chevauxPartants).divide(factoriel(chevauxPartants - chevauxJoues));
        probaDesordre = factoriel(chevauxPartants).divide(factoriel(chevauxJoues).multiply(factoriel(chevauxPartants - chevauxJoues)));

        System.out.println("Vos chances de gagner dans sont de :\n1 sur " + probaOrdre + " dans l'ordre\net 1 sur "
                + probaDesordre + " dans le désordre\nProgramme terminé !");

    }

    public static BigInteger factoriel(int nombre) {
        BigInteger resultat1, resultat2;
        resultat1 = BigInteger.ONE;
        resultat2 = resultat1;

        if (nombre == 1) {
            return resultat1;
        } else
            for (int i = 1; i <= nombre; i++) {
                resultat2 = resultat2.multiply(BigInteger.valueOf(i));
            }
        return resultat2;

    }

}
