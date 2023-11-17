public abstract class Humain {
protected String nom ; 
protected double force ; 



public Humain (String nom , double force ){
    this.nom = nom ; 
    this.force = force ; 
}

public String toString () {
    return this.getClass().getSimpleName()+" : " + nom + ", force : " +force  ; 
}


public String getNom() {
    return nom;
}
public double getForce() {
    return force ;
}
}