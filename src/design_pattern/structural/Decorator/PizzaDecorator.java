

package design_pattern.structural.Decorator;

/**
 * PizzaDecorator
 */
public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription(){
        return this.pizza.getDescription();
    }

    @Override
    public double getPrice(){   
        return this.pizza.getPrice();
    }
    
}