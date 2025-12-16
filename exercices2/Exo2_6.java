package exercices2;

import java.util.Scanner;

public class Exo2_6 {
    public static void main(String[] args) {
        
        //declaration de variables
        int nombre;
        int diviseurs = 0;
        Scanner entree = new Scanner(System.in);
        
        //entree de variables
        System.out.println("Entrez un nombre :");
        nombre = entree.nextInt();

        //recherche de diviseurs
        for(int i = 1; i<=nombre;i++){
            if(nombre%i==0){
                diviseurs++;
            }
        }

        diviseurs-=2; // on exclut 1 et le nombre même

        if(diviseurs>0){
            System.out.println("Ce nombre n'est pas premier : il a "+diviseurs+" diviseurs en dehors de 1 et lui même.");
        }
        else{
            System.out.println("C'est un nombre premier.");
        }
        entree.close();
    }
}
