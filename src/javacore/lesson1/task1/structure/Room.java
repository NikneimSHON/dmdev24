package javacore.lesson1.task1.structure;

public class Room {
    private final boolean roomStatus;

    public Room(boolean passRoom) {
        this.roomStatus = passRoom;
    }

    public boolean isPassRoom() {
        return roomStatus;

    }

    public void printInformation() {
        System.out.println("Комната " + (roomStatus ? "проходимая" : "не проходимая"));
    }
}

