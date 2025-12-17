package exercices2;

import java.util.Scanner;

public class Exo3_2 {
    public static void main(String[] args) {

        //declaration de variables
        int solde;
        Scanner entree = new Scanner(System.in);
        int nbMagasins=0;

        //initialisation du solde
        System.out.println("Quel est le solde de Barnabé ?");
        solde = entree.nextInt();
        //barnabe doit avoir au moins un euro
        while(solde <= 1){
            System.out.println("Barnabé doit avoir au moins 1 euros pour faire ses courses !");
            solde = entree.nextInt();
        }

        //incrementation de nbMagasin et decrementation du solde selon les instructions de l'enonce
        do{
            nbMagasins++;
            solde-= (solde/2)+1;
        }while(solde > 0);

        System.out.println("Barnabé a acheté dans "+nbMagasins+" magasins.");

        entree.close();

    }
}
