package exercices2;

import java.lang.Math;
import java.util.Scanner;

public class Exo2_7 {
    public static void main(String[] args) {
        //déclaration de variables
        String chaineresult;
        Scanner entree = new Scanner(System.in);
        double resultat;
        double conversion;

        //affectation de la variable distance
        do { System.out.println("Entrez une distance entre 0,01 et 100 000 a convertir en miles ou Km suivi d'un espace et de l'unité K ou M.\nSélectionnez q pour terminer le programme.");
        chaineresult=entree.nextLine();
        String [] tabchaine = chaineresult.split(" ");
        //System.out.println(tabchaine.length);

        switch (tabchaine.length){

            case 1 :
                if(!(tabchaine[0].equals("q"))){
                    try { 
                        double test = Double.parseDouble(chaineresult);
                        System.out.println(test);
                    }catch(NumberFormatException e){
                        System.out.println("Erreur : "+e.getMessage()+" n'est pas valide");
                        break;
                    }

                    resultat = Double.parseDouble(chaineresult) / 1.609;
                    resultat *= 100;
                    conversion = Math.round(resultat);
                    resultat = conversion;
                    resultat /= 100;
                    System.out.println("La conversion en miles est de "+resultat);
                    break;
                }
                else {
                    break;
                }
            case 2 :    
                if(tabchaine[1].equals("M")){
                    resultat = Double.parseDouble(tabchaine[0]) * 1.609; 
                    resultat *= 100;
                    conversion = Math.round(resultat);
                    resultat = conversion;
                    resultat /= 100;
                    System.out.println("La conversion en kilometres est de :"+resultat);
                    break;
                }
                else if (tabchaine.length>1 && tabchaine[1].equals("K")){
                    resultat = Double.parseDouble(tabchaine[0]) / 1.609;
                    resultat *= 100;
                    conversion = Math.round(resultat);
                    resultat = conversion;
                    resultat /= 100;
                    System.out.println("La conversion en miles est de "+resultat);
                    break;
                }
            default:    
                System.out.println("Erreur de saisie");
                break;
        }
        }while (!chaineresult.equals("q"));  

        System.out.println("Programme terminé");
        entree.close();

    } 
}
