package macronutrients.library.macronutrient;

import macronutrients.library.MacronutrientFactory;

public class CarbsFactory extends MacronutrientFactory {
    private static CarbsFactory instance;

    private CarbsFactory() {
        this.foodList.add("Cheese");
        this.foodList.add("Bread");
        this.foodList.add("Lentils");
        this.foodList.add("Pistachio");
    }

    public static CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance;
    }
}
