package votingsystem;
public class Electeur {
protected String nom;
public Electeur(String nom) {
        this.nom = nom;}
public void voter() {
        System.out.println(nom + " a voté");
 }
}
