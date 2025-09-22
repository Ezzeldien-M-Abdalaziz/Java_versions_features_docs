package DateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class ConvertingDates {
    public static void main(String[] args) {

        //convert date
        Date date = new Date(2022,  5 , 10);   //deprecated class for dates
        LocalDateTime ldt =  date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();    //this how you convert it to the new LocalDateTime class
        System.out.println(ldt);   //result -> 3922-06-10T00:00
        // the year and month will come wrong because the Date class start from the year 1900 and the months satrts by default from 1 , so we should calculate fom there

        Date date2 = new Date(122,  4 , 10);   //122 means 1900 + 122 , 4 means 4 + 1
        LocalDateTime ldt2 =  date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(ldt2);   //result -> 2022-05-10T00:00 -> as we wanted

        System.out.println("----------------------------");
        //convert time

        Calendar calendar = Calendar.getInstance();   //old class
        LocalDateTime ldt3 =  calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();  //this how you convert it to the new LocalDateTime class
        System.out.println(ldt3);



    }
}
