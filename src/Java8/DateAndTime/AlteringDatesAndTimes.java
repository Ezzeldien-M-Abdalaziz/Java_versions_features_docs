package Java8.DateAndTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class AlteringDatesAndTimes {

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();


        //plus and minus methods
        LocalDateTime ldt2 = ldt1.plusDays(7);
        LocalDateTime ldt3 = ldt1.plusMinutes(30);
        LocalDateTime ldt4 = ldt1.plusSeconds(80);
        LocalDateTime ldt5 = ldt1.plusMonths(2);
        LocalDateTime ldt6 = ldt1.plusYears(1);


        LocalDateTime ldt7 = ldt1.withMonth(4);  //change month

        LocalDateTime ldt8 = ldt1.plus(Period.ofWeeks(1));

        LocalDateTime ldt9 = ldt1.minus(Duration.ofHours(12));


        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println(ldt4);
        System.out.println(ldt5);
        System.out.println(ldt6);
        System.out.println(ldt7);
        System.out.println(ldt8);
        System.out.println(ldt9);




        //with methods
    }
}
