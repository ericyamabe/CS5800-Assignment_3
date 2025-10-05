package macronutrients.library.dietplan;

import macronutrients.library.DietPlanFactory;

public class NoRestrictionFactory extends DietPlanFactory {
    private static NoRestrictionFactory instance;

    public static NoRestrictionFactory getInstance() {
        if (instance == null) {
            instance = new NoRestrictionFactory();
        }
        return instance;
    }
}
