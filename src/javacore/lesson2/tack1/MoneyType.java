package javacore.lesson2.tack1;

public enum MoneyType {
    SMALL(10, "Small money" ),
    MEDIUM(20, "Medium money"),
    LARGE(50, "Large money");

    private final Integer value;
    private final String description;

    MoneyType(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getClass() + " [value=" + value + ", description=" + description + "]";
    }

}
