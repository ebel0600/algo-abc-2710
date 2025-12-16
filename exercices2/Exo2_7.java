package exercices2;

import java.util.Scanner;

public class Exo2_7 {
    public static void main(String[] args) {
        //déclaration de variables
        double distance;
        Scanner entree = new Scanner(System.in);
        double resultat;
        int conv; 

        //affectation de la variable distance
        System.out.println("Entrez une distance entre 0,01 et 100 000kms");
        distance = entree.nextDouble();
        while(distance <0.01 || distance > 100000){
            System.out.println("Saisie incorrecte, veuillez recommencer :");
            distance = entree.nextDouble();
        }
        entree.close();

        //calcul et affichage du resultat
        resultat = distance / 1.609;
        resultat *=100;
        conv = (int) resultat;
        resultat = conv;
        resultat/=100;

        System.out.println(distance+"km vaut "+resultat+"miles.");
    }
}
