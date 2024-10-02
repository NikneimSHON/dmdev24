package javacore.lesson2.task2.object;

public class Asteroid extends SpaceObject {
    private final Integer discoveryYear;

    public Asteroid(Double size, Double massObject, String NameObject, Integer discoveryDate) {
        super(massObject, TypeObject.ASTEROID, NameObject, size);
        this.discoveryYear = discoveryDate;

    }

    public void absorbed() {
        System.out.println("Астероид врезался в груду пыли тем самым получив новые элементы");
    }

    @Override
    public void description() {
        System.out.println("Астероид — это небольшое небесное тело, состоящее в основном из камня и металла, " +
                "которое вращается вокруг Солнца. Астероиды в основном находятся в главном поясе " +
                "астероидов между орбитами Марса и Юпитера, " +
                "но некоторые из них могут пересекать орбиту Земли и классифицироваться как околоземные объекты.");
    }

    @Override
    public String toString() {
        return String.format("Star: %s%nDiscovery Date: %s%n%s",
                getNameObject(), discoveryYear, super.toString());
    }

    public Integer getDiscoveryYear() {
        return discoveryYear;
    }
}
