package entrainement;

import java.util.Scanner;

public class x {
    
    public static void main(String[] args) {
        //déclaration de variables
        char etoile = '*';
        char espace = ' ';
        int maximum; // pour établir la taille de la croix
        Scanner entree = new Scanner(System.in);

        System.out.println("Indiquez la taille de la croix");
        maximum = entree.nextInt();

        //boucle des lignes
        for(int i = 0; i<maximum; i++){
            //boucle des colonnes
            for(int j = 0; j<maximum; j++){
                if(j==i || j==maximum-i-1){
                    System.out.print(etoile);
                }
                else {
                    System.out.print(espace);
                }
            }
            System.out.print("\n");
        }
        entree.close();
    }
}
