public class Gaulois extends Humain {
   protected String metier ; 

public Gaulois (String nom, String metier){
    super (nom, puissance(nom)); 
    this.metier = metier ; }


public static int puissance(String nom) {
    if (nom == "Obelix"){
        return 15 ; 
    }
    else return 1 ; 
}
public String toString () {
    return super.toString()+  ", " + metier ; 
}
}

