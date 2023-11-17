import java.util.ArrayList;

public class BateauPirate {
    private ArrayList<Pirate> lesPirates ; 
    private Pirate capitaine ; 

    public BateauPirate (Pirate capitaine){
        this.capitaine= capitaine ; 
        this.lesPirates = new ArrayList<Pirate> () ; 
    }
    public BateauPirate (Pirate capitaine, ArrayList<Pirate> lesPirates){
        this.capitaine= capitaine ; 
        this.lesPirates = lesPirates ; 
    }
}
