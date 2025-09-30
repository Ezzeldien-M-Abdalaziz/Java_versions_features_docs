package Java8.DateAndTime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Durations {
    public static void main(String[] args) {

        Duration d1 = Duration.of(1 , ChronoUnit.DAYS);
        System.out.println(d1);   //TRANSLATED THIS INTO 24 HRS

//        Duration d2 = Duration.of(1 , ChronoUnit.MONTHS);
//        System.out.println(d2);   //error because months not supported

        Duration d2 = Duration.ofHours(5);
        System.out.println(d2);


        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.of(15,0);

        Duration d3 = Duration.between(lt1, lt2);
        System.out.println(d3);

    }
}
