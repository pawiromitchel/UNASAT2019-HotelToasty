package sr.unasat.jpa.additionals;

public class BasicRoom implements Room{
    final int price = 200;

    @Override
    public String getName() {
        return "Basic Room";
    }

    @Override
    public double getCosts() {
        System.out.println("Starting price at " + price);
        return price;
    }
}
