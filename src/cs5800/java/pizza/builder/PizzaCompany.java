package pizza.builder;

public class PizzaCompany {
    protected String name;
    protected PizzaBuilder pizzaBuilder;

    public void setName(String name) {
        this.name = name;
    }

    public PizzaBuilder createPizza(String size) {
        this.pizzaBuilder = new PizzaBuilder(size);
        return this.pizzaBuilder;
    }

    public String eat() {
        Pizza pizza = this.pizzaBuilder.createPizza();
        String pizzaComposition = pizza.eat();
        return this.name + " {" +  pizzaComposition + "}";
    }
}