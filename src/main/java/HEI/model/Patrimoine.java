package HEI.model;

import lombok.AllArgsConstructor;

import java.util.List;
import java.time.LocalDate;

@AllArgsConstructor
public class Patrimoine {
    private final Personne proprietaire;
    private final LocalDate date;
    private final List<Possession> possessions;
}
