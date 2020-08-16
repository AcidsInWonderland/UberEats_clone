public class Dish {

    // instance variables
    private String name;
    private double cost;

    // constructor:
    public Dish(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // methods
    @Override
    public String toString() {
        return name + " costs R" + String.format("%.2f", cost);
    }
}
