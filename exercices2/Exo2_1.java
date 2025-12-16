package exercices2;

import java.util.Scanner;

public class Exo2_1 {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.println("Entrez votre âge :");
        int a;
        a = entree.nextInt();
        if(a<0){
            System.out.print("Vous n'êtes pas encore né");
        }
        else if(a<18){
            System.out.print("Vous êtes mineur.");
        }
        else {
            System.out.print("Vous êtes majeur.");
        }
        entree.close();
    }
}
