import java.util.Arrays;

public class Order {

    // instance variables
    private String name;
    private String[] itemsOrdered;
    private String location;

    // constructor
    public Order(String name, String[] itemsOrdered, String location) {
        this.name = name;
        this.itemsOrdered = itemsOrdered;
        this.location = location;
    }

    // getters
    public String getName() {
        return name;
    }

    public String[] getItemsOrdered() {
        return itemsOrdered;
    }

    public String getLocation() {
        return location;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setItemsOrdered(String[] itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // methods
    @Override
    public String toString() {
        return name + "\nOrdered items: " + Arrays.toString(itemsOrdered) + "\n" + location;
    }
}
