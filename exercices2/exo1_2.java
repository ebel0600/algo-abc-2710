package exercices2;

import java.util.Scanner;
import java.lang.Math;

public class exo1_2 {
    public static void main(String[] args) {
        double r;
        double aire;
        double volume;
        Scanner entree = new Scanner(System.in);

        System.out.println("Entrez le rayon de la sphère en km");
        r = entree.nextDouble();
        while(r < 0){
            System.out.println("Saisie incorrecte, veuillez sélectionner un nombre positif");
            r = entree.nextDouble();
        }
        aire = 4*Math.PI*Math.pow(r, 2);
        volume = (4.0/3.0)*Math.PI*Math.pow(r, 3);

        System.out.printf("Aire = %e km²; Volume = %e km^3",aire,volume);

        entree.close();

    }
}
