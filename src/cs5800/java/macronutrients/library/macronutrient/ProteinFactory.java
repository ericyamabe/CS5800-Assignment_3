package macronutrients.library.macronutrient;

import macronutrients.library.MacronutrientFactory;

public class ProteinFactory extends MacronutrientFactory {
    private static ProteinFactory instance;

    private ProteinFactory() {
        this.foodList.add("Fish");
        this.foodList.add("Chicken");
        this.foodList.add("Beef");
        this.foodList.add("Tofu");
    }

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }
}
