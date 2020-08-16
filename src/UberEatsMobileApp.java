import java.util.ArrayList;
import java.util.Scanner;

public class UberEatsMobileApp {

    private static final Scanner input = new Scanner(System.in);

    /**
     * This is the main function that runs when I run the file after compiling.
     * 
     * @throws IOException
     */
    public static void main(String[] args) {

    
        System.out.println("Welcome to UberEatsApp - signature dish edition\n");

    
        String name = userInput("Please enter your name: ");
        name = name.substring(0,1).toUpperCase() + name.substring(1);

        String surname = userInput("Please enter your surname: ");
        surname = surname.substring(0,1).toUpperCase() + surname.substring(1);

        String location = userInput("Select location to load restaurants. Options are Rondebosch, Kenilworth, Seapoint or all/n: ");
        //takes user input
        Person me = new Person(name, surname, location);

        System.out.println("Loading restaurants in your area...\n");
        //load list of restaruants
        /**
         * 1. KFC
         * 2. McDonalds
         * 3. Burger King
         * ....from CSV file
         */
        Database db = new Database();
        ArrayList<Restaurant> restos = db.getRestaurantByLocation(location);

        if (restos.size() == 0) {
            System.out.println("Unfortunately no restaurants were found in your selected area.");
        } else {
            for (int i = 0; i < restos.size(); i++) {
                System.out.println((i + 1) + ". " + restos.get(i).getName() + ", " + restos.get(i).getLocation());
            }

            System.out.println();

            int restaurantNumber = Integer.parseInt(userInput("Select restaurant number (eg '1' for KFC): ", "integer")) - 1;
            while (restaurantNumber >= restos.size() || restaurantNumber < 0) {
                System.out.println("Restaurant number out of range.");
                restaurantNumber = Integer.parseInt(userInput("Select restaurant number (eg '1' for KFC): ", "integer")) - 1;
            }

            Restaurant restaurant = restos.get(restaurantNumber);

            String prompt = "g";

            System.out.println("\nYour cart is currently empty\n");
            System.out.println("Your Cart: " + me.getCart());


        
        System.out.println("Loading dishes from your selected restaurant...\n");
        //can add as many dishes until user types c to checkout to payment
        //load dishes of restaruant
        /**
         * 1. signaturedish1 worth R400
         * 2. signaturedish2 worth R400
         * 3. signaturedish3 worth R400
         * ....from CSV file
         */
        while (!prompt.equals("c")) {
            System.out.println("\nLoading dishes from your selected restaurant...");
            for (int j = 0; j < restaurant.getDishes().size(); j++) {
                System.out.println((j + 1) + ". " + restaurant.getDishes().get(j));
            }

            System.out.println();

            int dishNumber = Integer.parseInt(userInput("Enter 'a dishNumber' to add to your cart: ", "integer")) - 1;
            while (dishNumber >= restaurant.getDishes().size() || dishNumber < 0) {
                System.out.println("Dish number out of range");
                dishNumber = Integer.parseInt(userInput("Enter 'a dishNumber' to add to your cart: ", "integer")) - 1;
            }

            Dish dish = restaurant.getDishes().get(dishNumber);
            me.addDish(dish);

            System.out.println("Your Cart: " + me.getCart());

            prompt = userInput("\nWould you like to (C)heckout or (A)dd another dish: ");
        }

        prompt = "d";

        while (prompt.substring(0,1).toLowerCase().equals("d") && me.getCart().size() > 0) {
            prompt = userInput("\nWould you like to delete anything from your cart (Y)es or (N)o: ");

            if (prompt.equals("y")) {

                System.out.println();

                prompt = userInput("Enter 'd index' to delete item from cart: ");
                int promptInt = -1;
                if (prompt.length() > 1) {
                    String givenInputInt = prompt.substring(1).trim();
                    while (true) {
                        try {
                            Integer.parseInt(givenInputInt);
                            break;
                        } catch(NumberFormatException e) {
                            System.out.print("Invalid index integer. Enter 'index' to delete item from cart: ");
                            givenInputInt = input.nextLine().trim();
                        }
                    }
                    promptInt = Integer.parseInt(givenInputInt);
                }

                if (promptInt >= me.getCart().size() || promptInt < 0) {
                    System.out.println("\nItem index out of range or not given");
                } else {
                    me.deleteDish(promptInt);
                }

                System.out.println("\nYour Cart: " + me.getCart());
            }
        }

        if (me.getCart().size() > 0) {
            prompt = userInput("\nPlease confirm your order by entering 'Y' for yes: ");
             //when y is pressed, Order gets added to CSV
        //load items from cart
        /**
         * 1. signaturedishA
         * 2. signaturedishB
         * 3. signaturedishC
         * 4. signaturedishB
         * 5. signaturedish1
         * 6. signaturedishC
         */

            if (prompt.equals("y")) {
                System.out.println("\nYour Cart: " + me.getCart());

                double orderCost = 0;
                for (int k = 0; k < me.getCart().size(); k++) {
                    orderCost += me.getCart().get(k).getCost();
                }
                System.out.println("Cost of Order: R" + orderCost);

                System.out.println("\nOrder has been placed! Thank you for your time " + me.getName() + " " + ". Restaurant will process your order soon!/n"); 
            } else {
                     System.out.println("\nNo dishes were found in your cart.");
                 }
            }
        }


}

private static String userInput(String inputMsg) {
    System.out.print(inputMsg);
    String givenInput = input.nextLine().trim();
    while (true) {
        if (!givenInput.trim().isEmpty()) {
            break;
        }
        System.out.print("Invalid input. " + inputMsg);
        givenInput = input.nextLine().trim();
    }
    return givenInput.toLowerCase();
}

private static String userInput(String inputMsg, String type) {
    System.out.print(inputMsg);
    String givenInput = input.nextLine().trim();
    if (type.equals("double")) {
        while (true) {
            if (!givenInput.trim().isEmpty()) {
                try {
                    Double.parseDouble(givenInput);
                    break;
                } catch(NumberFormatException e) {
                    System.out.print("Invalid input. " + inputMsg);
                    givenInput = input.nextLine().trim();
                }
            }
        }
    } else if (type.equals("integer")) {
        while (true) {
            if (!givenInput.trim().isEmpty()) {
                try {
                    Integer.parseInt(givenInput);
                    break;
                } catch(NumberFormatException e) {
                    System.out.print("Invalid input. " + inputMsg);
                    givenInput = input.nextLine().trim();
                }
            }
        }
    }
    return givenInput.toLowerCase();
}
}
      