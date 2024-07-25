package design_pattern.Structural.Strategy;

/**
 * BusPathCalculatorStrategy
 */
public class BusPathCalculatorStrategy implements PathCalculatorStrategy{
    
    
    private static BusPathCalculatorStrategy instance;
    
    private BusPathCalculatorStrategy() {

    }
    
    public static BusPathCalculatorStrategy getInstance(){
        if(instance == null) {
            instance = new BusPathCalculatorStrategy();
        }

        return instance;
    }
    
    
    @Override
    public void findPath(String src, String des){
        System.out.println("Calculating path via Bus from " + src + " to " + des + " please wait...");
    }
    
}