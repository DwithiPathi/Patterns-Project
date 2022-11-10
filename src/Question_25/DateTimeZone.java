package Question_25;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeZone {

public static void main(String[] args) {
LocalTime t= LocalTime.now();
System.out.println(t);
Instant i=Instant.now();
System.out.println(i);
for(String s: ZoneId.getAvailableZoneIds()) {
	System.out.println(s);
}
	}

}
