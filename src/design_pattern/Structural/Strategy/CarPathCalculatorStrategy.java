
package design_pattern.Structural.Strategy;

/**
 * CarPathCalculatorStrategy
 */
public class CarPathCalculatorStrategy implements PathCalculatorStrategy{

    @Override
    public void findPath(String src, String des){
        System.out.println("Calculating path via Car from " + src + " to " + des + " please wait...");
    }
}