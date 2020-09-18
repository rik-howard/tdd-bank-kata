package tdd.bank;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HistoryTester {

    //given
    private final String stamp = null;
    private final Integer amount = null;
    private final Transaction transaction = new Transaction (amount, stamp);
    private final List <Transaction> transactions = new ArrayList <> ();
    private final History history = new History (transactions);

    @Test void
    store_and_retrieve () {
        //when
        history.store (transaction);
        //then
        List <Transaction> expected = singletonList (transaction);
        List <Transaction> actual = history.transactions ();
        assertEquals (expected, actual);

    }

}
