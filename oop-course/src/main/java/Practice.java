public class Practice {

    public static void main(String[] args) {
        Alarm alarm = new Alarm("Temperature too high");
        System.out.println("Before calling doStuff(): " + alarm.active);
        doStuff(alarm);
        System.out.println("After calling doStuff(): " + alarm.active);
    }

    static void doStuff(Alarm a) {
        a.active = true;
    }
}
