package tdd.bank;

import java.sql.Date;

class Stamper {

    String stamp () {
        long millis = System.currentTimeMillis ();
        Date date = new Date (millis);
        return date.toString ();
    }

}
