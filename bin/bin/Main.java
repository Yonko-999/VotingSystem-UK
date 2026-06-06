//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package votingsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static ArrayList<Candidat> candidats;

    static {
        sc = new Scanner(System.in);
        candidats = new ArrayList();
    }

    public Main() {
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Electeur");
            System.out.println("2. Candidat");
            System.out.println("3. Administrateur");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");
            int choix = sc.nextInt();
            switch (choix) {
                case 0:
                    System.out.println("Fin du programme...");
                    return;
                case 1:
                    menuElecteur();
                    break;
                case 2:
                    menuCandidat();
                    break;
                case 3:
                    menuAdmin();
                    break;
                default:
                    System.out.println("Choix invalide !");
            }

        }

        static void menuElecteur() {
            while(true) {
                System.out.println("\n--- MENU ELECTEUR ---");
                System.out.println("1. Voter");
                System.out.println("2. Voir les resultats");
                System.out.println("0. Retour");
                System.out.print("Choix : ");
                int choix = sc.nextInt();
                if (choix == 0) {
                    return;
                }

                switch (choix) {
                    case 1:
                        voter();
                        break;
                    case 2:
                        afficherResultats();
                        break;
                    default:
                        System.out.println("Choix invalide");
                }
            }
        }

        static void menuAdmin() {
            while(true) {
                System.out.println("\n--- MENU ADMIN ---");
                System.out.println("1. Enregistrer candidat");
                System.out.println("2. Afficher resultats");
                System.out.println("0. Retour");
                System.out.print("Choix : ");
                int choix = sc.nextInt();
                if (choix == 0) {
                    return;
                }

                switch (choix) {
                    case 1:
                        ajouterCandidat();
                        break;
                    case 2:
                        afficherResultats();
                        break;
                    default:
                        System.out.println("Choix invalide");
                }
            }
        }

        static void menuCandidat() {
            while(true) {
                System.out.println("\n--- MENU CANDIDAT ---");
                System.out.println("1. S'authentifier");
                System.out.println("0. Retour");
                System.out.print("Choix : ");
                int choix = sc.nextInt();
                if (choix == 0) {
                    return;
                }

                switch (choix) {
                    case 1:
                        authentifierCandidat();
                        break;
                    default:
                        System.out.println("Choix invalide");
                }
            }
        }

        static void ajouterCandidat() {
            sc.nextLine();
            System.out.print("Nom candidat : ");
            String nom = sc.nextLine();
            System.out.print("Mot de passe : ");
            String mdp = sc.nextLine();
            candidats.add(new Candidat(nom, mdp));
            System.out.println("Candidat ajouté !");
        }

        static void voter() {
            if (candidats.isEmpty()) {
                System.out.println("Aucun candidat !");
            } else {
                System.out.println("Liste des candidats :");

                for(int i = 0; i < candidats.size(); ++i) {
                    System.out.println(i + 1 + ". " + ((Candidat)candidats.get(i)).nom);
                }

                System.out.print("Choisir candidat : ");
                int choix = sc.nextInt();
                if (choix >= 1 && choix <= candidats.size()) {
                    ((Candidat)candidats.get(choix - 1)).ajouterVote();
                    System.out.println("Vote enregistré !");
                } else {
                    System.out.println("Choix invalide !");
                }
            }
        }

        static void afficherResultats() {
            System.out.println("\n===== RESULTATS =====");

            for(Candidat c : candidats) {
                String var10001 = c.nom;
                System.out.println(var10001 + " : " + c.getNombreVotes() + " vote(s)");
            }

        }

        static void authentifierCandidat() {
            sc.nextLine();
            System.out.print("Nom : ");
            String nom = sc.nextLine();
            System.out.print("Mot de passe : ");
            String mdp = sc.nextLine();

            for(Candidat c : candidats) {
                if (c.nom.equals(nom) && c.authentifier(mdp)) {
                    System.out.println("Authentification réussie !");
                    return;
                }
            }

            System.out.println("Echec authentification !");
        }
}
