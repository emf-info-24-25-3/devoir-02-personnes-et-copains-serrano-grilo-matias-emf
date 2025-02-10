package app;

import models.Personne;

public class Application {

        public static void main(String[] args) {
                Personne p1 = new Personne("Paulin", "Udriot");
                Personne p2 = new Personne("Loïc", "Rotzetter");
                Personne p3 = new Personne("Ksawier", "Paskowski");

                System.out.println(p1);
                System.out.println(p2);
                System.out.println(p3);

                p1.ajouterCopain(p2);
                p1.ajouterCopain(p3);

                System.out.println("ajout de copains....");

                System.out.println(p1);
        }
}
