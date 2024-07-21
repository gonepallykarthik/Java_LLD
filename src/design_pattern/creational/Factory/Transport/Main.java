package design_pattern.creational.Factory.Transport;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory design Pattern");
        LogisticService service = new LogisticService(SupportedTransport.SHIP);
        LogisticsFactory factory = service.createLogisticFactory();
        factory.createPlan("India", "Europe");
        Transport t = factory.createDelivery();
        t.delivery();


    }
}
