package PizzaBillGenerator;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PizzaBase pizzaBase = null;
        DeluxePizza deluxePizza = null;

        System.out.println("Do you want to order a PizzaBase? (y/n): ");
        String orderPizzaBase = sc.next();

        if (orderPizzaBase.equalsIgnoreCase("y")) {
            System.out.println("Select Category for PizzaBase (1: Veg, 2: Non-Veg): ");
            int categoryTypeBase = sc.nextInt();
            String categoryBase = categoryTypeBase == 1 ? "veg" : "non-veg";

            pizzaBase = new PizzaBase(categoryBase);

            System.out.println("Do you want extra cheese for PizzaBase? (y/n): ");
            if (sc.next().equalsIgnoreCase("y")) pizzaBase.addExtraCheese();

            System.out.println("Do you want extra toppings for PizzaBase? (y/n): ");
            if (sc.next().equalsIgnoreCase("y")) pizzaBase.addExtraToppings();

            System.out.println("Do you want take away for PizzaBase? (y/n): ");
            if (sc.next().equalsIgnoreCase("y")) pizzaBase.addTakeAway();
        }

        System.out.println("\nDo you want to order a DeluxePizza? (y/n): ");
        String orderDeluxePizza = sc.next();

        if (orderDeluxePizza.equalsIgnoreCase("y")) {
            System.out.println("Select Category for DeluxePizza (1: Veg, 2: Non-Veg): ");
            int categoryTypeDeluxe = sc.nextInt();
            String categoryDeluxe = categoryTypeDeluxe == 1 ? "veg" : "non-veg";

            deluxePizza = new DeluxePizza(categoryDeluxe);

            System.out.println("Do you want take away for DeluxePizza? (y/n): ");
            if (sc.next().equalsIgnoreCase("y")) deluxePizza.addTakeAway();
        }

        // Display bills only if pizzas are ordered
        if (pizzaBase != null) {
            System.out.println("\n--- Bill for PizzaBase ---");
            pizzaBase.displayBill();
        }

        if (deluxePizza != null) {
            System.out.println("\n--- Bill for DeluxePizza ---");
            deluxePizza.displayBill();
        }

        // Close scanner
        sc.close();
    }
}
