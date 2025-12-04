package entrainement;

import java.util.Scanner;

public class xcopy {
    
    public static void main(String[] args) {
        //déclaration de variables
        char etoile = '*';
        char espace = ' ';
        int marque = 0; // un marqueur pour indiquer quand il faut afficher une asterique
        int maximum;
        Scanner entree = new Scanner(System.in);

        System.out.println("Indiquez la taille de la croix");
        maximum = entree.nextInt();

        //boucle des lignes
        for(int i = 0; i<maximum; i++){
            //boucle des colonnes
            for(int j = 0; j<maximum; j++){
                if(j==marque || j==maximum-marque-1){
                    System.out.print(etoile);
                }
                else {
                    System.out.print(espace);                    }
            }
            //gestion de la valeur du marqueur en fonction des lignes
            marque++;
            System.out.print("\n");
        }
        entree.close();
    }
}
