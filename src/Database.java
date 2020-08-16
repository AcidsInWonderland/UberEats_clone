import java.io.*;
import java.util.ArrayList;

public class Database {

    // instances variables
    private ArrayList<Restaurant> restaurants;
    private ArrayList<Order> orders;

    // constructors
    Database () {};

    // getters
    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    // setters
    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    // method
    private void getRestaurantsArray() {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("restos.csv"));
            String row = null;
            int i = 0;
            restaurants = new ArrayList<>();
            while ((row = csvReader.readLine()) != null) {
                if(i > 0) {
                    
                    String[] data = row.split(",");
                
                    Dish signatureDishA = new Dish(data[1].trim(), Double.parseDouble(data[2].trim()));
                    Dish signatureDishB = new Dish(data[3].trim(), Double.parseDouble(data[4].trim()));
                    Dish signatureDishC = new Dish(data[5].trim(), Double.parseDouble(data[6].trim()));

                    ArrayList<Dish> dishes = new ArrayList<>();
                    dishes.add(signatureDishA);
                    dishes.add(signatureDishB);
                    dishes.add(signatureDishC);

                    Restaurant restaurant = new Restaurant(data[0].trim(),dishes, data[7].trim());

                    restaurants.add(restaurant);
                }

                i++;
            }

            
            csvReader.close();
        
        } catch(Exception e) {
            System.out.println("An error occured:\n" + e.toString());
        }
    }

    public void getOrdersArray() {
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("orders.csv"));
            String row = null;
            int i = 0;
            orders = new ArrayList<>();
            while ((row = csvReader.readLine()) != null) {
                if(i > 0) {
                    String[] data = row.split(",");
                    String[] itemsOrdered = data[1].trim().split(";");

                   Order order = new Order(data[0].trim(), itemsOrdered, data[2].trim());
                    orders.add(order);
                }

                i++;
            }

            csvReader.close();
    
        } catch(Exception e) {
            System.out.println("An error occured:\n" + e.toString());
        }
    }

    public ArrayList<Restaurant> getRestaurantByLocation(String location) {
        getRestaurantsArray();
        ArrayList<Restaurant> restaurantsByLocation = new ArrayList<>();

        if (location.equals("all")) {
            return restaurants;
        } else {
            for (int i = 0; i < restaurants.size(); i++) {
                if (restaurants.get(i).getLocation().equals(location)) {
                    restaurantsByLocation.add(restaurants.get(i));
                }
            }
        }

        return restaurantsByLocation;
    }


    public void addOrder(String restaurant, ArrayList<Dish> order, String location) {
        
        String orders = order.get(0).getName();
        for (int i = 1; i < order.size(); i++) {
            orders += ";" + order.get(i).getName();
        }
        
        String content = "\n" + restaurant + ", " + orders + ", " + location;

        
        try (FileWriter writer = new FileWriter("orders.csv", true);
             BufferedWriter BW = new BufferedWriter(writer)) {

            BW.write(content);

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public ArrayList<Order> getOrdersByName(String name) {
        getOrdersArray();
        ArrayList<Order> ordersByName = new ArrayList<>();

    
        if (name.equals("all")) {
            return orders;
        
        } else {
            for (int i = 0; i < orders.size(); i++) {
                if (orders.get(i).getName().toLowerCase().equals(name)) {
                    ordersByName.add(orders.get(i));
                }
            }
        }

        return ordersByName;
    }
}
