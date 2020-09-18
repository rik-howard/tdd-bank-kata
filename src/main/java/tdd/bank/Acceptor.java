package tdd.bank;

class Acceptor {

    Boolean accepts (Integer amount) {
        return amount != null && amount > 0;
    }

}
