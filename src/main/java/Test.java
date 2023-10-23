public class Test {
    public static void main(String[] args) {
        Employer manager = new Manager("othmane", 5000);
        Employer technicien = new Technicien("nabil", 4000);
        Employer ingenieur = new Ingenieur("simo", 600);

        double salaireManager = manager.calculerSalaire();
        double salaireTechnicien = technicien.calculerSalaire();
        double salaireIngenieur = ingenieur.calculerSalaire();

        System.out.println("Salaire du Manager : " + salaireManager);
        System.out.println("Salaire du Technicien : " + salaireTechnicien);
        System.out.println("Salaire de l'Ingénieur : " + salaireIngenieur);
    }
}
