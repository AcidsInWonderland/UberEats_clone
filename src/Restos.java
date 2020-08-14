public class Restos {

    private Orders orders;
    private Restaurant restaurant;


    Restos(Orders orders, Restaurant restaurant) {
        this.orders = orders;
        this.restaurant = restaurant;
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

    public String toString(){

        Orders o = this.getOrders();
        return "Restaurant: " + o.getName();




    }

}
