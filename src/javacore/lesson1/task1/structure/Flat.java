package javacore.lesson1.task1.structure;

import java.util.Random;

public class Flat {
    private final int flatNumber;
    private final Room[] rooms;

    public Flat(int flatNumber,int countRoom) {
        this.flatNumber = flatNumber;
        this.rooms = roomsBuilder(countRoom);
    }

    public Flat(int flatNumber, Room[] rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    private Room[] roomsBuilder(int countRoom) {
        Room[] rooms = new Room[countRoom];
        Random random = new Random();
        for (int currentIndex = 0; currentIndex < countRoom; currentIndex++) {
            rooms[currentIndex] = new Room(random.nextBoolean());
        }
        return rooms;
    }

    public void printInformation() {
        System.out.println("Квартира номер " + flatNumber + ", количество комнат " + rooms.length);
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

}
