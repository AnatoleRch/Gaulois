import java.util.ArrayList;

public class VillageDeGaulois {
    private ArrayList<Gaulois> lesGaulois ; 
    private Gaulois chef ; 

    public VillageDeGaulois (Gaulois chef){
        this.chef= chef ; 
        this.lesGaulois = new ArrayList<Gaulois> () ; 
    }
    public VillageDeGaulois (Gaulois chef, ArrayList<Gaulois> lesGaulois){
        this.chef= chef ; 
        this.lesGaulois = lesGaulois ; 
    }


    public String seRencontrer (Gaulois a , Gaulois b) {
        return "Bonjour, je suis " + a.getNom () + ". " + "Bonjour " + a.getNom () + " moi c'est " + b.getNom () + ". " ; 

    }
}
