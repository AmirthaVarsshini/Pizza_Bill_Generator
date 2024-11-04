package PizzaBillGenerator;

public class PizzaBase {
    protected String category;  // Change from private to protected
    protected int basePrice;
    protected int totalPrice;
    protected boolean extraCheese;
    protected boolean extraToppings;
    protected boolean takeAway;
    
    public PizzaBase(String category) {
        this.category = category;
        this.basePrice = category.equals("veg") ? 300 : 400;
        this.totalPrice = this.basePrice;
    }

    public void addExtraCheese() {
        this.extraCheese = true;
        this.totalPrice += 50;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
        this.totalPrice += 70;
    }

    public void addTakeAway() {
        this.takeAway = true;
        this.totalPrice += 20;
    }

    public void displayBill() {
        System.out.println("Pizza: " + category);
        System.out.println("Base Price: " + basePrice);
        if (extraCheese) System.out.println("Extra Cheese: 50");
        if (extraToppings) System.out.println("Extra Toppings: 70");
        if (takeAway) System.out.println("Take Away: 20");
        System.out.println("Total Price: " + totalPrice);
    }
}
