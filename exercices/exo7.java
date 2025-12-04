package exercices;

/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * 
*/
 import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        //declaration des variables
        Scanner entree = new Scanner(System.in);
        char reponse;
        
        System.out.print("Do you speak english ? (y/n)");
        reponse = entree.next().charAt(0);
        
        if(reponse == 'y'){
            System.out.print("Nice to meet you !");
        }
        else if(reponse == 'n'){
            System.out.print("Then learn English !");
        }
        else{
            System.err.print("Error : not an adequate answer");
        }
        
        entree.close();
    }   
}
