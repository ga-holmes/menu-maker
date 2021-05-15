package menumaker;

import java.util.ArrayList;

public class Menu {
    
    private String name;
    private int numMeals;
    private double totalCost;

    private ArrayList<Meal> meals;

    public Menu(){

        name = "New Menu";
        numMeals = 0;
        totalCost = 0;

        meals = new ArrayList<Meal>();

    }

    public Menu(String name){

        this();

        this.name = name;

    }

    public String getName(){
        return name;
    }

    public int getNumMeals(){
        return numMeals;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void addMeal(String mealName, MealType type){

        Meal newMeal = new Meal(mealName, type);

        meals.add(newMeal);
        this.totalCost += newMeal.getCost();
        this.numMeals++;

    }

    public void addMeal(Meal newMeal){
        meals.add(newMeal);
        this.totalCost += newMeal.getCost();
        this.numMeals++;
    }

    @Override
    public String toString(){

        String ret = this.name + ": total $" + this.totalCost;

        for (Meal meal : meals) {
            ret += ("\n\t" + meal.toString()); 
        }
        ret += ("\n" + this.numMeals + " meal(s)");

        return ret;

    }


}
