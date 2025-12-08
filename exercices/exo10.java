package exercices;

/* EXO10 : Créer un quizz de 5 questions, chaque question à deux réponses au choix VRAI OU FAUX, à chaque fois que vous répondez juste à une question vous gagnez un point
 * 
 * Après avoir répondu à vos 5 questions, vous avez le résultat final sur 5.
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Question 1 : L'informatique a besoin des mathématiques ? (V/F)
 * 
 * V
 * 
 * Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)
 * 
 * F
 * 
 * Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)
 * 
 * F
 * 
 * Question 4 : Une table de vérité retourne l'expression algébrique (V/F)
 * 
 * V
 * 
 * Question 5 : Git permet de stocker à distance son travail (V/F)
 * 
 * 
 * V
 * 
 * 
 * Résultat du QUIZZ, vous avez 5 point(s) / 5
 * 
*/

import java.util.Scanner;

public class exo10 {
    public static void main(String[] args) {
        //declaration de variables
        char reponse;
        int score=0;
        Scanner entree = new Scanner(System.in);

        //Pour le moment, on ne fait que repeter le meme processus pour chaque question manuellement, sans traiter les entrees != V et F
        System.out.println("Question 1 : L'informatique a besoin des mathématiques ? (V/F)");
        reponse = entree.next().charAt(0);
        if(reponse=='V'){
            score++;
        }

        System.out.println("Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)");
        reponse = entree.next().charAt(0);
        if(reponse=='F'){
            score++;
        }

        System.out.println("Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)");
        reponse = entree.next().charAt(0);
        if(reponse=='F'){
            score++;
        }

        System.out.println("Question 4 : Une table de vérité retourne l'expression algébrique (V/F)");
        reponse = entree.next().charAt(0);
        if(reponse=='V'){
            score++;
        }

        System.out.println("Question 5 : Git permet de stocker à distance son travail (V/F)");
        reponse = entree.next().charAt(0);
        if(reponse=='V'){
            score++;
        }

        System.out.print("Résultat du QUIZZ : vous avez un score de "+score+" points(s) /5.");

        entree.close();
    }
    
}
