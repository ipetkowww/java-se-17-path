package working_with_dates_and_times;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CurrentTIme {

    public static void main(String[] args) {

        System.out.println(Instant.now()); // prints UTC
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now(ZoneId.of("America/New_York")));
    }
}
