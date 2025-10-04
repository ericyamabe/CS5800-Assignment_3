package pizza.builder;
import java.util.ArrayList;

public class PizzaBuilder {
    private ArrayList<Toppings>toppings;
    private String size;

    public PizzaBuilder(String size) {
        this.size = size;
    }

    public PizzaBuilder addTopping(String toppingName) {
        if(this.toppings == null) {
            this.toppings = new ArrayList<Toppings>();
        }
        Toppings toppingsTemp = new Toppings();
        toppingsTemp.setName(toppingName);
        this.toppings.add(toppingsTemp);
        return this;
    }

    public Pizza createPizza() {
        Pizza pizza = new Pizza();
        pizza.setSize(this.size);

        for (Toppings topping :this.toppings ){
            pizza.addTopping(topping);
        }

        return pizza;
    }
}