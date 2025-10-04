package pizza;

import pizza.builder.PizzaCompany;
import pizza.builder.PizzaCompanyBuilder;

public class BuilderDriver {
    public static void main(String[] args) {
        PizzaCompany pizzaHut = new PizzaCompanyBuilder()
                .setName("Pizza Hut")
                .buildPizzaCompany();

        pizzaHut.createPizza("Small")
                .addTopping("Peperonni")
                .addTopping("Sausage");
        System.out.println(pizzaHut.eat());

        pizzaHut.createPizza("Large")
                .addTopping("Peperonni")
                .addTopping("Sausage")
                .addTopping("Mushrooms");
        System.out.println(pizzaHut.eat());

        PizzaCompany littleCaesars = new PizzaCompanyBuilder()
                .setName("Little Caesars")
                .buildPizzaCompany();

        littleCaesars.createPizza("Medium")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Peppers")
                .addTopping("Chicken")
                .addTopping("Spinach");
        System.out.println(littleCaesars.eat());

        littleCaesars.createPizza("Small")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms")
                .addTopping("Bacon")
                .addTopping("Onions")
                .addTopping("Peppers");
        System.out.println(littleCaesars.eat());

        PizzaCompany dominos = new PizzaCompanyBuilder()
                .setName("Dominos")
                .buildPizzaCompany();

        dominos.createPizza("Small")
                .addTopping("Pepperoni");
        System.out.println(dominos.eat());

        dominos.createPizza("Large")
                .addTopping("Pepperoni")
                .addTopping("Sausage")
                .addTopping("Mushrooms");

        System.out.println(dominos.eat());
    }
}