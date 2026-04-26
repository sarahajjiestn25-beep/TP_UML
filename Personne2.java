//ex2
import java.util.*;
class Personne2 {
    int num;
    String nom;
    //liste pour les comptes
    List<Compte> comptes = new ArrayList<>();
    public Personne2(int num, String nom) {
        this.num = num;
        this.nom = nom;
    }
    //fonction pour ajouter des comptes
    public void ajouterCompte(Compte c) {
        comptes.add(c);
    }
}
class OrganismeBancaire {
    public int num;
    public String nom;
    List<Compte> comptes = new ArrayList<>();
    public OrganismeBancaire(int num, String nom) {
        this.num = num;
        this.nom = nom;
    }
    public Compte creerCompte(Personne2 p, int num) {
        Compte c = new Compte(num, p, this);//this howa reference l'objet actuel mn classe OrganismeBancaire
        comptes.add(c);
        p.ajouterCompte(c);
        return c;
    }
}
class Compte {
    int numero;
    Personne2 titulaire;
    OrganismeBancaire banque;
    public Compte(int numero, Personne2 p, OrganismeBancaire b) {
        this.numero = numero;
        this.titulaire = p;// p hiya personne li 3ndha had compte
        this.banque = b;
    }
}