package design_pattern.creational.Factory.Transport;

public class SeaFactory implements LogisticsFactory{
    private String src;
    private String destination;

    @Override
    public void createPlan(String source, String destination) {
        this.src = source;
        this.destination = destination;
    }

    @Override
    public Transport createDelivery() {
        Ship s = new Ship();
        return s;
    }
}
