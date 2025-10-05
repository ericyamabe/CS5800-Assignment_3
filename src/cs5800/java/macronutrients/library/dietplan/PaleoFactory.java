package macronutrients.library.dietplan;

import macronutrients.library.DietPlanFactory;

public class PaleoFactory extends DietPlanFactory {
    private static PaleoFactory instance;

    private PaleoFactory() {
        this.foodExclusions.add("Tofu");
        this.foodExclusions.add("Cheese");
        this.foodExclusions.add("Sour cream");
    }

    public static PaleoFactory getInstance()
    {
        if (instance == null) {
            instance = new PaleoFactory();
        }
        return instance;
    }
}
