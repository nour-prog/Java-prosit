import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
     /* ---------------------------------------- Prosit 10 ------------------------------------------------------ */

        DepartementHashSet D = new DepartementHashSet();

        D.ajouterDepartement(new Departement(3, "K27", 20));
        D.ajouterDepartement(new Departement(2, "J65", 16));
        D.ajouterDepartement(new Departement(1, "J89", 15));
        D.displayDepartement(); //It works
        System.out.println(D.rechercherDepartement("K27"));
        System.out.println(D.trierDepartementById());
    }
}