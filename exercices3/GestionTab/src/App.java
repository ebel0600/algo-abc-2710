import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Combien de nombres voulez-vous génerer?");

        n = sc.nextInt();
        int[] _tableau = new int[n];
        GestionTab.remplirTableau(_tableau);
        GestionTab.afficherTableau(_tableau);
        System.out.println("Voici le tableau trié ");
        GestionTab.triBulleTableau(_tableau);
        GestionTab.afficherTableau(_tableau);

        sc.close();

    }
}


/*
 * import java.util.Scanner;
 * 
 * public class Bulle {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc= new Scanner(System.in);
 * int passage=0;
 * boolean permut =true;
 * 
 * System.out.
 * println("Combien de valeurs voulez-vous pour le tableau de nombre ?");
 * int N =sc.nextInt();
 * 
 * int [] monTab= new int [N];
 * sc.nextLine();
 * 
 * int compteur=0;
 * do {
 * 
 * 
 * System.out.println("Veuillez saisir la valeur numero " + (compteur+1)+
 * " du tableau de nombre");
 * monTab[compteur]=sc.nextInt();
 * sc.nextLine();
 * compteur++;
 * 
 * 
 * } while ( compteur<monTab.length);
 * 
 * for (int element : monTab) {
 * 
 * System.out.print(element+ " ");
 * 
 * }
 * 
 * System.out.println("\n----------------------------------");
 * /*pseudo code
 * PROCEDURE tri_bulle ( TABLEAU a[1:n])
 * passage ← 0
 * REPETER
 * permut ← FAUX
 * POUR i VARIANT DE 1 A n - 1 - passage FAIRE
 * SI a[i] > a[i+1] ALORS
 * echanger a[i] ET a[i+1]
 * permut ← VRAI
 * FIN SI
 * FIN POUR
 * passage ← passage + 1
 * TANT QUE permut = VRAI
 * 
 * do {
 * 
 * permut=false;
 * 
 * for (int i = 0; i < monTab.length-1; i++) {
 * 
 * if(monTab[i]>monTab[i+1] )
 * {
 * int temp =monTab[i+1];
 * monTab[i+1]=monTab[i];
 * monTab[i]=temp;
 * 
 * permut =true;
 * }
 * 
 * }
 * passage++;
 * 
 * } while (permut ==true);
 * 
 * System.out.println("Le tableau est trié en "+ (passage-1) +" passages" );
 * for (int element : monTab) {
 * 
 * System.out.print(element+ " ");
 * 
 * }
 * 
 * System.out.println("\n----------------------------------");
 * 
 * sc.close();
 * }
 * 
 * }
 */