package design_pattern.creational.Factory.Transport;

public class LogisticFactoryFactory {
    public static LogisticsFactory createFactory(SupportedTransport t ){
        return switch (t){
            case SHIP -> new SeaFactory();
            case TRUCK -> new RoadFactory();
        };
    }
}
