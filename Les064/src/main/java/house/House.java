package house;

public class House {
    private Room kitchen = new Room("kitchen");
    private Room bathRoom = new Room("bathroom'");
    private Room livingRoom = new Room("livingroom");
    private Room sleepingRoom = new Room("sleepingroom");

    public Room getKitchen(){
        return this.kitchen;
    }

    public Room getBathRoom(){
        return this.bathRoom;
    }

    // ...
}
