package tdd.bank;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import org.junit.jupiter.api.Test;
import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DisplayerTester {

    private final Displayer displayer = new Displayer ();

    @Test void
    display () {
        //given
        ByteArrayOutputStream stdOut = new ByteArrayOutputStream ();
        Formation formation = new Formation (null, null, null);
        List <Formation> formations = singletonList (formation);
        //when
        System.setOut (new PrintStream (stdOut));
        displayer.display (formations);
        //then
        String expected = "Formation{stamp:null;amount:null;balance:null}";
        String actual = stdOut.toString ();
        assertEquals (expected, actual);
    }

}