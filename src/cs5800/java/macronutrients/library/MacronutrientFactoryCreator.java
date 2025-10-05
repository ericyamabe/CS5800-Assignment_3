package macronutrients.library;

import macronutrients.library.macronutrient.CarbsFactory;
import macronutrients.library.macronutrient.FatsFactory;
import macronutrients.library.macronutrient.ProteinFactory;

public class MacronutrientFactoryCreator {
    public static MacronutrientFactory createMacronutrientFactory(String macronutrientName) {
        if(macronutrientName == "Carbs") {
            return CarbsFactory.getInstance();
        } else if (macronutrientName == "Protein") {
            return ProteinFactory.getInstance();
        } else if (macronutrientName == "Fats") {
            return FatsFactory.getInstance();
        }

        return null;
    }
}
