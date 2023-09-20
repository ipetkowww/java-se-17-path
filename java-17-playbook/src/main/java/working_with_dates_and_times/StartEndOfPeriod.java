package working_with_dates_and_times;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class StartEndOfPeriod {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("Today: " + now);
        System.out.println("Last day of month: " + lastDayOfMonth);
        System.out.printf("Days until end of the month: %d%n", lastDayOfMonth.getDayOfMonth() - now.getDayOfMonth());
    }
}
