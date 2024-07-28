

package design_pattern.structural.Decorator;

/**
 * PlainPizza
 */
public class PlainPizza implements Pizza{
    
    
    @Override
    public String getDescription(){
        return "Plain Pizza";
    }

    @Override
    public double getPrice(){
        return 10.5;
    }
    
}