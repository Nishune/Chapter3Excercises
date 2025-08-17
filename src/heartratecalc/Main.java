package heartratecalc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter date of birth (YYYY-MM-DD): ");
        String dateOfBirth = input.nextLine();



        HeartRates person = new HeartRates(firstName, lastName, dateOfBirth);


        System.out.printf("Name: %s %s%n", person.getFirstName(), person.getLastName());
        System.out.printf("Date of Birth: %s%n", person.getDateOfBirth());
        System.out.printf("Age: %d years%n", person.calculateAge());
        System.out.printf("Maximum Heart Rate: %d bpm%n", person.calculateMaximumHeartRate());
    }
}
