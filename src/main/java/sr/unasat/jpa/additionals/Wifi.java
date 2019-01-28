package sr.unasat.jpa.additionals;

public class Wifi extends RoomDecorator {
    final double price = 40;

    public Wifi(Room newRoom){
        super(newRoom);
        System.out.println("Adding Wifi");
    }

    @Override
    public String getName() {
        return tempRoom.getName() + ", Wifi";
    }

    @Override
    public double getCosts() {
        return tempRoom.getCosts() + price;
    }
}
