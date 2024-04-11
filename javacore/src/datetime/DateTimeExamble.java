package datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTimeExamble {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.atZone(ZoneId.of("")));
    }
}
