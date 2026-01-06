package exercices2;

import java.util.Scanner;

public class Exo2_3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        //declaration de variables
        double a;
        double b;
        double c;
        Scanner entree = new Scanner(System.in);
        int conv; //variable pour cast int : normalisation des double a deux decimaux
        //double i = 0; // variable de recherche à incrementer pour chercher une equivalence aux double et les concatener au string
        //int inc=0; // incrementation globale : quand elle atteint 3, la boucle s'arrete
        //String resultat="";

        // on entre les valeur double et on les normalise a 2 decimaux
        System.out.println("Entrez A");
        a = entree.nextDouble();
        a*=100;
        conv = (int) a;
        a = conv;
        a/=100;
        System.out.println("Entrez B");
        b = entree.nextDouble();
        b*=100;
        conv = (int) b;
        b = conv;
        b/=100;
        System.out.println("Entrez C");
        c = entree.nextDouble();
        c*=100;
        conv = (int) c;
        c = conv;
        c/=100;
        entree.close();

        /*do{
            if(i == a || i == b || i == c){
                resultat+=i+" ";
                inc++;
            }
            //incrementation de i et normalisation a 2 decimaux
            i*=100;
            i++;
            conv = (int) i;
            i = conv;
            i/=100;
        }while (inc<3);
        System.out.println(resultat);
*/

        if(a<=b){
            if(b<=c){
                System.out.println(a+ "<=" + b + "<=" + c);
            }
            else if (a<=c){
                System.out.println(a + " <= " + c + " <= " + b);
            }
            else{
                System.out.println(c + " <= " + a + " <= " + b);
            }
        }
        else{
            if(a<=c){
                System.out.println(b + " <= " + a + " <= " + c);
            }
            else if(c<=b){
                System.out.println(c + " <= " + b + " <= " + a);
            }
            else {
                System.out.println(b + " <= " + c + " <= " + a);
            }
        }
    }
}
