package macronutrients.library;

import macronutrients.library.dietplan.NoRestrictionFactory;
import macronutrients.library.dietplan.NutAllergyFactory;
import macronutrients.library.dietplan.PaleoFactory;
import macronutrients.library.dietplan.VeganFactory;
import macronutrients.library.macronutrient.CarbsFactory;
import macronutrients.library.macronutrient.FatsFactory;
import macronutrients.library.macronutrient.ProteinFactory;

public class DietPlanFactoryCreator {
    public static DietPlanFactory createDietPlanFactory(String dietName){
        if(dietName == "Paleo") {
            return PaleoFactory.getInstance();
        } else if (dietName == "Vegan") {
            return VeganFactory.getInstance();
        } else if (dietName == "Nut Allergy") {
            return NutAllergyFactory.getInstance();
        }

        return NoRestrictionFactory.getInstance();
    }
}
