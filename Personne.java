//ex1
import java.util.*;
public class Personne {
    private int num;
    private String nom;
    // liste dyal les parents
    private List<Personne> parents = new ArrayList<>();
    // liste dyal les enfants
    private List<Personne> enfants = new ArrayList<>();
    // liste dyal les conjoints
    private List<Personne> conjoints = new ArrayList<>();
    public Personne(int num, String nom) {
        this.num = num;
        this.nom = nom;
    }
    public boolean marier(Personne p) {

        boolean thisIsMale = this.num % 2 == 0;
        boolean pIsMale = p.num % 2 == 0;

        //  même sexe non autorise
        if (thisIsMale == pIsMale) return false;

        // pour l'homme max 4 femmes
        if (thisIsMale && this.conjoints.size() >= 4) return false;
        if (pIsMale && p.conjoints.size() >= 4) return false;

        // pour la femme max 1 homme
        if (!thisIsMale && this.conjoints.size() >= 1) return false;
        if (!pIsMale && p.conjoints.size() >= 1) return false;

        // si toutes les conditions sont vrai alors le mariage ghykon accepte
        this.conjoints.add(p);
        p.conjoints.add(this);

        return true;
    }
    // méthode bach nzido enfant
    public void ajouterEnfant(Personne enfant) {
        // nzido l'enfant f liste dyal enfants
        this.enfants.add(enfant);
        // l'enfant kay3raf had personne comme parent
        enfant.parents.add(this);
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNum() {
        return num;
    }
    public void afficher() {
        System.out.println("Nom: " + nom + " | Num: " + num);
    }
}