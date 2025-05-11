package HEI.model;

import java.time.LocalDate;

public final class Materiel  extends Possession{
    private final Double tauxDAppreciiation;
    private final LocalDate dateDAcquisition;

    public Materiel(String nom, LocalDate aDateDe, Argent valeur, Double tauxDAppreciiation, LocalDate dateDAcquisition) {
        super(nom, aDateDe, valeur);
        this.tauxDAppreciiation = tauxDAppreciiation;
        this.dateDAcquisition = dateDAcquisition;
    }
    @Override
    public Possession projectionFuture(LocalDate dateFuture){
        return null;
    }
}
