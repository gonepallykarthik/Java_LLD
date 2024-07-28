

package design_pattern.structural.Decorator;

/**
 * VeggieDecorator
 */
public class VeggieDecorator extends PizzaDecorator {

    public VeggieDecorator(Pizza p ) {
        super(p);
    }

    public String getDescription(){
        return pizza.getDescription() + " " + "Added Veggies";
    }
    
    public double getPrice(){
        return pizza.getPrice() + 6.5;
    }
}