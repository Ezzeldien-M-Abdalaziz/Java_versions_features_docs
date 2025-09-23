package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {

    //🔹 What are Intermediate Operations?
    //
    //Operations that transform a stream into another stream.
    //
    //They are lazy → they don’t execute immediately, they only build up a pipeline.
    //
    //Actual processing happens only when a terminal operation (like forEach, collect, reduce) is called.
    //
    //Can be chained together.

    public static void main(String[] args) {

        String[] names = { "ezz" , "ahmed" ,  "ahidy" , "yasmin" , "nagla" ,"magdy" , "mohamed" , "moamen" , "aly"};
        List<String> namesList = new ArrayList<>(Arrays.asList(names));

        //filter
        namesList.stream().filter(s -> s.startsWith("e")).forEach(System.out::println);   //another way .forEach(s -> system.out.println(s));

        //map
        namesList.stream().map(s -> s + " student").forEach(System.out::println);


        //flatmap
         String[][] names2d = {names , names};

         String[] names1d = Stream.of(names2d).flatMap(arr -> Stream.of(arr)).toArray(size -> new String[size]);

         for (String s : names1d) {
             System.out.println("1d arr: " + s);
         }


         //peek
        String[] names1d2 = Stream.of(names2d)
                .flatMap(arr -> Stream.of(arr))
                .peek(s -> System.out.println("peek: " + s))   //replace the loop after the flatmap.toArray
                .toArray(size -> new String[size]);


         //limit and skip
        Arrays.stream(names1d2).skip(1).forEach(s-> System.out.println("skip: " + s));    //skips first one
        Arrays.stream(names1d2).limit(1).forEach(s-> System.out.println("limit: " + s));   //limit just for the first one

        Arrays.stream(names1d2).skip(3).limit(5).forEach(s-> System.out.println("skip&&limit: " + s));


        //distinct
        long nrOfDistinctiveValues = Arrays.stream(names1d2).distinct().count();
        System.out.println("distinct values: " +  nrOfDistinctiveValues);


        //sorted
        Arrays.stream(names1d2).sorted().forEach(s-> System.out.println("sorted: " + s));






    }

}
