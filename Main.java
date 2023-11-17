import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix","chef");
        Gaulois agecanonix = new Gaulois("Agecanonix","retraité");
        Gaulois assurancetourix = new Gaulois("Assurancetourix","barde");
        Gaulois bonemine = new Gaulois("Bonemine","femme du chef");
        Gaulois astérix = new Gaulois("Astérix","héros");
        Gaulois obélix = new Gaulois("Obélix","tailleur de menhir");
        Gaulois cétautomatix = new Gaulois("Cétautomatix","forgeron");
        Gaulois tragicomix = new Gaulois("Tragicomix","beau gosse");
        Gaulois ordralbabétix = new Gaulois("Ordralbabétix","poissonnier");
        Gaulois falbala = new Gaulois("Falbala","fiancée");
        Druide panoramix = new Druide (10, 5,"Panoramix"); 
        ArrayList<Gaulois> a = new ArrayList<Gaulois> ()  ; 
        a.add(agecanonix);
        a.add(assurancetourix);
        a.add(bonemine);
        a.add(astérix);
        a.add(obélix);
        a.add(cétautomatix);
        a.add(tragicomix);
        a.add(ordralbabétix);
        a.add(falbala);
        VillageDeGaulois irréductiblesGaulois= new VillageDeGaulois(abraracourcix, panoramix, a);
        System.out.println(irréductiblesGaulois.toString()); 
        System.out.println(irréductiblesGaulois.seRencontrer(abraracourcix, bonemine));
        Romain caiusObtus = new Romain("CaiusObtus",Grade.chef);
        Romain brutus = new Romain("Brutus",Grade.centurion);
        Romain briseradius = new Romain("Briseradius",Grade.legionnaire);
        Romain caligulaMinus= new Romain("CaligulaMinus",Grade.legionnaire);
        Romain chorus = new Romain("Chorus",Grade.centurion);
        Romain milexcus= new Romain("Milexcus",Grade.legionnaire);
        ArrayList<Romain> b = new ArrayList<Romain> ()  ; 
        b.add(brutus);
        b.add(briseradius);
        b.add(caligulaMinus);
        b.add(chorus);
        b.add(milexcus);
        CampDesRomains babaorum= new CampDesRomains(caiusObtus, b );
        System.out.println(babaorum.toString()); 
        System.out.println(babaorum.seRencontrer(caiusObtus, caligulaMinus));
        System.out.println(babaorum.seRencontrer(milexcus, chorus));
        System.out.println(babaorum.attaquer(irréductiblesGaulois));
        System.out.println(irréductiblesGaulois.toString()); 


        




  }
}
