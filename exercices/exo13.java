package exercices;

/* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * 
 * 
 * 
*/

import java.util.Scanner;

public class exo13{
    public static void main(String[] args) {
        //declaration de variables
        int centimetres;
        double metres;
        Scanner entree = new Scanner(System.in);

        //entree de valeurs
        System.out.println("Donner une taille (en cm) ?");
        centimetres = entree.nextInt();

        //calcul et affichage du resultat
        metres = centimetres;
        metres /=100;
        System.out.print(centimetres + " cms vaut " + metres + " m.");

        entree.close();
    }
}