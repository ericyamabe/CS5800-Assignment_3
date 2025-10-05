package macronutrients.library.dietplan;

import macronutrients.library.DietPlan;

public class Vegan extends DietPlan {
    private static Vegan instance;

    private Vegan() {
        this.foodExclusions.add("Fish");
        this.foodExclusions.add("Chicken");
        this.foodExclusions.add("Tuna");
        this.foodExclusions.add("Cheese");
        this.foodExclusions.add("Sour cream");
    }

    public static Vegan getInstance() {
        if (instance == null)
        {
            instance = new Vegan();
        }
        return instance;
    }
}
