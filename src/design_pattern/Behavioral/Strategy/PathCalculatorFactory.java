
package design_pattern.Structural.Strategy;

/**
 * PathCalculatorFactory
 */
public class PathCalculatorFactory {
    
    public static PathCalculatorStrategy getPathCalculatorStrategy(SupportedModes mode) {
        if(mode == SupportedModes.CAR) {
            return new CarPathCalculatorStrategy();
        }

        else if (mode == SupportedModes.BIKE) {
            return BikePathCalculatorStrategy.getInstance();
        }

        else if(mode == SupportedModes.BUS) {
            return BusPathCalculatorStrategy.getInstance();
        }

        return null;
    }

}