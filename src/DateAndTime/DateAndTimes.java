package DateAndTime;

import java.time.*;

public class DateAndTimes {

    public static void main(String[] args) {


        //date
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2025, 1, 1);
        LocalDate ld3 = LocalDate.of(2025, Month.DECEMBER, 1);

        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);

        //invalid date
//        LocalDate ld4 = LocalDate.of(2025, 13, 1);
System.out.println("-------------------------------------------");

        //times
        LocalTime t1 = LocalTime.now();
        LocalTime t2 = LocalTime.of(12, 34, 56);

        System.out.println(t1);
        System.out.println(t2);

System.out.println("-------------------------------------------");
        //dateTime
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.of(2025, 2, 12, 2, 56);
        LocalDateTime dt3 = LocalDateTime.of(ld2,t1);

        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);

System.out.println("-------------------------------------------");

        //monthday
        MonthDay md1 = MonthDay.of(Month.JANUARY, 1);
        LocalDate newLocalDate = MonthDay.now().atYear(2025);
        System.out.println(newLocalDate);
        System.out.println(md1);


        //yearmonth
        YearMonth yearMonth = YearMonth.now();
        LocalDate ym1 = yearMonth.atDay(4);
        System.out.println(ym1);



    }
}
