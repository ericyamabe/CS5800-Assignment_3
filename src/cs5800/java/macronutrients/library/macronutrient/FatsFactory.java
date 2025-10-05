package macronutrients.library.macronutrient;

import macronutrients.library.MacronutrientFactory;

public class FatsFactory extends MacronutrientFactory {
    private static FatsFactory instance;

    private FatsFactory() {
        this.foodList.add("Avocado");
        this.foodList.add("Sour cream");
        this.foodList.add("Tuna");
        this.foodList.add("Pistachio");

    }

    public static FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }
}
