package macronutrients.library.dietplan;

import macronutrients.library.DietPlanFactory;

public class NutAllergyFactory extends DietPlanFactory {
    private static NutAllergyFactory instance;

    private NutAllergyFactory() {
        this.foodExclusions.add("Pistachio");
        this.foodExclusions.add("Peanuts");
    }

    public static NutAllergyFactory getInstance() {
        if(instance == null)
        {
            instance = new NutAllergyFactory();
        }
        return instance;
    }
}
