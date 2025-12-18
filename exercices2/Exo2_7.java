package exercices2;

import java.lang.Math;
import java.util.Scanner;

public class Exo2_7 {
    public static void main(String[] args) {
        // déclaration de variables
        
        String chaineresult;
        Scanner entree = new Scanner(System.in);
        double resultat;
        double conversion;
        @SuppressWarnings("unused")
        double test;

        // affectation de la variable de distance
        forbreak: do {
            System.out.println(
                    "Entrez une distance entre 0,01 et 100 000 a convertir en miles ou Km suivi d'un espace et de l'unité K ou M.\nSélectionnez q pour terminer le programme.");
            chaineresult = entree.nextLine();
            String[] tabchaine = chaineresult.split(" ");
            // on teste la bonne saisie de chaineresult
            if (!(tabchaine[0].equals("q"))) {
                try {
                    test = Double.parseDouble(tabchaine[0]);
                } catch (NumberFormatException e) {
                    System.out.println("Erreur : " + e.getMessage() + " n'est pas valide.");
                    continue forbreak;
                }
            } else {
                break forbreak;
            }

            if (Double.parseDouble(tabchaine[0]) < 100000 && Double.parseDouble(tabchaine[0]) > 0.01) {
                switch (tabchaine.length) {
                    case 1:
                        // si on met une distance sans unite de mesure
                        resultat = Double.parseDouble(tabchaine[0]) / 1.609;
                        resultat *= 100;
                        conversion = Math.round(resultat);
                        resultat = conversion;
                        resultat /= 100;
                        System.out.println("La conversion de "+tabchaine[0]+"km en miles est de " + resultat);
                        break;
                    // avec une unite de mesure
                    case 2:
                        if ((tabchaine[1].toUpperCase()).equals("M")) {
                            resultat = Double.parseDouble(tabchaine[0]) * 1.609;
                            resultat *= 100;
                            conversion = Math.round(resultat);
                            resultat = conversion;
                            resultat /= 100;
                            System.out.println("La conversion de "+ tabchaine[0] +"mi en kilometres est de :" + resultat);
                            break;
                        } else if (tabchaine.length > 1 && (tabchaine[1].toUpperCase()).equals("K")) {
                            resultat = Double.parseDouble(tabchaine[0]) / 1.609;
                            resultat *= 100;
                            conversion = Math.round(resultat);
                            resultat = conversion;
                            resultat /= 100;
                            System.out.println("La conversion de "+tabchaine[0]+"km en miles est de " + resultat);
                            break;
                        }
                    default:
                        System.out.println("Erreur de saisie");
                        break;
                }
            } else {
                System.out.println("Valeur en dehors de la plage autorisée");
            }
        } while (true);

        System.out.println("Programme terminé");
        entree.close();
    }
}
// corrigé
/*
 * package convertisseur_km_miles;
 * 
 * import java.util.Scanner;
 * 
 * public class ConvertisseurKmMi {
 * 
 * public static void main(String[] args) {
 * // TO_DO Auto-generated method stub
 * 
 * System.out.println("Convertisseur Kilom�tre <-> Miles");
 * System.out.println("----------------------------------");
 * String saisie=" ";
 * double distance;
 * String [] montab;
 * Scanner sc= new Scanner(System.in );
 * System.out.
 * print("Veuillez saisir une  distance � convertir avec un espace et l'unit� km pour kilom�tre ou mi pour miles :"
 * );
 * saisie=sc.nextLine();
 * 
 * montab= saisie.split(" ");
 * distance=Double.parseDouble(montab[0]);
 * String unite;
 * if(montab.length<2)
 * {
 * unite="";
 * 
 * }else
 * {
 * unite=montab[1];
 * }
 * for( String el : montab)
 * {
 * 
 * System.out.print(el+" ");
 * 
 * }
 * /*
 * for (int i = 0; i < montab.length; i++) {
 * 
 * System.out.print(montab[i]+ " ");
 * 
 * }
 *
 * if (unite.equals("km") || unite=="" ) {
 * 
 * double res= distance/1.609344 ;
 * System.out.println("Cela donne en miles : "+res);
 * 
 * }else {
 * 
 * double res2= distance*1.609344 ;
 * 
 * System.out.println("Cela donne en km : "+res2);
 * 
 * 
 * }
 * }
 * 
 * }
 */