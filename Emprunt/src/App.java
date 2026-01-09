
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double capital;
        int nbmois;
        String tabAmorti;

        System.out.println(" Veuiller saisir le capital à emprunter :");
        capital = sc.nextDouble();
        System.out.println("Veuiller saisir le taux d'intérêt annuel ");
        double tauxmensuel = (sc.nextDouble()) / 1200;
        System.out.println("Veuiller saisir la durée de remboursement (en années)");
        nbmois = (sc.nextInt()) * 12;
        double rembmensuel = App.calculMensualite(capital, nbmois, tauxmensuel);

        sc.close();

        System.out.printf("Votre mensualité de rembourserment sera de %.2f Euros \n", rembmensuel);
        tabAmorti = tabAmortissement(rembmensuel, nbmois, capital, tauxmensuel);
        System.out.println("Voici votre tableau d'amortissement :\n"+tabAmorti);

    }

    private static double calculMensualite(double _capital, int _nbmois, double _tauxmensuel) {

        // Q= (1-(1+ tm )puissance-n)
        // a= K x tm/Q

        double Q = (1 - Math.pow((1 + _tauxmensuel), -_nbmois));
        double mensualite = (_capital * _tauxmensuel) / Q;

        return mensualite;

    }

    private static String tabAmortissement (double mensualite, int nbMois, double capital, double tauxmensuel){
        String resultat="Compteur mois\tPart interet\tPart capital\tCapital restant du\tMensualité\tMensualité cumulée\n";

        double partInteret = capital * tauxmensuel;
        double partCapital = mensualite - partInteret;

        for (int i = 0; i <= nbMois; i++){
            resultat += i+"\t\t"+arrondi(partInteret,1)+"\t\t"+arrondi(partCapital,1)+"\t\t"+Math.round(capital)+"\t\t\t"+Math.round(mensualite)+"\t\t"+Math.round(i*mensualite)+"\n";
            capital-=partCapital;
            partInteret = capital * tauxmensuel;
            partCapital = mensualite-partInteret;
        }

        return resultat;
    }

    public static double arrondi(double nb, int nv) {

        return (double) ((long) (nb * Math.pow(10, nv) + 0.5)) / Math.pow(10, nv);

    }
}
