package sr.unasat.jpa.additionals;

abstract class RoomDecorator implements Room{
    protected Room tempRoom;

    public RoomDecorator(Room newRoom) {
        this.tempRoom = newRoom;
    }

    @Override
    public String getName() {
        return tempRoom.getName();
    }

    @Override
    public double getCosts() {
        return tempRoom.getCosts();
    }
}
