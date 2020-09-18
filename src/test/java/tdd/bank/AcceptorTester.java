package tdd.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AcceptorTester {

    private final Acceptor acceptor = new Acceptor ();

    @Test void
    accepts_positives () {
        Integer amount = 1;
        Boolean expected = true;
        Boolean actual = acceptor.accepts (amount);
        assertEquals (expected, actual);
    }

    @Test void
    accepts_non_positives_not () {
        Integer amount = 0;
        Boolean expected = false;
        Boolean actual = acceptor.accepts (amount);
        assertEquals (expected, actual);
    }

    @Test void
    accepts_null_not () {
        Integer amount = null;
        Boolean expected = false;
        Boolean actual = acceptor.accepts (amount);
        assertEquals (expected, actual);
    }

}
