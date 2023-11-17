import java.util.ArrayList;
import java.util.TreeSet;

public class Bataille {
    private Strategie strategie ; 
    private VillageDeGaulois lesGaulois ; 
    private CampDesRomains lesRomains ; 

    public Bataille (Strategie strategie, VillageDeGaulois lesGaulois , CampDesRomains lesRomains) {
        this.strategie = strategie ; 
        this.lesGaulois = lesGaulois ; 
        this.lesRomains = lesRomains ; 
    }


    public String combattre () {
        String retour = lesRomains.attaquer(lesGaulois) ; 
        TreeSet<Gaulois> Gcombattant = new TreeSet<Gaulois>(lesGaulois.getLesGaulois());
        TreeSet<Romain> Rcombattant = new TreeSet<Romain>(lesRomains.getLesRomains());
        if (strategie == Strategie.file ){
            
            for (Gaulois g : Gcombattant ){
                while (g.getForce()>0 ) {
                    for (Romain r : Rcombattant){
                        while (r.getForce()>0 ) {
                            retour= retour +'\n'+r.prendreBaffe(g) ;  
                        }
                    }
                }

            }
            
            return null;
        }
        else {
            return null;
        }
        

    }
}
