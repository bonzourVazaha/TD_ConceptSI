package org.example;
import java.util.Scanner;
import java.lang.reflect.Field;

public class Menu {
    Graphe g = new Graphe();
    Scanner sc = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);
    public void lancer() {
        boolean fin = false;
        while (! fin){
            this.afficher();
            int option = sc.nextInt();
            //Class value = option.getClass();
            System.out.println();
            if (option == 1){
                this.creerNoeud();
            }
            else if (option == 2){
                this.supprimerNoeud();
            }
            else if (option == 3){
                this.ajouterRelation();
            }
            else if (option == 4){
                this.supprimerRelation();
            }
            else if (option == 5){
                this.determinerStatuts();
            }
            else if (option == 10){
                fin = true;
            }
            else {
                System.out.println("Caractère non reconnu, recommencez");
            }

        }
    }
    private void determinerStatuts() {

    }

    private void supprimerRelation() {
        System.out.println("Veuillez saisir le prénom de la personne de qui part la relation :");
        String prenomP1 = scan.nextLine();
        System.out.println("Veuillez saisir le prénom de la personne vers qui va la relation :");
        String prenomP2 = scan.nextLine();
    }

    private void ajouterRelation() {
        System.out.println("Veuillez saisir le prénom de la personne de qui part la relation :");
        String prenomP1 = scan.nextLine();
        System.out.println("Veuillez saisir le prénom de la personne vers qui va la relation :");
        String prenomP2 = scan.nextLine();
    }

    private void supprimerNoeud() {
        System.out.println("Veuillez saisir le prénom de la personne à supprimer :");
        String prenom = scan.nextLine();
        g.supprimerPersonne(prenom);
    }

    private void creerNoeud() {
        System.out.println("Veuillez saisir le prénom de la personne à ajouter : ");
        String prenom = scan.nextLine();
        System.out.println("Veuillez saisir le nom de la personne à ajouter : ");
        String nom = scan.nextLine();
        System.out.println("Veuillez saisir l'âge de la personne à ajouter : ");
        int age = scan.nextInt();
        System.out.println("Veuillez saisir le sexe de la personne à ajouter : ");
        String sexe = scan.nextLine();
        Noeud n = new Noeud(prenom, nom, age, sexe, g);
        g.afficher();
    }

    public void afficher() {
        System.out.println("1 - Créer un noeud");
        System.out.println("2 - Supprimer un noeud");
        System.out.println("3 - Ajouter une relation");
        System.out.println("4 - Supprimer une relation");
        System.out.println("5 - Déterminer les statuts");
        System.out.println("10 - Fin");
        System.out.print("Entrez l'option souhaité :");
    }


}