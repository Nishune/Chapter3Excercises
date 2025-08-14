package carclass;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Volvo XC60", "2022", 450000);
        Car car2 = new Car("Maxda MX30", "2022", 300000);

        System.out.printf("Car Model: %s, Year: %s, Price: %.2f SEK%n", car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("Car Model: %s, Year: %s, Price: %.2f SEK%n", car2.getModel(), car2.getYear(), car2.getPrice());



        System.out.printf("Discounted Price for %s: %.2f SEK%n", car1.getModel(), car1.getDiscount(7));
        System.out.printf("Discounted Price for %s: %.2f SEK%n", car2.getModel(), car2.getDiscount(50));
    }
}
