package PizzaBillGenerator;

public class DeluxePizza extends PizzaBase {

    public DeluxePizza(String category) {
        super(category);
        this.extraCheese = true;
        this.extraToppings = true;
        this.totalPrice += 120;  // Add default price for extra cheese and toppings
    }

    @Override
    public void displayBill() {
        System.out.println("Deluxe Pizza: " + category);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Extra Cheese: Included");
        System.out.println("Extra Toppings: Included");
        if (takeAway) System.out.println("Take Away: 20");
        System.out.println("Total Price: " + totalPrice);
    }
}

