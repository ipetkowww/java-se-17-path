package working_with_dates_and_times;

import java.time.LocalDate;
import java.time.Period;

public class DifferenceBetweenDates {

    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1990, 12, 25);
        LocalDate now = LocalDate.now();
        Period age = Period.between(birthDay, now);

        System.out.printf("%dy %dm %dd %n", age.getYears(), age.getMonths(), age.getDays());
    }
}
