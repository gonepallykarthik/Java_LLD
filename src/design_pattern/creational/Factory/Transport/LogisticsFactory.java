package design_pattern.creational.Factory.Transport;

public interface LogisticsFactory {
    void createPlan(String source, String destination);
    Transport createDelivery();
}
