package com.java8to11.chapter05;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println(instant); // 기준시 UTC, GMT

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        ZonedDateTime zonedDateTime = instant.atZone(zone);
        System.out.println(zonedDateTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime birthday = LocalDateTime.of(1994, Month.AUGUST, 24, 0, 0, 0);
        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        Period period = Period.between(LocalDate.now(), LocalDate.of(2020, Month.AUGUST, 24));
        System.out.println(period.getDays());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(dateTimeFormatter));

        LocalDate parse = LocalDate.parse("08/24/1994", dateTimeFormatter);
        System.out.println(parse);

        LocalDateTime plus = now.plus(10, ChronoUnit.DAYS);
        System.out.println(plus);

    }
}
