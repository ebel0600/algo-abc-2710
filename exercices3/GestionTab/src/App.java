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