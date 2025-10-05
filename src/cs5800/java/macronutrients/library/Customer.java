package macronutrients.library;

import macronutrients.library.dietplan.NoRestriction;
import macronutrients.library.dietplan.NutAllergy;
import macronutrients.library.dietplan.Paleo;
import macronutrients.library.dietplan.Vegan;
import macronutrients.library.macronutrient.CarbsFactory;
import macronutrients.library.macronutrient.FatsFactory;
import macronutrients.library.macronutrient.ProteinFactory;

import java.util.ArrayList;

public class Customer {
    private String name;
    private DietPlan dietPlan;
    private String dietPlanName;
    private ArrayList<String> meal = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setDietPlan(String dietPlan) {
        this.dietPlanName = dietPlan;
        switch (dietPlan) {
            case "Paleo":
                this.dietPlan = new Paleo();
                break;
            case "Vegan":
                this.dietPlan = new Vegan();
                break;
            case "Nut Allergy":
                this.dietPlan = new NutAllergy();
                break;
            default:
                this.dietPlan = new NoRestriction();
                break;
        }
    }
    public void generateMealPlan() {
        this.getCarbEntree();
        this.getProtienEntree();
        this.getFatsEntree();
    }

    protected void getCarbEntree() {
        CarbsFactory carbsFactory = CarbsFactory.getInstance();
        carbsFactory.setDietPlan(this.dietPlan);
        this.meal.add(carbsFactory.randomSelectFoodItem());
    }

    protected void getProtienEntree() {
        ProteinFactory proteinFactory = ProteinFactory.getInstance();
        proteinFactory.setDietPlan(this.dietPlan);
        this.meal.add(proteinFactory.randomSelectFoodItem());
    }

    protected void getFatsEntree() {
        FatsFactory fatsFactory = FatsFactory.getInstance();
        fatsFactory.setDietPlan(this.dietPlan);
        this.meal.add(fatsFactory.randomSelectFoodItem());
    }

    public String toString() {
        return this.name + "'s " + this.dietPlanName +" meal plan: " + this.meal.toString();
    }
}
