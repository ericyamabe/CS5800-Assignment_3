package macronutrients.library;

import macronutrients.library.MacronutrientFactoryCreator;
import macronutrients.library.DietPlanFactoryCreator;

import java.util.ArrayList;

public class Customer {
    private String name;
    private DietPlanFactory dietPlan;
    private String dietPlanName;
    private ArrayList<String> meal = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setDietPlan(String dietPlan) {
        this.dietPlanName = dietPlan;
        this.dietPlan = DietPlanFactoryCreator.createDietPlanFactory(dietPlan);
    }
    public void generateMealPlan() {
        this.getCarbEntree();
        this.getProtienEntree();
        this.getFatsEntree();
    }

    protected void getCarbEntree() {
        MacronutrientFactory carbsFactory = MacronutrientFactoryCreator.createMacronutrientFactory("Carbs");
        carbsFactory.setDietPlan(this.dietPlan);
        this.meal.add(carbsFactory.randomSelectFoodItem());
    }

    protected void getProtienEntree() {
        MacronutrientFactory proteinFactory = MacronutrientFactoryCreator.createMacronutrientFactory("Protein");
        proteinFactory.setDietPlan(this.dietPlan);
        this.meal.add(proteinFactory.randomSelectFoodItem());
    }

    protected void getFatsEntree() {
        MacronutrientFactory fatsFactory = MacronutrientFactoryCreator.createMacronutrientFactory("Fats");
        fatsFactory.setDietPlan(this.dietPlan);
        this.meal.add(fatsFactory.randomSelectFoodItem());
    }

    public String toString() {
        return this.name + "'s " + this.dietPlanName +" meal plan: " + this.meal.toString();
    }
}
