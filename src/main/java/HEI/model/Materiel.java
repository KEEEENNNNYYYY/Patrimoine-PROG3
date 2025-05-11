package HEI.model;

public final class Materiel  extends Possession{
    private final Double tauxDAppreciiation;
    private final Double valeur;

    public Materiel(String nom, Devise devise, Argent valeur, Double tauxDapreciation, Double tauxDAppreciiation, Double valeur1) {
        super(nom, devise, valeur, tauxDapreciation);
        this.tauxDAppreciiation = tauxDAppreciiation;
        this.valeur = valeur1;
    }

}
