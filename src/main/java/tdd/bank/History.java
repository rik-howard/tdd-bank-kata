package tdd.bank;

import java.util.List;
import static java.util.Collections.unmodifiableList;

class History {

    private final List <Transaction> transactions;

    History (List <Transaction> transactions) {
        this.transactions = transactions;
    }

    void store (Transaction transaction) {
        transactions.add (0, transaction);
    }

    List <Transaction> transactions () {
        return unmodifiableList (transactions);
    }

}
