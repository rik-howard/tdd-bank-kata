package tdd.bank;

class Creator {

    Transaction transaction (Integer amount, String stamp) {
        return new Transaction (amount, stamp);
    }

}
