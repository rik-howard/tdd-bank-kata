package tdd.bank;

import java.util.List;

class Displayer {

    void display (List <Formation> formations) {
        formations
            .forEach (System.out::print);
    }

}
