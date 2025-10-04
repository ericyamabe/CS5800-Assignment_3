package pizza.builder;
import java.util.ArrayList;

public class Pizza {
    private ArrayList<Toppings>toppings;
    private String size;

    public void setSize(String size){
        this.size = size;
    }

    public void addTopping(Toppings topping) {
        if(this.toppings == null) {
            this.toppings = new ArrayList<Toppings>();
        }
        this.toppings.add(topping);
    }

    public String eat() {
        return this.size + " Pizza {" + this.toppings.toString() + "}";
    }
}