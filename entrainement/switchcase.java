package entrainement;

import java.util.Scanner;

public class switchcase {
    
    public static void main(String[] args) {


         Scanner clavier = new Scanner(System.in); //* Initialsiation du scanner */

        int age;
        System.out.println("Donnez votre âge :");

        age = clavier.nextInt();
        while(age<0)
        {
            System.out.println("Saisie incorrecte, veuillez rentrer un nombre entier positif");
            age = clavier.nextInt();
        }
    
        switch(age){ /* On initialise le switch avec la variable age , on va tester si age à les valeurs suivantes */
            /* En fonction des valeurs le message change */
            case 0,1,2,3:
            case 4:System.out.println("Vous êtes un bébé");
                break;
            case 5,6:
            case 7:System.out.println("Vous êtes un enfant");
                break;
            case 8,9,10,11:
            case 12: System.out.println("Vous êtes un pré-ado");
                break;
            case 13,14,15,16,17,18,19,20:
                System.out.println("Vous êtes un Adolescent");
                break;
            case 21,22,23,24:
                System.out.println("Vous êtes un jeune Adulte");
                break;    
            case 25,26,27,28,29,30,31,32,33,34,35,36,37,38,39:
                System.out.println("Vous êtes un adulte");
                break;
            case 40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59:
                 System.out.println("Vous êtes un adulte mûr");
                break;
            default:
                System.out.println("Vous êtes un senior");

        }


        clavier.close();
}
}
