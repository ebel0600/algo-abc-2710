package exercices2;

import java.util.Scanner;

public class Exo1_4 {
    public static void main(String[] args) {
        double S;
        double interet;
        int annees;
        double resultatSimple;
        double resultatCompo;
        Scanner entree = new Scanner(System.in);

        System.out.println("Entrez la valeur de la somme");
        S = entree.nextDouble();
        System.out.println("Entrez la valeur de l'intérêt");
        interet = entree.nextDouble();
        System.out.println("Entrez vos années de placement");
        annees = entree.nextInt();

        resultatSimple = S*(1+(interet*annees));
        resultatCompo = S*Math.pow(1+interet, annees);

        System.out.printf("Interet simple = %.2f, interet composé %.2f", resultatSimple, resultatCompo);
        entree.close();
    }
}
