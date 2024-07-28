package design_pattern.structural.Decorator;

public class PepperoniDecorator extends PizzaDecorator{

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public String getDescription(){
        return pizza.getDescription() + " " + "Added Pepperoni!";
    }

    @Override
    public double getPrice(){
        return pizza.getPrice() + 7.2;
    }
}
