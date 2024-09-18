package javacore.lesson1.task1.structure;

public class Home {
    private int houseNumber;
    private Floor[] floors;

    public Home(){

    }
    public Home(int houseNumber, Floor[] floors) {
        this.houseNumber = houseNumber;
        this.floors = floors;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public Floor[] getFloors() {
        return floors;
    }
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    public void printInformation() {
        System.out.println("дом " + houseNumber + ", количество этажей " + floors.length);
    }


}
