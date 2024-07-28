
package design_pattern.structural.Decorator;

/**
 * CheeseDecorator
 */
public class CheeseDecorator extends PizzaDecorator{
    
    public CheeseDecorator(Pizza p ) {
        super(p);
    } 

    public String getDescription(){
        return pizza.getDescription() + " " + "Added cheese";
    }
    public double getPrice(){
        return pizza.getPrice() + 4.5;
    }
}