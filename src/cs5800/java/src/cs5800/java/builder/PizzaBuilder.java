package src.cs5800.java.builder;
import java.util.ArrayList;
import src.cs5800.java.builder.Toppings;

public class PizzaBuilder {
    private ArrayList<Toppings>toppings;
    protected String size;

    public void setSize(String size) {
        this.size = size;
    }

    public void addTopping(String toppingName) {
        if(this.toppings == null) {
            this.toppings = new ArrayList<Toppings>();
        }
        Toppings toppingsTemp = new Toppings();
        toppingsTemp.setName(toppingName);
        this.toppings.add(toppingsTemp);
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