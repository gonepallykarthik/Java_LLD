
package design_pattern.Structural.Strategy;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        System.out.println("Strategy design pattern");

        PathCalculatorStrategy car = PathCalculatorFactory.getPathCalculatorStrategy(SupportedModes.CAR);
        car.findPath("India", "Europe");

        PathCalculatorStrategy bike = PathCalculatorFactory.getPathCalculatorStrategy(SupportedModes.BIKE);
        bike.findPath("India", "Europe");

        PathCalculatorStrategy bus = PathCalculatorFactory.getPathCalculatorStrategy(SupportedModes.BUS);
        bus.findPath("India", "Europe");
    }
}