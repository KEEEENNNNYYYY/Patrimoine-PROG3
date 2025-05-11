package HEI.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public abstract sealed class Possession permits Compte, Materiel, TrainDeVie {
    private final String nom;
    private final LocalDate aDateDe;
    private final Double valeur ;




    /*public double getValue(LocalDate date) {
        double value = 0.0;
        LocalDate actualDate = LocalDate.now();

        long owningDuration = ChronoUnit.DAYS.between(purchaseDate, date);
        long depreciationRate = this.depreciationRate * owningDuration;
        if (depreciationRate > 100) {
            depreciationRate = 100;return value - (value * (depreciationRate / 100.0));
        }
        else{
            depreciationRate = this.depreciationRate * owningDuration;
            System.out.println("The value of this Possession is: " + (value - (value * (depreciationRate / 100.0))));
            return value - (value * (depreciationRate / 100.0));
        }
    }

    public double getValue() {
        double value = 0.0;

        LocalDate actualDate = LocalDate.now();
        long owningDuration = ChronoUnit.DAYS.between(purchaseDate, actualDate);
        long depreciationRate = this.depreciationRate * owningDuration;

        if (depreciationRate > 100) {
            depreciationRate = 100;
            return value - (value * (depreciationRate / 100.0));
        }
        else{
            depreciationRate = this.depreciationRate * owningDuration;

            System.out.println("The value of this Possession is: " + (value - (value * (depreciationRate / 100.0))) );

            return value - (value * (depreciationRate / 100.0));
        }
    }*/

}
