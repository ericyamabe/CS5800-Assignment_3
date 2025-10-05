package macronutrients.library.dietplan;

import macronutrients.library.DietPlan;

public class NoRestriction extends DietPlan {
    private static NoRestriction instance;

    public static NoRestriction getInstance() {
        if (instance == null) {
            instance = new NoRestriction();
        }
        return instance;
    }
}
