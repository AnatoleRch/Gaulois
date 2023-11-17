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
        String preparation = lesRomains.attaquer(lesGaulois) ; 
        if (strategie == Strategie.file ){
            
            for (Gaulois g : lesGaulois.getLesGaulois()){
                while (g.getForce()>0 ) {
                    for (Romain r : lesRomains.getLesRomains()){
                        while (r.getForce()>0 ) {
                            r.prendreBaffe(g) ;  
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
