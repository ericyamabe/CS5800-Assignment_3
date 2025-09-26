
import builder.PizzaHut;

public class Main {
    public static void main(String[] args) {
        PizzaHut pizzaHut = new PizzaHut();
        pizzaHut.setSize("Small");
        pizzaHut.setToppings("Pepperoni");
        pizzaHut.setToppings("Sausage");
        pizzaHut.setToppings("Mushrooms");
        pizzaHut.createPizza();
        System.out.println(pizzaHut.eat());

        PizzaHut pizzaHut2 = new PizzaHut();
        pizzaHut2.setSize("Medium");
        pizzaHut2.setToppings("Pepperoni");
        pizzaHut2.setToppings("Sausage");
        pizzaHut2.setToppings("Mushrooms");
        pizzaHut2.setToppings("Bacon");
        pizzaHut2.setToppings("Onions");
        pizzaHut2.setToppings("Peppers");
        pizzaHut2.createPizza();
        System.out.println(pizzaHut2.eat());

        PizzaHut pizzaHut3 = new PizzaHut();
        pizzaHut3.setSize("Medium");
        pizzaHut3.setToppings("Pepperoni");
        pizzaHut3.setToppings("Sausage");
        pizzaHut3.setToppings("Mushrooms");
        pizzaHut3.setToppings("Bacon");
        pizzaHut3.setToppings("Onions");
        pizzaHut3.setToppings("Peppers");
        pizzaHut3.setToppings("Chicken");
        pizzaHut3.setToppings("Olives");
        pizzaHut3.setToppings("Spinach");
        pizzaHut3.createPizza();
        System.out.println(pizzaHut3.eat());
    }
}