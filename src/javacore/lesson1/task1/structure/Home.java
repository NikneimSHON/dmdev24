package javacore.lesson1.task1.structure;

import java.util.Random;

public class Home {
    private final int houseNumber;
    private final Floor[] floors;

    public Home(int houseNumber, int countFloors) {
        this.houseNumber = houseNumber;
        this.floors = floorsBuilder(countFloors);
    }

    public Home(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    private Floor[] floorsBuilder(int countFloors) {
        Floor[] floors = new Floor[countFloors];
        Random random = new Random();
        for (int currentIndex = 0; currentIndex < countFloors; currentIndex++) {
            floors[currentIndex] = new Floor(random.nextInt(1000),random.nextInt(3));
        }
        return floors;
    }

    public void printInformation() {
        System.out.println("Дом номер " + houseNumber + ", количество этажей " + floors.length);
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }

}
