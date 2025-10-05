package macronutrients.library.dietplan;

import macronutrients.library.DietPlan;

public class NutAllergy extends DietPlan {
    private static NutAllergy instance;

    private NutAllergy() {
        this.foodExclusions.add("Pistachio");
        this.foodExclusions.add("Peanuts");
    }

    public static NutAllergy getInstance() {
        if(instance == null)
        {
            instance = new NutAllergy();
        }
        return instance;
    }
}
