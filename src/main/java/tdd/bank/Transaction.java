package tdd.bank;

import java.util.Objects;

class Transaction {

    private final Integer amount;
    private final String stamp;

    Transaction (Integer amount, String stamp) {
        this.amount = amount;
        this.stamp = stamp;
    }

    @Override
    public boolean equals (Object object) {
        if (this == object) return true;
        else if (null == object) return false;
        else if (getClass ().equals (object.getClass ())) {
            Transaction that = (Transaction) object;
            return Objects.equals (this.amount, that.amount)
                && Objects.equals (this.stamp, that.stamp);
        }
        else return false;
    }

    @Override
    public int hashCode () {
        return Objects.hash (amount, stamp);
    }

    @Override
    public String toString () {
        String template = "Transaction{amount:%s;stamp:%s}";
        return String.format (template, amount, stamp);
    }

}
