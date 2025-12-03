package entrainement;

public class x {
    
    public static void main(String[] args) {
        //déclaration de variables
        char etoile = '*';
        char espace = ' ';
        int marque = 1; // un marqueur pour indiquer quand il faut afficher une asterique

        //boucle des lignes
        for(int i = 1; i<=5; i++){
            //boucle des colonnes
            for(int j = 1; j<=5; j++){
                //on distingue les cas ou le marqueur vaut 1 ou non pour ajuster la valeur du modulo
                if(marque == 1 && (j-marque)%4==0){
                    System.out.print(etoile);
                }
                else if(marque!=1 && j%marque==0){
                    System.out.print(etoile);
                }
                else {
                    System.out.print(espace);
                }
            }
            //gestion de la valeur du marqueur en fonction des lignes
            if(i<3){
                marque++;
            }
            else{
                marque--;
            }
            System.out.print("\n");
        }
    }
}
