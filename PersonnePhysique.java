//ex3
import java.util.*;
class PersonnePhysique extends Personne3 {
    public int nss; //nss c-a-d un numéro de sécurité sociale
    List<PersonneMorale> employeurs = new ArrayList<>();
//constracteur
    public PersonnePhysique(int nss, String nom,String prenom) {
        super(nom,prenom);
        this.nss= nss;
    }
// fonction pour ajouter un employeur
    public void ajouterEmployeur(PersonneMorale p) {
        if (employeurs.size() < 3) {
            employeurs.add(p);
        } else {
            System.out.println("Max 3 sociétés !");
        }
    }
}