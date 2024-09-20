package javacore.lesson1.task1.structure;

import java.util.Random;

public class Home {
    private int houseNumber;
    private Floor[] floors;

    public Home(int countFloors,int houseNumber) {
        Floor[] floors = new Floor[countFloors];
        Random random = new Random();
        for(int currentIndex = 0; currentIndex < countFloors; currentIndex++) {
            floors[currentIndex] = new Floor(random.nextInt(3), random.nextInt(1000));
        }
        this.houseNumber = houseNumber;
        this.floors = floors;
    }
    public Home(){

    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    public void printInformation() {
        System.out.println("Дом номер " + houseNumber + ", количество этажей " + floors.length);
    }


}
