package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

        LocalDate d01 = LocalDate.now();
        System.out.println("d01 = " + d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("d02 = " + d02);

        Instant d03 = Instant.now();
        System.out.println("d03 = " + d03);

        LocalDate d04 = LocalDate.parse("2023-06-20");
        System.out.println("d04 = " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2023-06-20T20:45:26");
        System.out.println("d05 = " + d05);

        Instant d06 = Instant.parse("2023-06-20T20:45:26Z");
        System.out.println("d06 = " + d06);

        Instant d07 = Instant.parse("2023-06-20T20:45:26-03:00");
        System.out.println("d07 = " + d07);

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
        System.out.println("d08 = " + d08);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 01:30", fmt2);
        System.out.println("d09 = " + d09);

        LocalDate d10 = LocalDate.of(2023, 7, 20);
        System.out.println("d10 = " + d10);

        LocalDateTime d11 = LocalDateTime.of(2023, 7, 20, 21, 6);
        System.out.println("d11 = " + d11);

    }
}
