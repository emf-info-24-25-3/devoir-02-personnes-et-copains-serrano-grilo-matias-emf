package models;

public class Personne {
    private final String prenom;
    private final String nom;
    public static final int MAX_COPAINS = 10;
    private Personne[] copains;
    private int nbCopains;

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom.toUpperCase();
        this.copains = new Personne[MAX_COPAINS];
        this.nbCopains = 0;
    }

    public boolean ajouterCopain(Personne copain) {
        if (nbCopains < MAX_COPAINS) {
            copains[nbCopains++] = copain;
            return true;
        }
        return false;
    }

    public boolean supprimerCopain(Personne copain) {
        for (int i = 0; i < nbCopains; i++) {
            if (copains[i] == copain) {
                copains[i] = copains[--nbCopains];
                copains[nbCopains] = null;
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String resultat = prenom + " " + nom + " et ses copains (";
        for (int i = 0; i < nbCopains; i++) {
            resultat += copains[i].prenom + " " + copains[i].nom;
            if (i < nbCopains - 1) resultat += ", ";
        }
        return resultat + ")";
    }
}
