import java.util.ArrayList;

public class Person {

    // instance variables
    private String name;
    private String surname;
    private String location;
    private ArrayList<Dish> cart = new ArrayList<>();

    // constructor
    public Person(String name, String location, String surname) {
        this.name = name;
        this.surname = surname;
        this.location = location;

    }

    // getters
    public String getName() {
        return name;
    }

    public String getSurame() {
        return this.surname;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Dish> getCart() {
        return cart;
    }


    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurame(String surname) {
        this.surname = surname;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCart(ArrayList<Dish> cart) {
        this.cart = cart;
    }

    // methods
    @Override
    public String toString() {
        return name + "\nSurname: " + surname + "\nLocation: " + location + "\ncart: " + cart; 
    }

    public void addDish(Dish dish) {
        cart.add(dish);
    }

    public void deleteDish(int dishIndex) {
        cart.remove(dishIndex);
    }
}