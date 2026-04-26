# UML & Java TP
## 📌 Description
Ce projet est un TP en Java basé sur la programmation orientée objet (POO) et la modélisation UML.  
Il contient plusieurs exercices représentant différents concepts et relations entre objets.

---

## 📁 Structure du projet

### 🧾 Exercice 1 — Personne
**`Personne.java`**  
Classe représentant une personne avec gestion du mariage, des enfants et des conjoints.  
- Mariage avec contraintes (max 4 femmes pour un homme, max 1 mari pour une femme)  
- Ajout d'enfants avec lien automatique vers les parents

---

### 🏦 Exercice 2 — Compte Bancaire
**`Personne2.java` · `OrganismeBancaire.java` · `Compte.java`**  
Gestion des comptes bancaires entre une personne et un organisme bancaire.  
- Une personne peut avoir plusieurs comptes  
- Un organisme bancaire crée et gère les comptes  
- Chaque compte est lié à un titulaire et une banque

---

### 🚗 Exercice 3 — Héritage & Voiture
**`Personne3.java` · `PersonnePhysique.java` · `PersonneMorale.java` · `Voiture.java`**  
Modélisation de l'héritage entre personnes physiques et morales.  
- `Personne3` : classe mère, peut posséder une voiture  
- `PersonnePhysique` : hérite de `Personne3`, possède un NSS, peut avoir jusqu'à 3 employeurs  
- `PersonneMorale` : hérite de `Personne3`, représente une société  
- `Voiture` : liée à une personne (physique ou morale) via `Personne3`

---

### ▶️ Exercice 4 — Collège
**`College.java` · `Departement.java` · `Enseignant.java` · `Matiere.java` · `Salle.java` · `Etudiant.java`**  
Gestion d'un collège avec départements, enseignants, matières et étudiants.  
- Calcul de moyenne par matière et par département  
- Moyenne générale d'un étudiant  
- Fiche signalétique d'un enseignant ou étudiant  
- Liste des matières sans note pour un étudiant

---

### ▶️ Point d'entrée
**`Main.java`**  
Classe principale contenant les tests pour chaque exercice.

---

## 🎯 Objectif du TP
- Comprendre l'héritage en Java
- Manipuler les classes et objets
- Représenter un modèle UML en code Java
- Gérer les relations entre classes (association, composition, héritage)

---

## 🛠️ Technologies utilisées
- Java (POO)
- UML (diagramme de classes)

---

## 👩‍💻 Réalisé par
Sara Hajji – ILCS
