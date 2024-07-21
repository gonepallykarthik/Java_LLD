package design_pattern.creational.Factory.Transport;

public class RoadFactory implements LogisticsFactory{
    private String src;
    private String destination;

    @Override
    public void createPlan(String source, String destination) {
        this.src = source;
        this.destination = destination;
    }

    @Override
    public Transport createDelivery() {
        Truck t = new Truck();
        return t;
    }
}
