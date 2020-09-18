package tdd.bank;

import java.util.List;

class History {

    private final List <Transaction> transactions;

    History (List <Transaction> transactions) {
        this.transactions = transactions;
    }

    void store (Transaction transaction) {
        transactions.add (0, transaction);
    }

    List <Transaction> transactions () {
        throw new UnsupportedOperationException ();
    }

}
