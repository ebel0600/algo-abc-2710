package entrainement.PGCD.src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entree = new Scanner(System.in);
        int p, q, resultat;

        System.out.println("Entrez un nombre entier");
        p = entree.nextInt();
        entree.nextLine();

        System.out.println("Entrez un autre nombre pour en déterminer le PGCD avec le précedent");
        q = entree.nextInt();
        entree.close();

        resultat = Pgcd(p, q);

        System.out.println("PGCD de "+p+" et "+q+" = "+resultat);

    }

    public static int Pgcd (int p, int q){

        while(p!=q){
            if(p>q){
                p -= q;
            }
            else q -= p;
        }

        return p;

    }
}
