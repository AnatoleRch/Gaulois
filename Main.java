import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Gaulois Abraracourcix = new Gaulois("Abraracourcix","chef");
        Gaulois Agecanonix = new Gaulois("Agecanonix","retraité");
        Gaulois Assurancetourix = new Gaulois("Assurancetourix","barde");
        Gaulois Bonemine = new Gaulois("Bonemine","femme du chef");
        Gaulois Astérix = new Gaulois("Astérix","héros");
        Gaulois Obélix = new Gaulois("Obélix","tailleur de menhir");
        Gaulois Cétautomatix = new Gaulois("Cétautomatix","forgeron");
        Gaulois Tragicomix = new Gaulois("Tragicomix","beau gosse");
        Gaulois Ordralbabétix = new Gaulois("Ordralbabétix","poissonnier");
        Gaulois Falbala = new Gaulois("Falbala","fiancée");
        Gaulois Panoramix = new Gaulois("Panoramix","druide"); 
        ArrayList<Gaulois> a = new ArrayList<Gaulois> ()  ; 
        a.add(Agecanonix);
        a.add(Assurancetourix);
        a.add(Bonemine);
        a.add(Astérix);
        a.add(Obélix);
        a.add(Cétautomatix);
        a.add(Tragicomix);
        a.add(Ordralbabétix);
        a.add(Falbala);
        a.add(Panoramix);
        VillageDeGaulois irréductiblesGaulois= new VillageDeGaulois(Abraracourcix, a);
        System.out.println(irréductiblesGaulois.toString()); 




  }
}
