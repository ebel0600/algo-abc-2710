package exercices;

import java.util.Scanner;

public class exo28 {
    public static void main(String[] args) {
        //declaration de variables
        boolean age;
        boolean permis;
        int accident;
        boolean anciennete;
        int categorie=0;
        String assurance;
        Scanner entree = new Scanner(System.in);

        //attribution des valeurs
        System.out.println("Avez vous plus de 25 ans ? (true / false)");
        age = entree.nextBoolean();
        System.out.println("Avez vous le permis depuis plus de 2 ans ? (true / false)");
        permis = entree.nextBoolean();
        System.out.println("Combien d'accidents avez vous eu jusqu'à présent ?");
        accident = entree.nextInt();
        entree.nextLine();
        System.out.println("Avez vous plus de 5 ans d'ancienneté chez nous ? (true / false)");
        anciennete = entree.nextBoolean();
        entree.close();

        //calcul du resultat
        if(age || permis){
            categorie++;
        }
        if(age && permis){
                categorie++;
            }
        categorie -= accident;
        
        if(categorie<0){
            System.out.print("Nous ne pouvons pas vous assurer.");
        }
        else {           
            if(anciennete){
                categorie++;
            }
            switch (categorie) {
                case 0 : 
                    assurance = "rouge";
                    break;  
                case 1 :
                    assurance = "orange";
                    break;
                case 2 :
                    assurance = "vert";
                    break;
                case 3 : 
                    assurance = "bleu";
                    break;
                default : 
                    assurance = "inconnu";
            }

            System.out.print("Nous pouvons vous assurer au tarif "+assurance+".");
        }

    }
}
