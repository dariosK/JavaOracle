package basisJava.interfacesAndInharitance;

import java.time.*;
/**
 * Created by edarkal on 2017-03-07.
 */
public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                        int hour, int minute, int second);
    LocalDateTime getLocalDateTime();

    static ZoneId getZonedId (String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("Invalid time zone: " + zoneString + "; using default time zone instead.");
            return ZoneId.systemDefault();
        }

    }
    default ZonedDateTime getZonedDateTime(String zoneString) {
        return ZonedDateTime.of(getLocalDateTime(), getZonedId(zoneString));
    }
}
