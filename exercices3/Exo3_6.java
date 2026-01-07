package exercices3;

import java.util.Arrays;
import java.util.Scanner;

public class Exo3_6 {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);
        String solution, pendu;
        System.out.println("Joueur 1 : entrez le mot mystère");
        int essais = 6;
        char lettre;
        char[] tabPendu;
        solution = entree.nextLine();

        while(solution.length()<5){
            System.out.println("Le mot mystère doit contenir au moins 5 caracteres, veuillez recommencer.");
            solution = entree.nextLine();
        }

        pendu = solution.substring(0,1);
        for(int i = 1; i<solution.length()-1; i++){
            pendu += "-";
        }
        pendu += solution.charAt(solution.length()-1);
        tabPendu = pendu.toCharArray();
        
        for(int j = 0; j < essais; j++){
            System.out.println("Joueur 2 : entrez un caractère");
            lettre = entree.next().charAt(0);
            entree.nextLine();
            for(int k = 1; k<solution.length()-1;k++){
                if(solution.charAt(k)==lettre){
                    tabPendu[k]=lettre;
                }
            }
            pendu = Arrays.toString(tabPendu);
            System.out.println(pendu);
            if(!pendu.contains("-")) break;
        }

        if(pendu.contains("-")){
            System.out.println("Vous avez perdu !");
        }
        else System.out.println("Vous avez gagné !");
        
        entree.close();
        System.out.println("Programme terminé");
    }
}   
