package builder;
import builder.Toppings;

import java.util.ArrayList;

abstract class Company {
    protected String name;
    protected Pizza pizza;
    protected String size;
    protected ArrayList<String>toppings;

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setToppings(String toppings) {
        if(this.toppings == null) {
            this.toppings = new ArrayList<String>();
        }
        this.toppings.add(toppings);
    }

    public void createPizza() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        pizzaBuilder.setSize(this.size);

        for (String topping :this.toppings ){
            pizzaBuilder.addTopping(topping);
        }

        this.pizza = pizzaBuilder.createPizza();
    }

    public String eat() {
        String pizzaBuild = this.pizza.toString();
        return this.name + " {" +  pizzaBuild + "}";
    }
}