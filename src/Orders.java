import java.util.ArrayList;

public class Orders {

    //instance variables
    private String clientName;
    private ArrayList<Dishes> order;
    private String locationName;

    //constructor
    Orders() {

    }

    Orders(String name, ArrayList<Dishes> orders, String locationName) {
        this.clientName = name;
        this.order = orders;
        this.locationName = locationName;
    }

    //methods

    public void addToOrder(Dishes dish) {
        this.order.add(dish);
    }

    //getters & setters

    public String clientName() {
        return this.clientName;
    }
    public void clientName(String name) {
        this.clientName = name;
    }

    public ArrayList<Dishes> getOrder() {
        return this.order;
    }
    public void setOrder(ArrayList<Dishes> order){
        this.order = order;
    }

    public String getLocationName() {
        return this.locationName;
    }
    public void setLocationName(String name){
        this.locationName = name;
    }
}

