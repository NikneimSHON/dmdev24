package javacore.lesson1.task1.structure;

public class Floor {
    private int floorNumber;
    private Flat[] flats;

    public Floor() {

    }

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void printInformation() {
        System.out.println("этаж " + floorNumber + ", количество квартир " + flats.length);
    }


}
