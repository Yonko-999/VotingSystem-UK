package votingsystem;
import java.util.ArrayList;
public class Admin extends Electeur {

    public Admin(String nom) {
        super(nom);
    }
 // ajouter un  candidat
    public void ajouterCandidat(ArrayList<Candidat> liste, Candidat c) {
        liste.add(c);
        System.out.println("Candidat ajouté !");
    }
// afficher les résultats
    public void afficherResultats(ArrayList<Candidat> liste) {
System.out.println("\n=== RESULTATS ===");
for (Candidat c : liste) {
            System.out.println(c.nom + " : " + c.getNombreVotes() + " votes");
        }
    }
}
