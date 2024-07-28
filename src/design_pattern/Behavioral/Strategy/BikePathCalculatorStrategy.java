
package design_pattern.Structural.Strategy;

/**
 * BikePathCalculatorStrategy
 */
public class BikePathCalculatorStrategy implements PathCalculatorStrategy {

    private static BikePathCalculatorStrategy instance;

    private BikePathCalculatorStrategy(){ 

    }

    public static BikePathCalculatorStrategy getInstance(){
        if(instance == null) {
            instance = new BikePathCalculatorStrategy();
        }

        return instance;
    }

    @Override
    public void findPath(String src, String des){
        System.out.println("Calculating path via Bike from " + src + " to " + des + " please wait...");
    }
}