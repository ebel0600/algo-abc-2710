package exercices2;

import java.util.Scanner;
import java.lang.Math;

public class exo1_2 {
    public static void main(String[] args) {
        double R;
        double aire;
        double volume;
        Scanner entree = new Scanner(System.in);

        System.out.println("Entrez le rayon de la sphère en cm");
        R = entree.nextDouble();
        while(R < 0){
            System.out.println("Saisie incorrecte, veuillez sélectionner un nombre positif");
            R = entree.nextDouble();
        }
        aire = 4*Math.PI*Math.pow(R, 2);
        volume = ((4/3)*Math.PI)*Math.pow(R, 3);

        System.out.printf("Aire = %.2f cm²; Volume = %.2f cm^3",aire,volume);

        entree.close();

    }
}
