package HEI.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class Argent {
    private final Double montant;
    private final Devise devise;
}
