public class Dishes{

    //instance variables
    private String dishName;
    private int cost;

    //constructor
    Dishes() {}

    Dishes(String dishName, int cost) {
        this.dishName = dishName;
        this.cost = cost;
    }

    //methods

    //getters & setters

    public String getDishName() {
        return this.dishName;
    }
    public void setSignaturedish(String name) {
        this.dishName = name;
    }

    public int getCost() {
        return this.cost;
    }
    public void setCost(int price){
        this.cost = price;
    }
}