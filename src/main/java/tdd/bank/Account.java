package tdd.bank;

import java.util.List;

class Account {

    private final Acceptor acceptor;
    private final Stamper stamper;
    private final Creator creator;
    private final History history;
    private final Formatter formatter;
    private final Displayer displayer;

    Account (Acceptor acceptor, Stamper stamper, Creator creator, History history, Formatter formatter, Displayer displayer) {
        this.acceptor = acceptor;
        this.stamper = stamper;
        this.creator = creator;
        this.history = history;
        this.formatter = formatter;
        this.displayer = displayer;
    }

    void deposit (Integer amount) {
        if (acceptor.accepts (amount)) {
            String stamp = stamper.stamp ();
            Transaction transaction = creator.transaction (amount, stamp);
            history.store (transaction);
        }
        else throw new IllegalArgumentException ("amount unacceptable: " + amount);
    }

    void withdraw (Integer amount) {
        if (acceptor.accepts (amount)) {
            String stamp = stamper.stamp ();
            Transaction transaction = creator.transaction (-amount, stamp);
            history.store (transaction);
        }
        else throw new IllegalArgumentException ("amount unacceptable: " + amount);
    }

    void printStatement () {
        List <Transaction> transactions = history.transactions ();
        List <Formation> formations = formatter.formations (transactions);
        displayer.display (formations);
    }

}
