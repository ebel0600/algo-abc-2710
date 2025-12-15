package exercices2;

import java.util.Scanner;
import java.lang.Math;

public class exo1_3 {
    public static void main(String[] args) {
        
        double R;
        double A;
        double circulaire;
        Scanner entree = new Scanner(System.in);

        System.out.println("Entrez le rayon :");
        R = entree.nextDouble();
        System.out.println("Entrez la valeur de l'angle :");
        A = entree.nextDouble();
        while(!(A>=0 && A<360)){
            System.out.println("Saisie incorrecte, veuillez entrer un angle entre 0 et 359 degrés");
            A = entree.nextDouble();
        }
        circulaire = (Math.PI*Math.pow(R, 2)*A)/360;

        System.out.print("La surface circulaire est de "+circulaire+".");

        entree.close();
    }   
}    

