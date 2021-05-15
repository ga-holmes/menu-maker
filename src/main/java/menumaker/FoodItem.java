package menumaker;

public class FoodItem {
    
    private double amount;
    private double cost;
    private String name;
    private String measurementValue;

    public FoodItem(){

        amount = 0;
        cost = 0;
        name = "no name";
        measurementValue = "";

    }

    public FoodItem(String name, double amount, double cost, String measureBy){

        this();

        this.name = name;
        this.amount = amount;
        this.cost = cost;
        this.measurementValue = measureBy;

    }

    public String getName(){
        return this.name;
    }

    public double getCost(){
        return this.cost;
    }

    public String getAmount(){
        return this.amount+this.measurementValue;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    @Override
    public String toString(){

        return this.name + ": " + this.amount + " " + this.measurementValue;  

    }

}
