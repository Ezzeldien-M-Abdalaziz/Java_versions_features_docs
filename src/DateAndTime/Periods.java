package DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Periods {

    public static void main(String[] args) {

        Period P1 = Period.of(1,1,1);
        System.out.println(P1);  //period of 1 year and 1 month and 1 day

        Period p2 = Period.ofDays(100);
        System.out.println(p2);  //period of 100 days

        LocalDate ld = LocalDate.of(2022,1,1);
        LocalDate ld2 = LocalDate.now();

        Period p3 = Period.between(ld,ld2);

        System.out.println(p3); // P3Y8M19D  => 3 years , 8 months , 19 days
        System.out.println(p3.getYears());  //3
        System.out.println(p3.getDays()); //8
        System.out.println(p3.getMonths());  //19


        //to get the days as total
        long nrOfDaysBetweenDates = ChronoUnit.DAYS.between(ld,ld2);
        System.out.println(nrOfDaysBetweenDates);   //1358 days





    }
}
