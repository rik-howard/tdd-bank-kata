package tdd.bank;

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

    @BeforeEach void
    set_up () {initMocks (this);}

    @Test void
    depositing_stores_transaction () {
        //given
        Integer amount = 0;
        String stamp = "1970-01-01";
        Transaction transaction = new Transaction ();
        Account account = new Account (acceptor, stamper, creator, history);
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
        Account account = new Account (acceptor, stamper, creator, history);
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

}
