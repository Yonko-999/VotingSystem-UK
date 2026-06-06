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
}
