public class Romain extends Humain {
    private Grade grade ; 


public Romain (String nom , Grade grade){
    super ( nom , (double)Math.floor(Math.random() * (6 - 1) + 1)) ; 
    this.grade = grade ; 
}
public String toString () {
    return super.toString()+ ", " +grade  ; 
}
public Grade getGrade() {
    return grade;
}

public String prendreBaffe (Gaulois g) {
    this.force = force - g.getForce()  * 1/6 ; 
    g.setForce(g.getForce()- force );
    return nom+" se prend une baffe de " + g.getNom ()+'\n' ; 
}

}