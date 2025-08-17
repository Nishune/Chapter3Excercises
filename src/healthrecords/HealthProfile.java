package healthrecords;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private int height;
    private int weight;

    public HealthProfile(String firstName, String lastName, String dateOfBirth, String gender, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int calculateAge() {
        int birthYear = Integer.parseInt(dateOfBirth.split("-")[0]);
        int currentYear = java.time.LocalDate.now().getYear();
        return currentYear - birthYear;
    }
    public int calculateMaximumHeartRate() {
        int age = calculateAge();
        return 220 - age;
    }
    public int targetHeartRate() {
        int maxHeartRate = calculateMaximumHeartRate();
        return (int) (maxHeartRate * 0.7);
    }
    public int calculateBMI() {
        double heightInMeters = height / 100.0;
        return (int) (weight / (heightInMeters * heightInMeters));
    }
}
