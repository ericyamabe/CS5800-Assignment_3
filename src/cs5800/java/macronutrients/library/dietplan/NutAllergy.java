package macronutrients.library.dietplan;

import macronutrients.library.DietPlan;

public class NutAllergy extends DietPlan {

    public NutAllergy() {
        this.foodExclusions.add("Pistachio");
        this.foodExclusions.add("Peanuts");
    }

}
