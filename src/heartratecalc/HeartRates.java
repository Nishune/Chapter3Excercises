package heartratecalc;

import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public HeartRates(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int calculateAge() {
        int birthYear = LocalDate.parse(dateOfBirth).getYear();
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }
    public int calculateMaximumHeartRate() {
       int age = calculateAge();
        return 220 - age;
    }

    public int targetHeartRate() {
        int maxHeartRate = calculateMaximumHeartRate();
        return (int) (maxHeartRate * 0.7); // 70% of maximum heart rate
    }
}

