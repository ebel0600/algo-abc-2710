package exercices2;

import java.util.Scanner;

public class Exo2_4 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        int a;
        Scanner entree = new Scanner(System.in);

        System.out.println("Entrez une année");
        a = entree.nextInt();

        if(a%4!=0){
            System.out.println("Cette année n'est pas bisextile");
        }
        else {
            if(a%100 == 0 && a%400 != 0){
                System.out.println("Cette année n'est pas bisextile");
            }
            else{
                System.out.println("Cette année est bisextile");
            }
        }
        
        entree.close();
    }

    
}
