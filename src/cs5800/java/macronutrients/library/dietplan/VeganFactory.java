package macronutrients.library.dietplan;

import macronutrients.library.DietPlanFactory;

public class VeganFactory extends DietPlanFactory {
    private static VeganFactory instance;

    private VeganFactory() {
        this.foodExclusions.add("Fish");
        this.foodExclusions.add("Chicken");
        this.foodExclusions.add("Tuna");
        this.foodExclusions.add("Cheese");
        this.foodExclusions.add("Sour cream");
    }

    public static VeganFactory getInstance() {
        if (instance == null)
        {
            instance = new VeganFactory();
        }
        return instance;
    }
}
