package exercices2;

import java.util.Scanner;

public class Exo2_5 {
    public static void main(String[] args) {
        //déclaration de variables
        int nombre;
        Scanner entree = new Scanner(System.in);

        //entree du nombre
        System.out.println("Entrez un nombre :");
        nombre = entree.nextInt();

        //affichage des diviseurs du nombre
        for(int i=2; i<nombre;i++){
            if(nombre%i == 0){
                System.out.println(i);
            }
        }
        entree.close();
    }
}
