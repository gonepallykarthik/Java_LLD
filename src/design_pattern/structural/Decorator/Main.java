

package design_pattern.structural.Decorator;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Decorator design Pattern");
        
        Pizza new_Pizza = new PepperoniDecorator(new VeggieDecorator(new CheeseDecorator(new PlainPizza())));
        System.out.println("Total cost is " + new_Pizza.getPrice());
        System.out.println(new_Pizza.getDescription());
    }
}