public class Romain extends Humain {
    private Grade grade ; 


public Romain (String nom , int force, Grade grade){
    super ( nom , force) ; 
    this.grade = grade ; 
}
public String toString () {
    return super.toString()+grade  ; 
}
}