package javacore.lesson2.tack1;

public class Banknote {
    private final MoneyType denomination;
    private Integer count;

    public Banknote(MoneyType denomination, Integer count) {
        this.denomination = denomination;
        this.count = count;
    }

    public MoneyType getDenomination() {
        return denomination;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Banknote: " + denomination.getDescription() +
                ", Count: " + count +
                ", Value: " + denomination.getValue() + "\n";
    }




}
