package HEI.models;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@AllArgsConstructor
public class Patrimoine {
    private final Personne proprietaire;
    private final LocalDate date;
    private final Set<Possession> possessions;

    public Double projectionFuture(LocalDate dateFuture) {
        Double totale = 0.0;
        for (Possession possession : possessions) {
            if (possession instanceof Compte compte) {
                totale += compte.getValeur().getMontant();
            } else if (possession instanceof Materiel materiel) {
                totale += materiel.getValeur().getMontant();
            } else if (possession instanceof TrainDeVie trainDeVie) {
                totale += trainDeVie.getValeur().getMontant();
            }
        }
        System.out.println("Total : " + totale);
        return totale;
    }
}
