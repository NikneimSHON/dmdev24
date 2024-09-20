package javacore.lesson1.task1.structure;

import java.util.Random;

public class Floor {
    private int floorNumber;
    private Flat[] flats;

    public Floor(int countFlats,int floorNumber) {
        Flat[] flats = new Flat[countFlats];
        Random random = new Random();
        for (int currentIndex = 0; currentIndex < countFlats; currentIndex++) {
            flats[currentIndex] = new Flat(random.nextInt(3),random.nextInt(1000));
        }
        this.floorNumber = floorNumber;
        this.flats = flats;
    }
    public Floor(){

    }

    public void printInformation() {
        System.out.println("Этаж номер " + floorNumber + ", количество квартир " + flats.length);
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }
}
