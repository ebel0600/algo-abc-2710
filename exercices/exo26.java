package exercices;

import java.util.Scanner;

public class exo26 {

    public static void main(String[] args) {
        //declaration de variables
        int nombre;
        int plusGrand=0;
        int position=1;
        int i = 1;
        Scanner entree = new Scanner(System.in);

        //boucle qui consiste à enregistrer la valeur la plus haute parmi un certain nombre d'entrees et sa position d'énumération
        do{
            System.out.println("Entrez un nombre. Vous pouvez terminer la boucle en choisissant 0.");
            nombre = entree.nextInt();

            if(nombre > plusGrand){
                plusGrand = nombre;
                position = i;
            }

            i++;
        }while(nombre !=0); //se termine lorsque l'on entre 0

        //affichage du resultat
        System.out.println("Parmi les nombres choisis, le plus grand est "+plusGrand+" à la position numero "+position+".");
        entree.close();
    }
    
}
