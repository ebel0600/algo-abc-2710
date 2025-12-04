package exercices;

/* EXO8 : A l'aide de Scanner et Print, créer un formulaire d'inscription, où on vous demande de renseignez, votre prénom, votre nom, adresse email,
 *  mot de passe et confirmer votre mot de passe (ils doivent être identiques). Si les mots de passes ne sont pas identiques, ceci affiche "inscription annulée"
 * Sinon vous affichez le message suivant ci-dessous :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prénom ?
 * 
 * Eudes
 * 
 * Votre nom ?
 * 
 * Konda
 * 
 * Votre adresse email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 * 
*/
import java.util.Scanner;

public class exo8 {
    public static void main(String[] args) {

        // declaration de variables
        String prenom;
        String nom;
        String email;
        String password;
        String securedpassword;
        Scanner entree = new Scanner(System.in);
        boolean compare;

        //entree des variables
        System.out.print("Entrez votre prenom :");
        prenom = entree.nextLine();
        System.out.print("Entrez votre nom :");
        nom = entree.nextLine();
        System.out.print("Entrez votre email :");
        email = entree.nextLine();

        /* 

        Tentative de vérification format email échouée

        if(email .equals(String.format(" %s %s ","@","."))){
            System.out.print("réussite");
        }
        else{
            System.out.print("fail");       
        }
        
        */
        
        System.out.print("Entrez votre mot de passe :");
        password = entree.nextLine();
        System.out.print("Veuillez confirmer le mot de passe :");
        securedpassword = entree.nextLine();

        compare = securedpassword.equals(password);

        if(compare==true){
            System.out.print("Merci "+prenom+" "+nom+", votre inscription a bien été effectuée. Vous recevrez un mail de notification à l'adresse : "+email+".");
        }
        else{
            System.out.print("Inscription annulée.");
        }

        entree.close();
    }
    
}
