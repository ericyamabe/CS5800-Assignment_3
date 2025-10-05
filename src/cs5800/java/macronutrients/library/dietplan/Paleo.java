package macronutrients.library.dietplan;

import macronutrients.library.DietPlan;

public class Paleo extends DietPlan {
    private static Paleo instance;

    private Paleo() {
        this.foodExclusions.add("Tofu");
        this.foodExclusions.add("Cheese");
        this.foodExclusions.add("Sour cream");
    }

    public static Paleo getInstance()
    {
        if (instance == null) {
            instance = new Paleo();
        }
        return instance;
    }
}
