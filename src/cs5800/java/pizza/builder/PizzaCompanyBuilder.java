package pizza.builder;

public class PizzaCompanyBuilder {
    protected String pizzaCompanyName;

    public PizzaCompanyBuilder setName(String pizzaCompanyName){
        this.pizzaCompanyName = pizzaCompanyName;
        return this;
    }

    public PizzaCompany buildPizzaCompany() {
        PizzaCompany newCompany = new PizzaCompany();
        newCompany.setName(this.pizzaCompanyName);
        return newCompany;
    }
}
