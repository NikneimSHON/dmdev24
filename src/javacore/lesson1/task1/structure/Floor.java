package javacore.lesson1.task1.structure;

import java.util.Random;

public class Floor {
    private final int floorNumber;
    private final Flat[] flats;

    public Floor(int floorNumber,int countFlats) {
        this.floorNumber = floorNumber;
        this.flats = flatsBuilder(countFlats);
    }

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    private Flat[] flatsBuilder(int countFlats) {
        Flat[] flats = new Flat[countFlats];
        Random random = new Random();
        for (int currentIndex = 0; currentIndex < countFlats; currentIndex++) {
            flats[currentIndex] = new Flat(random.nextInt(1000),random.nextInt(3));
        }
        return flats;
    }

    public void printInformation() {
        System.out.println("Этаж номер " + floorNumber + ", количество квартир " + flats.length);
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Flat[] getFlats() {
        return flats;
    }

}
