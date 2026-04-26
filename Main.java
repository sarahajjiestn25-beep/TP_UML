import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ==================== EX1 : Personne ====================
        System.out.println("===== EX1 =====");

        // ncreiw joj personnes
        Personne p1 = new Personne(2, "Ahmed");   // num pair = homme
        Personne p2 = new Personne(1, "Fatima");  // num impair = femme

        // mariage
        boolean marie = p1.marier(p2);
        System.out.println("Mariage Ahmed & Fatima: " + marie); // true

        // nzidow enfant
        Personne enfant = new Personne(3, "Youssef");
        p1.ajouterEnfant(enfant);
        System.out.println("Enfant ajouté: " + enfant.getNom());

        // ==================== EX2 : Compte Bancaire ====================
        System.out.println("\n===== EX2 =====");

        // ncreiw une personne et une banque
        Personne2 client = new Personne2(1, "Karim");
        OrganismeBancaire banque = new OrganismeBancaire(10, "BanqueMaroc");

        // la banque creiw un compte pour le client
        Compte compte = banque.creerCompte(client, 1001);
        System.out.println("Compte créé num: " + compte.numero);
        System.out.println("Titulaire: " + compte.titulaire.nom);
        System.out.println("Banque: " + compte.banque.nom);

        // ==================== EX3 : Personne Physique / Morale ====================
        System.out.println("\n===== EX3 =====");

        // ncreiw une personne morale (societe)
        PersonneMorale societe = new PersonneMorale("STE001", "TechMaroc", "");

        // ncreiw une personne physique
        PersonnePhysique employe = new PersonnePhysique(123456, "Sara", "Alami");

        // Sara kat khdem f had societe
        employe.ajouterEmployeur(societe);
        System.out.println("Employeur ajouté: " + societe.ns);
        System.out.println("Nombre d'employeurs: " + employe.employeurs.size());

        // ncreiw une voiture appartenant a la societe
        Voiture voiture = new Voiture("ABC-123", societe);
        voiture.afficher();
    }
}