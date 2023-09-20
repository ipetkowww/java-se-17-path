package working_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatDates {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String isoDate = DateTimeFormatter.ISO_DATE.format(now);
        System.out.println(isoDate);

        String basicIsoDate = DateTimeFormatter.BASIC_ISO_DATE.format(now);
        System.out.println(basicIsoDate);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTimeFormatter.format(now));

        String someDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US).format(now);
        System.out.println(someDate);

        String europeanPattern = "dd-MM-yyyy";
        String usPattern = "MM.dd.yyyy";
        LocalDate date = LocalDate.of(1990, 12, 25);
        System.out.println(DateTimeFormatter.ofPattern(europeanPattern).format(date));
        System.out.println(DateTimeFormatter.ofPattern(usPattern).format(date));
    }
}
