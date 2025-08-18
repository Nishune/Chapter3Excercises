package healthrecords;

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
        System.out.print("Gender (Male or Female): ");
        String gender = input.nextLine();
        System.out.print("Enter height in cm: ");
        int height = input.nextInt();
        System.out.print("Enter weight in kg: ");
        int weight = input.nextInt();

        HealthProfile profile = new HealthProfile(firstName, lastName, dateOfBirth, gender, height, weight);

        System.out.printf("Health Profile:\n");
        System.out.printf("Name: %s %s\n", profile.getFirstName(), profile.getLastName());
        System.out.printf("Date of Birth: %s\n", profile.getDateOfBirth());
        System.out.printf("Gender: %s\n", profile.getGender());
        System.out.printf("Height: %d cm\n", profile.getHeight());
        System.out.printf("Weight: %d kg\n", profile.getWeight());
        System.out.printf("BMI: %d\n", profile.calculateBMI());
        System.out.printf("Maximum Heart Rate: %d bpm\n", profile.calculateMaximumHeartRate());
        System.out.printf("Target Heart Rate: %d bpm\n", profile.targetHeartRate());
        System.out.println("End of program, test for github");
        System.out.println("test again."); //hej


    }
}
