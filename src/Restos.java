public class Restos {

    private Orders orders;
    private Restaurant restaurant;
	public Object getOrders;


    Restos(Orders orders, Restaurant restaurant) {
        this.orders = orders;
        this.restaurant = restaurant;
    }

    public Restos(Orders o, String restaurant2) {
	}

	//methods
    public String clientLocation(){

        Orders o = this.getOrders();
        return "Restaurant: " + o.getLocationName();

    }
    //setters

    public void setOrders(Orders orders){
        this.orders = orders;
    }

    public void setName(Restaurant restaurant){
        this.restaurant = restaurant;
    }


    //getters
    public Orders getOrders() {
        return this.orders;
    }

    public Restaurant getRestaurant() {
        return this.restaurant;
    }
}
