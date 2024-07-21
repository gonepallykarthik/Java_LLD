package design_pattern.creational.Factory.Transport;

public class LogisticService {
    SupportedTransport t;

    public LogisticService(SupportedTransport t){
        this.t = t;
    }
    public void getDetails(){
        // sout
    }

    public LogisticsFactory createLogisticFactory(){
        return LogisticFactoryFactory.createFactory(this.t);
    }
}
