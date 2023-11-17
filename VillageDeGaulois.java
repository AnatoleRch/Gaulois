import java.util.ArrayList;

public class VillageDeGaulois {
    private ArrayList<Gaulois> lesGaulois ; 
    private Gaulois chef ; 
    private Druide druide ;  

    public VillageDeGaulois (Gaulois chef, Druide druide){
        this.chef= chef ; 
        this.druide = druide; 
        this.lesGaulois = new ArrayList<Gaulois> () ; 
    }
    public VillageDeGaulois (Gaulois chef, Druide druide, ArrayList<Gaulois> lesGaulois){
        this.chef= chef ; 
        this.druide = druide; 
        this.lesGaulois = lesGaulois ; 
    }

    public String toString(){
        return "Chef : "+chef+'\n'+"Villageois : "+lesGaulois;
    }
    public String seRencontrer (Gaulois a , Gaulois b) {
        return "Bonjour, je suis " + a.getNom () + ". "+'\n' + "Bonjour " + a.getNom () + " moi c'est " + b.getNom () + ". " ; 
    }
    public String sePreparer (){
        int dosePotion = (int)Math.floor(Math.random() * (druide.getMax() + 1 - druide.getMin() ) + druide.getMin() ) ; 

        for ( Gaulois g : lesGaulois){
            if (g.getForce()<5){
                g.setForce (g.getForce() + dosePotion ) ; 
            }
        } 
        return chef.getNom() +" : fais une potion "+ druide.getNom () +" ! Et vite !! Car les romains arrivent et on vas se bastonner !";
    }

    
    
    public ArrayList<Gaulois> getLesGaulois() {
        return lesGaulois;
    }
    public Gaulois getChef() {
        return chef;
    }
    
}
