package menumaker;

public class Maker 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Menu-Maker!" );
        System.out.println("What would you like to do?");
        
        System.out.println();

        Menu myMenu = new Menu("Garrett's Menu");

        Meal newMeal = new Meal("rice and beans", MealType.DINNER);

        newMeal.addIngredient("rice", 100, 2, "g");
        newMeal.addIngredient("beans", 1, 0.99, "Can");

        myMenu.addMeal(newMeal);

        System.out.println(myMenu);

    }
}
