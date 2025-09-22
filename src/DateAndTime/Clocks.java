package DateAndTime;

import java.time.Clock;
import java.time.Duration;

public class Clocks {

    public static void main(String[] args) {

        Clock clock1 =  Clock.systemDefaultZone();

        System.out.println(clock1);
        System.out.println("instant time => " + clock1.instant());
        System.out.println(Clock.systemUTC());
        System.out.println(Clock.systemUTC().instant());

        Clock clock2 = Clock.offset(clock1 , Duration.ofHours(10));   //moves the clock by 10 hrs
        System.out.println(clock2);
        System.out.println(clock2.instant());


    }
}
