import java.util.*;

class College {
    private String siteWeb;
    private List<Departement> departements = new ArrayList<>();

    public College(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    public List<Departement> getDepartements() {
        return departements;
    }
}

class Departement {
    private String nom;
    private Enseignant responsable;
    private List<Enseignant> enseignants = new ArrayList<>();

    public Departement(String nom) {
        this.nom = nom;
    }

    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

    public void setResponsable(Enseignant e) {
        this.responsable = e;
    }

    public Enseignant getResponsable() {
        return responsable;
    }

    public List<Enseignant> getEnseignants() {
        return enseignants;
    }

    public String getNom() {
        return nom;
    }

    public double moyenneDepartement(List<Etudiant> etudiants) {
        double sum = 0;
        int count = 0;
        for (Enseignant e : enseignants) {
            Matiere m = e.getMatiere();
            if (m == null) continue;
            for (Etudiant et : etudiants) {
                Double note = et.getNotes().get(m);
                if (note != null) { sum += note; count++; }
            }
        }
        return count == 0 ? 0 : sum / count;
    }
}

class Enseignant {
    private String nom;
    private String prenom;
    private String tel;
    private String mail;
    private Date datePriseFonction;
    private double indice;
    private Matiere matiere;

    public Enseignant(String nom, String prenom, String tel, String mail,
                      Date datePriseFonction, double indice) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.datePriseFonction = datePriseFonction;
        this.indice = indice;
    }

    public void setMatiere(Matiere m) { this.matiere = m; }
    public Matiere getMatiere()       { return matiere; }

    public void ficheSignaletique() {
        System.out.println("Prénom : " + prenom);
        System.out.println("Tél    : " + tel);
        System.out.println("Mail   : " + mail);
    }
}

class Matiere {
    private String nom;
    private Salle salle;
    private List<Enseignant> enseignants = new ArrayList<>();

    public Matiere(String nom, Salle salle) {
        this.nom = nom;
        this.salle = salle;
    }

    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
        e.setMatiere(this);
    }

    public List<Enseignant> getEnseignants() { return enseignants; }
    public Salle getSalle()                  { return salle; }
    public String getNom()                   { return nom; }

    public double moyenneMatiere(List<Etudiant> etudiants) {
        double sum = 0; int count = 0;
        for (Etudiant et : etudiants) {
            Double note = et.getNotes().get(this);
            if (note != null) { sum += note; count++; }
        }
        return count == 0 ? 0 : sum / count;
    }
}

class Salle {
    private String nom;
    private int capacite;

    public Salle(String nom, int capacite) {
        this.nom = nom;
        this.capacite = capacite;
    }

    public String getNom()   { return nom; }
    public int getCapacite() { return capacite; }
}

class Etudiant {
    private String nom;
    private String prenom;
    private String tel;
    private String mail;
    private int anneeEntree;
    private Map<Matiere, Double> notes = new HashMap<>();

    public Etudiant(String nom, String prenom, String tel, String mail, int anneeEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.anneeEntree = anneeEntree;
    }

    public void ajouterNote(Matiere m, double note) { notes.put(m, note); }
    public Map<Matiere, Double> getNotes()           { return notes; }

    public double moyenneGenerale() {
        if (notes.isEmpty()) return 0;
        double sum = 0;
        for (double n : notes.values()) sum += n;
        return sum / notes.size();
    }

    public List<Matiere> matieresSansNote(List<Matiere> toutes) {
        List<Matiere> res = new ArrayList<>();
        for (Matiere m : toutes)
            if (!notes.containsKey(m)) res.add(m);
        return res;
    }
    public void ficheSignaletique() {
        System.out.println("Prénom : " + prenom);
        System.out.println("Tél    : " + tel);
        System.out.println("Mail   : " + mail);
    }
}
