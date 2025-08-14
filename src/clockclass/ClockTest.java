package clockclass;

public class ClockTest {

    public static void main(String[] args) {

        Clock clock1 = new Clock(23, 59, 59);
        Clock clock2 = new Clock(12, 30, 45);

        System.out.println(clock1.getTime());
        System.out.println(clock2.getTime());

        clock1.setHour(24);
        clock1.setMinute(0);
        clock1.setSecond(0);

        System.out.println("After setting hour to 24: " + clock1.getTime());
    }

}
