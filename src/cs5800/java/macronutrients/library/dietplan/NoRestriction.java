package macronutrients.library.dietplan;

import macronutrients.library.DietPlan;

public class NoRestriction extends DietPlan {
    @Override
    public boolean isExcluded(String foodItem) {
        return false;
    }
}
