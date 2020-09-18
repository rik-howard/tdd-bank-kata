package tdd.bank;

class Account {

    private final Acceptor acceptor;
    private final Stamper stamper;
    private final Creator creator;
    private final History history;

    Account (Acceptor acceptor, Stamper stamper, Creator creator, History history) {
        this.acceptor = acceptor;
        this.stamper = stamper;
        this.creator = creator;
        this.history = history;
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
        throw new UnsupportedOperationException ();
    }

    void printStatement () {
        throw new UnsupportedOperationException ();
    }

}
