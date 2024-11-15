package org.example;

public class Noeud {

    private String prenom;
    private String nom;
    private int age;
    private String sexe;

    public Noeud(String prenom, String nom, int age, String sexe, Graphe g) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
        g.noeuds.add(this);
        System.out.println("Nouveau noeud ! ");
    }

    public String getPrenom() {
        return this.prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public String getSexe() {
        return this.sexe;
    }

    public int getAge() {
        return this.age;
    }

}
