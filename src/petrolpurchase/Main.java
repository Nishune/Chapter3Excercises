package petrolpurchase;

public class Main {

    public static void main(String[] args) {


        PetrolPurchase petrol1 = new PetrolPurchase("Piteå", "95", 50, 15.99, 2);

        double totalPrice = petrol1.getPurchaseAmount();

        System.out.printf("Total price for petrol purchase in %s: %.2f SEK%n", petrol1.getLocation(), totalPrice);
    }
}
