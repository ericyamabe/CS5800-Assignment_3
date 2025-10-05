package macronutrients;

import macronutrients.library.Customer;

public class Driver {
    public static void main(String[] args) {
        Customer bill = new Customer();
        bill.setName("Bill");
        bill.setDietPlan("Vegan");
        bill.generateMealPlan();
        System.out.println(bill.toString());

        Customer diane = new Customer();
        diane.setName("Diane");
        diane.setDietPlan("Nut Allergy");
        diane.generateMealPlan();
        System.out.println(diane.toString());

        Customer ted = new Customer();
        ted.setName("Ted");
        ted.setDietPlan("Paleo");
        ted.generateMealPlan();
        System.out.println(ted.toString());

        Customer audrey = new Customer();
        audrey.setName("Audrey");
        audrey.setDietPlan("Nut Allergy");
        audrey.generateMealPlan();
        System.out.println(audrey.toString());

        Customer sean = new Customer();
        sean.setName("Sean");
        sean.setDietPlan("No Restriction");
        sean.generateMealPlan();
        System.out.println(sean.toString());

        Customer kayley = new Customer();
        kayley.setName("Kayley");
        kayley.setDietPlan("Vegan");
        kayley.generateMealPlan();
        System.out.println(kayley.toString());
    }
}
