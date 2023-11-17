public class Gaulois extends Humain {
   protected String metier ; 

public Gaulois (String nom, String metier){
    super (nom, puissance(nom)); 
    this.metier = metier ; }


public static double puissance(String nom) {
    if (nom == "Obélix"){
        return 15 ; 
    }
    else return 1 ; 
}
public String toString () {
    return super.toString()+  ", " + metier ; 
}




public void setForce (double newForce) {
    force = newForce ; 
}



}

