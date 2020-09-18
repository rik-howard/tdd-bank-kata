package tdd.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CreatorTester {

    private final Creator creator = new Creator ();

    @Test void
    transaction () {
        String stamp = null;
        Integer amount = null;
        Transaction expected = new Transaction (amount, stamp);
        Transaction actual = creator.transaction (amount, stamp);
        assertEquals (expected, actual);
    }

}
