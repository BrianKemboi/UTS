package timetable.generator;

public class Room {
    float capacity;
    String roomName;

    public Room (float capacity, String roomName){
        this.capacity=capacity;
        this.roomName =roomName;
    }

    public float getCapacity() {
        return capacity;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
