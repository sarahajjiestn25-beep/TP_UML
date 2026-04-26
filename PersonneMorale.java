//ex3
class PersonneMorale extends Personne3 {
    public String ns;     // ns c-a-d nom de societe
    public PersonneMorale(String ns, String nom, String prenom) {
        super(nom,prenom);
        this.ns = ns;
    }
}