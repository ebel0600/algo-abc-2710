package exercices2;

import java.util.Scanner;

public class Exo2_2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner entree = new Scanner(System.in);

        System.out.println("Entrez A :");
        a = entree.nextInt();
        System.out.println("Entrez B :");
        b = entree.nextInt();

        if(a>b){
            System.out.println(b+" < "+a);
        }
        else{
            System.out.println(a +" < "+b);
        }
        entree.close();
    }
    
}
