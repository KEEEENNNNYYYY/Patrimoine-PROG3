package HEI.model;

import java.time.LocalDate;

public final  class TrainDeVie  extends Possession{

    public TrainDeVie(String nom, Devise devise, Argent valeur, Double tauxDapreciation) {
        super(nom, devise, valeur, tauxDapreciation);
    }

    @Override
    public Possession projectionFuture(LocalDate dateFuture) {
        return null;
    }
}
