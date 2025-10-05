package macronutrients.library.dietplan;

import macronutrients.library.DietPlan;

public class Vegan extends DietPlan {

    public Vegan() {
        this.foodExclusions.add("Fish");
        this.foodExclusions.add("Beef");
        this.foodExclusions.add("Chicken");
        this.foodExclusions.add("Tuna");
        this.foodExclusions.add("Cheese");
        this.foodExclusions.add("Sour cream");
    }
}
