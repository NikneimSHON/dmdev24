package javacore.lesson1.task1.structure;

public class Room {
    private boolean roomStatus;

    public Room(boolean passRoom) {
        this.roomStatus = passRoom;
    }

    public Room() {

    }

    public boolean isRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(boolean roomStatus) {
        this.roomStatus = roomStatus;
    }

    public void printInformation() {
        System.out.println("Комната " + (roomStatus ? "проходимая" : "не проходимая"));
    }
}

