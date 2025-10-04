package pizza.builder;

public class Toppings {
    protected String name;

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}