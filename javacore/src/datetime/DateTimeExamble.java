package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Locale;

public class DateTimeExamble {
    public static void main(String[] args) {

        // local datetime
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);

        Locale locale = Locale.getDefault();

        System.out.println(locale);
    }
}
