package tdd.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AcceptorTester {

    private final Acceptor acceptor = new Acceptor ();

    @Test void
    accepts_positives () {
        Boolean expected = true;
        Integer amount = 1;
        Boolean actual = acceptor.accepts (amount);
        assertEquals (expected, actual);
    }

    @Test void
    accepts_non_positives_not () {
        Boolean expected = false;
        Integer amount = 0;
        Boolean actual = acceptor.accepts (amount);
        assertEquals (expected, actual);
    }

}
