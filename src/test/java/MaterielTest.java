import HEI.models.Argent;
import HEI.models.Devise;
import HEI.models.Materiel;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class MaterielTest {
     @Test
     public void testMateriel() {
         Argent valeur = new Argent(1000.0, Devise.EURO);
         Materiel materiel = new Materiel("Ordinateur", LocalDate.now(), valeur, 10.0, LocalDate.now());

         assertEquals("Ordinateur", materiel.getNomDeLaPossession());
         assertEquals(LocalDate.now(), materiel.getADateDe());
         assertEquals(valeur, materiel.getValeur());
     }
}
