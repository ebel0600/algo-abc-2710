package exercices2;

import java.util.Arrays;
import java.util.Scanner;

public class Exo3_3 {
    public static void main(String[] args) {
        int nombre;
        int[] tableau;
        int taille;
        int n;
        int position;
        Scanner entree = new Scanner(System.in);

        //attribution de la taille du tableau
        System.out.println("Définissez la taille du tableau");
        taille = entree.nextInt();
        tableau = new int[taille];

        //attribution de valeurs au tableau
        for(int i = 0; i<taille; i++){
            System.out.println("Entrez une valeur pour tableau["+i+"]");
            nombre = entree.nextInt();
            tableau[i]= nombre;
        }

        //tri dans l'ordre croissant
        Arrays.sort(tableau);

        //recherche du nombre N dans le tableau
        System.out.println("Entrez le nombre N à rechercher dans le tableau :");
        n = entree.nextInt();

        for(int j = 0; j<taille;j++){
            System.out.println(tableau[j]);
        }
        position = Arrays.binarySearch(tableau, n);

        if(position == -1){
            System.out.println("404 not found");
        }
        else{
            System.out.println("N est a la position numero" + (position+1));
        }

        entree.close();

    }
}
