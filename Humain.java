public abstract class Humain {
protected String nom ; 
protected int force ; 



public Humain (String nom , int force ){
    this.nom = nom ; 
    this.force = force ; 
}

public String toString () {
    return this.getClass().getSimpleName()+" : " + nom + ", " +force  ; 
}

}