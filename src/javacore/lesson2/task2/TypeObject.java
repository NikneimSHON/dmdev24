package javacore.lesson2.task2;

public enum TypeObject {
    STAR(5, "Звезда"),
    PLANET(4, "Планета"),
    SATELLITE(3, "Спутник"),
    ASTEROID(2, "Астероид"),
    COMET(1, "Комета"),
    ACTIFICAL_BODY(0,"Искусственное тело");

    private final Integer rank;
    private final String description;

    TypeObject(Integer rank, String description) {
        this.rank = rank;
        this.description = description;
    }

    public Integer getRank() {
        return rank;
    }

    public String getDescription() {
        return description;
    }


}
