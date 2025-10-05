package macronutrients.library;
import java.util.Random;

import java.util.ArrayList;

public abstract class MacronutrientFactory {
    protected DietPlanFactory dietPlan;
    protected ArrayList<String>foodList = new ArrayList<String>();

    public void setDietPlan(DietPlanFactory dietPlan) {
        this.dietPlan = dietPlan;
    }

    public String randomSelectFoodItem() {
        String item;
        boolean isExcluded = true;
        Random random = new Random();

        do {
            item = foodList.get(random.nextInt(foodList.size()));
            isExcluded = this.dietPlan.isExcluded(item);
        } while(isExcluded);

        return item;
    }
}
