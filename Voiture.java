//ex3
class Voiture {
    public String immatriculation;
    public Personne3 proprietaire;
    // constructeur
    public Voiture(String immatriculation, Personne3 proprietaire) {
        this.immatriculation = immatriculation;
        this.proprietaire = proprietaire;
    }
    // afficher infos
    public void afficher() {
        System.out.println("Voiture: " + immatriculation);
        System.out.println("Propriétaire: " + proprietaire.nom);
    }
}