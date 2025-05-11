package HEI.model;

import java.time.LocalDate;

public final class Compte extends Possession{

    public Compte(String nom, Double valeur, LocalDate aDateDe) {
        super(nom, valeur, aDateDe);
    }
}
