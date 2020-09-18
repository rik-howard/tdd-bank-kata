package tdd.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HistoryTester {

    @Test void
    store () {
        // given
        String stamp = null;
        Integer amount = null;
        Transaction transaction = new Transaction (amount, stamp);
        List <Transaction> transactions = new ArrayList <> ();
        History history = new History (transactions);
        // when
        history.store (transaction);
        // then
        List <Transaction> expected = Collections.singletonList (transaction);
        //noinspection UnnecessaryLocalVariable
        List <Transaction> actual = transactions;
        assertEquals (expected, actual);

    }

}