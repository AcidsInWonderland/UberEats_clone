
import java.util.ArrayList;
import java.util.Scanner;

public class UberEatsRestaurantApp {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to UberEatsApp - signature dish edition FOR RESTAURANTS\n");
        String restaurantName = userInput("Enter restaurant: ");

        System.out.println("\nLoading all orders placed...\n");
        Database db = new Database();

        ArrayList<Order> orders = db.getOrdersByName(restaurantName);

        if (orders.size() > 0) {
            int orderIndex = 1;
            for (int i = 0; i < orders.size(); i++) {
                for (int j = 0; j < orders.get(i).getItemsOrdered().length; j++) {
                    Order order = orders.get(i);
                    String orderLocation = order.getLocation();
                    System.out.println(orderIndex + ". " + order.getItemsOrdered()[j] + " from " + orderLocation.substring(0,1).toUpperCase() + orderLocation.substring(1));
                    orderIndex++;
                }
            }
        } else {
            System.out.println("No orders were found for this restaurant.");
        }
    }

    private static String userInput(String inputMsg) {
        System.out.print(inputMsg);
        String givenInput = input.nextLine().trim();
        while (true) {
            if (!givenInput.trim().isEmpty()) {
                break;
            }
            System.out.print("Invalid. " + inputMsg);
            givenInput = input.nextLine().trim();
        }
        return givenInput.toLowerCase();
    }
}