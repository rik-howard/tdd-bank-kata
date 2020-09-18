package tdd.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StamperTester {

    private final Stamper stamper = new Stamper ();

    @Test void
    stamp_conforms_to_pattern () {
        String expectedRegex = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
        String actualString = stamper.stamp ();
        assertTrue (actualString.matches (expectedRegex));
    }

}
