package javacore.lesson4.enumfile;

public enum UniversityCourse {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4),
    FIFTH(5);

    private Integer value;

    UniversityCourse(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setVault(Integer value) {
        this.value = value;
    }

}
