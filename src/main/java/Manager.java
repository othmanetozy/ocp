public class Manager implements Employer{
    private String nom;
    private double salaireBase;

    public Manager(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    @Override
    public double calculerSalaire() {
        return this.salaireBase * 2.5;
    }


}
