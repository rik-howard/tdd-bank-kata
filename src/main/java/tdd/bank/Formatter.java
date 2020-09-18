package tdd.bank;

import java.util.List;
import java.util.stream.Collectors;

class Formatter {

    List <Formation> formations (List <Transaction> transactions) {
        final Integer [] balance = {0};
        return transactions
            .stream ()
            .map (transaction -> {
                String stamp = transaction.stamp;
                Integer amount = transaction.amount;
                balance [0] += amount;
                return new Formation (stamp, amount, balance [0]);
            })
            .collect (Collectors.toList ())
        ;
    }

}
