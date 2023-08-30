public class Alarm {

    final String message;
    boolean active;

    Alarm(String message) {
        this.message = message;
    }

    void turnOn() {
        active = true;
    }

    void turnOff() {
        active = false;
    }

    String getReport() {
        return getReport(false);
    }

    private String getReport(boolean uppercase) {
        if (active) {
            if (uppercase)
                return message.toUpperCase();
            else
                return message;
        } else
            return "";
    }

    void sendReport() {
        System.out.println(getReport(true));
    }
}
