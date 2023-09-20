package working_with_dates_and_times;

import java.time.LocalDate;

public class CompareDates {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2022, 9, 20);
        LocalDate date2 = LocalDate.now();

        System.out.println(date1.isBefore(date2));
        System.out.println(date2.isAfter(date1));
    }
}
