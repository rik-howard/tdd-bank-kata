package tdd.bank;

import java.util.Objects;

class Formation {

    private final String stamp;
    private final Integer amount;
    private final Integer balance;

    Formation (String stamp, Integer amount, Integer balance) {
        this.stamp = stamp;
        this.amount = amount;
        this.balance = balance;
    }

    @Override public boolean equals (Object object) {
        if (this == object) return true;
        else if (null == object) return false;
        else if (getClass ().equals (object.getClass ())) {
            Formation that = (Formation) object;
            return Objects.equals (this.stamp, that.stamp) &&
                Objects.equals (this.amount, that.amount) &&
                Objects.equals (this.balance, that.balance);
        }
        else return false;
    }

    @Override public int hashCode () {
        return Objects.hash (stamp, amount, balance);
    }

    @Override public String toString () {
        String template = "Formation{stamp:%s;amount:%s;balance:%s}";
        return String.format (template, stamp, amount, balance);
    }

}
