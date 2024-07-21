package design_pattern.creational.Factory.Transport;

public class Ship implements Transport{

    @Override
    public void delivery() {
        System.out.println("deliverying through Ship! ");
    }
}
