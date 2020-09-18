package tdd.bank;

import java.util.List;
import org.junit.jupiter.api.Test;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatterTester {

    @Test void
    formations () {
        //given
        String stamp = null;
        Integer amount = 0;
        Integer balance = 0;
        Formation formation = new Formation (stamp, amount, balance);
        Transaction transaction = new Transaction (amount, stamp);
        List <Transaction> transactions = singletonList (transaction);
        Formatter formatter = new Formatter ();
        //when
        //then
        List <Formation> expected = singletonList (formation);
        List <Formation> actual = formatter.formations (transactions);
        assertEquals (expected, actual);
    }
}