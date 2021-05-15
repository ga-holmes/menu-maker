package menumaker;

import java.util.ArrayList;

public class Meal {
    
    private String name;
    private double cost;
    private MealType type;

    private ArrayList<FoodItem> ingredients;

    public Meal(){

        name = "no name";
        cost = 0;
        type = MealType.OTHER;

        ingredients = new ArrayList<FoodItem>();

    }

    public Meal(String name, MealType type){

        this();

        this.name = name;
        this.type = type;

    }

    public String getName(){
        return name;
    }

    public double getCost(){
        return cost;
    }

    public String getType(){
        return type.toString();
    }

    public void setName(String name){
        this.name = name;
    }

    public void addIngredient(String foodName, double amount, double itemCost, String measureBy){

        FoodItem toAdd = new FoodItem(foodName, amount, cost, measureBy);

        ingredients.add(toAdd);

        cost += itemCost;

    }

    @Override
    public String toString(){

        String ret = this.name + ": " + this.type.toString() + ", $" + this.cost;

        for (FoodItem foodItem : ingredients) {
            ret += ("\n\t\t" + foodItem.toString()); 
        }

        return ret;

    }

}
