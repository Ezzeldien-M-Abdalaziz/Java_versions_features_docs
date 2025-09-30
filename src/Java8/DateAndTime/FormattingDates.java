package Java8.DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDates {

    public static void main(String[] args) {

    LocalDateTime ldt = LocalDateTime.now();
        String formattedDate = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(ldt);
        String formattedDate2 = DateTimeFormatter.BASIC_ISO_DATE.format(ldt);


    System.out.println(ldt);
        System.out.println(formattedDate);   //same as default
        System.out.println(formattedDate2);



        //ANOTHER WAY
        String pattern = "dd/MM/yyyy HH:mm:ss";
        String pattern2 = "dd/MMMM/yyyy HH:mm:ss";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern2);

        System.out.println(formatter.format(ldt));
        System.out.println(formatter2.format(ldt));


        //ANOTHER WAY
        String formateStyleDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(ldt);
        System.out.println(formateStyleDate);

        String formateStyleDate2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(ldt);
        System.out.println(formateStyleDate2);

    }



}
