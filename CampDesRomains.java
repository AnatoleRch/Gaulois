import java.util.ArrayList;

public class CampDesRomains {
    private ArrayList<Romain> lesRomains ; 
    private Romain chef ; 

    public CampDesRomains (Romain chef){
        this.chef= chef ; 
        this.lesRomains = new ArrayList<Romain> () ; 
    }
    public CampDesRomains (Romain chef, ArrayList<Romain> lesRomains){
        this.chef= chef ; 
        this.lesRomains = lesRomains ; 
    }


    public String seRencontrer (Romain a , Romain b) {
        if (a.getGrade () == Grade.chef || (a.getGrade () == Grade.centurion && b.getGrade () == Grade.legionnaire   ) ){
        return "C’est à moi à te saluer " + a.getGrade () + " " + a.getNom () + ", je suis "+b.getNom () + ".";
        }else  ; 
        return "Je te salue " +b.getGrade () +" "+ b.getNom() + ", je suis " + a.getNom () + ". " ; 

    }
    public String toString(){
        return "Chef : "+chef+'\n'+"les autres  : "+lesRomains;
    }

    public String attaquer (VillageDeGaulois cible){
        return cible.sePreparer() ; 
    }
    public ArrayList<Romain> getLesRomains() {
        return lesRomains;
    }

}