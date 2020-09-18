package tdd.bank;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static java.util.Collections.singletonList;
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
        String stamp = null;
        Integer amount = null;
        Transaction transaction = new Transaction (amount, stamp);
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
        String stamp = null;
        Integer amount = null;
        Transaction transaction = new Transaction (amount, stamp);
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
        Formation formation = new Formation (null, null, null);
        Transaction transaction = new Transaction (null, null);
        List <Formation> formations = singletonList (formation);
        List <Transaction> transactions = singletonList (transaction);
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
