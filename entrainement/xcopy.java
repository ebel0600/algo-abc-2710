package entrainement;

import java.util.Scanner;

public class xcopy {
    
    public static void main(String[] args) {
        //déclaration de variables
        char etoile = '*';
        char espace = ' ';
        int marque = 1; // un marqueur pour indiquer quand il faut afficher une asterique
        int maximum;
        Scanner entree = new Scanner(System.in);

        System.out.println("Indiquez la taille de la croix");
        maximum = entree.nextInt();

        //boucle des lignes
        for(int i = 0; i<maximum; i++){
            //boucle des colonnes
            for(int j = 1; j<=maximum; j++){
                if(j==marque || j==maximum-marque){
                    System.out.print(etoile);
                }
                else {
                    System.out.print(espace);
                }
            }
            //gestion de la valeur du marqueur en fonction des lignes
            if(i<=(maximum/2) && maximum%2==0 || i<(maximum/2) && maximum%2==1){
                marque++;
            }
            else if (i>=(maximum/2) && maximum%2==0 || i >=(maximum/2) && maximum%2==1){
                marque--;
            }
            System.out.print("\n");
        }
        entree.close();
    }
}
