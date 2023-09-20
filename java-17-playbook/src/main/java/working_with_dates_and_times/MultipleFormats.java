package working_with_dates_and_times;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class MultipleFormats {

    public static void main(String[] args) {

        // Add all needed date patterns
        DateTimeFormatterBuilder formatterBuilder = new DateTimeFormatterBuilder();
        formatterBuilder.appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                .appendOptional(DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        DateTimeFormatter formatter = formatterBuilder.toFormatter();

        System.out.println(LocalDate.parse("2022-07-22", formatter));
        System.out.println(LocalDate.parse("22-07-2022", formatter));
    }
}
