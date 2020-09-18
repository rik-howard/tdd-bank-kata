package tdd.bank;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

class EndToEnd {

    @Mock Stamper stamper;
    private final List <Transaction> transactions = new ArrayList <> ();
    private final Acceptor acceptor = new Acceptor ();
    private final Creator creator = new Creator ();
    private final History history = new History (transactions);
    private final Formatter formatter = new Formatter ();
    private final Displayer displayer = new Displayer ();

    @BeforeEach void
    set_up () {initMocks (this);}

    @Test void
    scenario () {
        // given
        ByteArrayOutputStream stdOut = new ByteArrayOutputStream ();
        Account account = new Account (acceptor, stamper, creator, history, formatter, displayer);
        String date0 = "2014-04-01";
        String date1 = "2014-04-02";
        String date2 = "2014-04-10";
        // when
        System.setOut (new PrintStream (stdOut));
        when (stamper.stamp ())
            .thenReturn (date0)
            .thenReturn (date1)
            .thenReturn (date2);
        account.deposit (1000);
        account.withdraw (100);
        account.deposit  (500);
        account.printStatement ();
        // then
        String expected =
            String.format ("Formation{stamp:%s;amount:500;balance:1400}", date2) +
            String.format ("Formation{stamp:%s;amount:-100;balance:900}", date1) +
            String.format ("Formation{stamp:%s;amount:1000;balance:1000}", date0);
        String actual = stdOut.toString ();
        assertEquals (expected, actual);
    }

}
