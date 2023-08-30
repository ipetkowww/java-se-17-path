public class Aliasing {

    public static void main(String[] args) {
        // Create a new Alarm
        Alarm alarm1 = new Alarm("Temperature too high");

        // Assign the alarm to a second alarm reference
        Alarm alarm2 = alarm1;

        // Turn on the first alarm
        alarm1.turnOn();

        // Print the "active" fields of both alarms
        System.out.println("Alarm 1 active = " + alarm1.active);
        System.out.println("Alarm 2 active = " + alarm2.active);
    }
}
