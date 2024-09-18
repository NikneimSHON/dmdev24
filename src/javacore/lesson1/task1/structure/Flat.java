package javacore.lesson1.task1.structure;

public class Flat {
    private int flatNumber;
    private Room[] rooms;

    public Flat() {

    }

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void printInformation() {
        System.out.println("квартира " + flatNumber + ", количество квартир " + rooms.length);
    }

}
