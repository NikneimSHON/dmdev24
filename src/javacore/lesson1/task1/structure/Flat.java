package javacore.lesson1.task1.structure;

import java.util.Random;

public class Flat {
    private int flatNumber;
    private Room[] rooms;

    public Flat(int countRoom,int flatNumber){
        Room[] rooms = new Room[countRoom];
        Random random = new Random();
        for(int currentIndex = 0; currentIndex < countRoom; currentIndex++){
            rooms[currentIndex] = new Room(random.nextBoolean());
        }
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }
    public Flat(){

    }

    public void printInformation() {
        System.out.println("Квартира номер " + flatNumber + ", количество комнат " + rooms.length);
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }
}
