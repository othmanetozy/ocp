public class Technicien implements Employer{
    private String nom;
    private double salaireBase;

    public Technicien(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    @Override
    public double calculerSalaire() {
        return this.salaireBase * 1.25;
    }
}
