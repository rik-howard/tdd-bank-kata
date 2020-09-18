package tdd.bank;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

class Acceptance {

    @Mock Acceptor acceptor;
    @Mock Stamper stamper;
    @Mock Creator creator;
    @Mock History history;
    @Mock Formatter formatter;
    @Mock Displayer displayer;

    @BeforeEach void
    set_up () {initMocks (this);}

    @Test void
    depositing_stores_transaction () {
        //given
        Integer amount = 0;
        String stamp = "1970-01-01";
        Transaction transaction = new Transaction ();
        Account account = new Account (acceptor, stamper, creator, history, null, null);
        // when
        when (acceptor.accepts (amount)).thenReturn (true);
        when (stamper.stamp ()).thenReturn (stamp);
        when (creator.transaction (amount, stamp)).thenReturn (transaction);
        account.deposit (amount);
        // then
        verify (acceptor).accepts (amount);
        verify (stamper).stamp ();
        verify (creator).transaction (amount, stamp);
        verify (history).store (transaction);
    }

    @Test void
    withdrawing_stores_transaction () {
        // given
        Integer amount = 0;
        String stamp = "1970-01-01";
        Transaction transaction = new Transaction ();
        Account account = new Account (acceptor, stamper, creator, history, null, null);
        // when
        when (acceptor.accepts (amount)).thenReturn (true);
        when (stamper.stamp ()).thenReturn (stamp);
        when (creator.transaction (amount, stamp)).thenReturn (transaction);
        account.withdraw (amount);
        // then
        verify (acceptor).accepts (amount);
        verify (stamper).stamp ();
        verify (creator).transaction (amount, stamp);
        verify (history).store (transaction);
    }

    @Test void
    printing_displays_transactions () {
        // given
        Formation formation = new Formation ();
        Transaction transaction = new Transaction ();
        List <Formation> formations = Collections.singletonList (formation);
        List <Transaction> transactions = Collections.singletonList (transaction);
        Account account = new Account (null, null, null, history, formatter, displayer);
        // when
        when (history.transactions ()).thenReturn (transactions);
        when (formatter.formations (transactions)).thenReturn (formations);
        account.printStatement ();
        // then
        verify (history).transactions ();
        verify (formatter).formations (transactions);
        verify (displayer).display (formations);
    }

}
