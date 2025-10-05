package macronutrients.library.dietplan;

import macronutrients.library.DietPlan;

public class Paleo extends DietPlan {
    public Paleo() {
        this.foodExclusions.add("Tofu");
        this.foodExclusions.add("Cheese");
        this.foodExclusions.add("Sour cream");
    }
}
