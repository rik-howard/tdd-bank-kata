package tdd.bank;

import java.util.List;
import static java.util.Collections.reverse;

class Displayer {

    void display (List <Formation> formations) {
        reverse (formations);
        formations
            .forEach (System.out::print)
        ;
    }

}
