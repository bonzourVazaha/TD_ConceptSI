package TD2_CASI;

import java.util.ArrayList;
import java.util.*;

public class Graphe {
    ArrayList<Noeud> noeuds = new ArrayList<Noeud>();
    public void supprimerPersonne(String prenom) {
        Iterator<Noeud> n = noeuds.iterator();
        while (this.noeuds.hasNext() ) {
            if(this.noeuds[compteur].getPrenom().equals(prenom)) {
                this.noeuds.remove(n);
                System.out.println("Noeud supprimé ! ");
            }
        }
    }
    public void afficher() {
        int compteur = 1;
        for (Noeud n : this.noeuds) {
            System.out.println("Noeud "+compteur);
            System.out.println("Prenom : "+n.getPrenom());
            System.out.println("Nom : "+n.getNom());
            System.out.println("Age : "+n.getAge());
            System.out.println("Sexe : "+n.getSexe());
            compteur ++;
        }
    }

}
