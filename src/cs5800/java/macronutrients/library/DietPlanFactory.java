package macronutrients.library;
import java.util.ArrayList;

public abstract class DietPlanFactory {
    protected ArrayList<String>foodExclusions = new ArrayList<String>();

    public boolean isExcluded(String foodItem) {
        for (String item : foodExclusions) {
            if (item.equals(foodItem)) {
                return true;
            }
        }
        return false;
    }
}
