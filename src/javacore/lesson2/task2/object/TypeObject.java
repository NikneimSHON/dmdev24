package javacore.lesson2.task2.object;

public enum TypeObject {
    STAR(6, "Звезда"),
    PLANET(5, "Планета"),
    ASTEROID(3, "Астероид"),
    COMET(2, "Комета"),
    ACTIFICAL_BODY(1, "Искусственное небесное тело");

    private final Integer rank;
    private final String type;

    TypeObject(Integer rank, String type) {
        this.rank = rank;
        this.type = type;
    }

    @Override
    public String toString() {
        return this.name();
    }

    public Integer getRank() {
        return rank;
    }

    public String getDescription() {
        return type;
    }

}
