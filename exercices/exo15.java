package exercices;

import java.lang.classfile.instruction.SwitchCase;

/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 * 
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 * 
 * Attention on ne peut pas convertir les deux même devise !
 * 
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 * 
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 * 
 * ATTENTION ! : Montants doivent être décimaux , 2 chiffres après la virgule.
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * Quel est votre monnaie ?
 * 
 * EUR
 * 
 * Quel est votre montant ?
 * 
 * 100.00
 * 
 * Vous voulez la convertir en quelle devise ?
 * 
 * USD
 * 
 * Résultat : 113,82 USD
 * 
 * 
*/

import java.util.Scanner;

public class exo15 {
    public static void main(String[] args) {

        //declaration variables de conversion
        float EURtoGBP = (float) 0.87;
        float GBPtoEUR = (float) 1.14;
        float EURtoUSD = (float) 1.16;
        float USDtoEUR = (float) 0.86;
        float GBPtoUSD = (float) 1.33;
        float USDtoGBP = (float) 0.75;

        //declaration variables de devise
        String base;
        String convertTo;
        float valeur;
        float resultat=0;
        int resultatConv;
        Scanner entree = new Scanner(System.in);

        //entree des devises
        
        System.out.println("Quel est votre monnaie ?");
        base = entree.nextLine();
        //verification de conformite
        while(!(base.equals("EUR") || base.equals("GBP") || base.equals("USD"))){
            System.out.println("Monnaie inconnue, veuillez réessayer :");
            base = entree.nextLine();
        }

        System.out.println("Quel est votre montant ?");
        valeur = entree.nextFloat();


        //une ligne qui debug l'entree suivante
        entree.nextLine();

        System.out.println("Quelle conversion effectuer ?");
        convertTo = entree.nextLine();

        // Ne doit pas etre la meme devise que celle de base
        if(convertTo.equals(base)){
            System.out.println("Ce sont les mêmes devises, veuillez en entrer une differente.");
            convertTo = entree.nextLine();
        }
        else{
            // verification de conformite
            while(!(convertTo.equals("EUR") || convertTo.equals("GBP") || convertTo.equals("USD"))){
                System.out.println("Monnaie inconnue, veuillez réessayer :");
                convertTo = entree.nextLine();
            }
        }
        // calcul du resultat
        switch (base) {

            case "EUR" :
                System.out.println("De "+valeur+" "+base+" :");
                switch (convertTo) {
                    case "GBP" :
                        resultat = valeur*EURtoGBP;
                        break;
                    case "USD" :
                        resultat = valeur*EURtoUSD;
                        break;
                }
                break;
            case "GBP" :
                System.out.println("De "+valeur+" "+base+" :");
                switch (convertTo) {
                    case "EUR" : 
                        resultat = valeur*GBPtoEUR;
                        break;
                    case "USD" :
                        resultat = valeur*GBPtoUSD;
                        break;
                }
                break;
            case "USD" :
                System.out.println("De "+valeur+" "+base+" :");
                switch (convertTo){
                    case "EUR" : 
                        resultat = valeur*USDtoEUR;
                        break;
                    case "GBP" :
                        resultat = valeur*USDtoGBP;
                        break;
                }
                break;

            }
        
            resultat*=100;
            resultatConv=(int) resultat;
            resultat = resultatConv;
            resultat /= 100;

            //affichage resultat
            System.out.print("Resultat : "+resultat+" "+convertTo+".");
        entree.close();
    }
}
