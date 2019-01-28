package sr.unasat.jpa.additionals;

public class Jacuzzi extends RoomDecorator {
    final double price = 200;

    public Jacuzzi(Room newRoom){
        super(newRoom);
        System.out.println("Adding Jacuzzi");
    }

    @Override
    public String getName() {
        return tempRoom.getName() + ", Jacuzzi";
    }

    @Override
    public double getCosts() {
        return tempRoom.getCosts() + price;
    }
}
