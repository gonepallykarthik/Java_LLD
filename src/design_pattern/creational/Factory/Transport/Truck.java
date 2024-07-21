package design_pattern.creational.Factory.Transport;

public class Truck implements Transport{
    @Override
    public void delivery() {
        System.out.println("Deliverying through Truck");
    }
}
