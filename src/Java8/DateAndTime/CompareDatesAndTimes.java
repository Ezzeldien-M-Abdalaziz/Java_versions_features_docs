package Java8.DateAndTime;

import java.time.LocalDateTime;

public class CompareDatesAndTimes {

    public static void main(String[] args) {

        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2025 , 4 , 20 , 7 , 16);

        /*
        It checks the year first.
                If they’re different, it returns the difference in years.
                If years are the same, it checks the month.
                If different, it returns the difference in months.
                If months are the same, it checks the day of month.
                If different, it returns the difference in days.
                If days are the same, it goes to hour, then minute, then second, then nanosecond.
                The first field that is not equal determines the return value.
         */
        System.out.println(ldt1.compareTo(ldt2));

        System.out.println("is after : " + ldt1.isAfter(ldt2));
        System.out.println("is before : " + ldt1.isBefore(ldt2));
        System.out.println("is equal : " + ldt1.isEqual(ldt2));


    }
}
