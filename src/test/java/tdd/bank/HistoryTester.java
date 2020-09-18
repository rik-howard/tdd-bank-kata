package tdd.bank;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HistoryTester {

    @Test void
    store () {
        //given
        String stamp = null;
        Integer amount = null;
        Transaction transaction = new Transaction (amount, stamp);
        List <Transaction> transactions = new ArrayList <> ();
        History history = new History (transactions);
        //when
        history.store (transaction);
        //then
        List <Transaction> expected = singletonList (transaction);
        //noinspection UnnecessaryLocalVariable
        List <Transaction> actual = transactions;
        assertEquals (expected, actual);

    }

    @Test void
    transactions () {
        //given
        String stamp = null;
        Integer amount = null;
        Transaction transaction = new Transaction (amount, stamp);
        List <Transaction> transactions = singletonList (transaction);
        //when
        History history = new History (transactions);
        //then
        //noinspection UnnecessaryLocalVariable
        List <Transaction> expected = transactions;
        List <Transaction> actual = history.transactions ();
        assertEquals (expected, actual);
    }

}
