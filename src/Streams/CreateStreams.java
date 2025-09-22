package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

    public static void main(String[] args) {

        String[] names = { "ezz" , "ahmed" ,  "ahidy" , "yasmin" , "nagla" ,"magdy" , "mohamed"};
        List<String> namesList = new ArrayList<>(Arrays.asList(names));

        //create stream based on array
        Stream<String> ArrayStream = Arrays.stream(names);

        //create stream based on collection
        Stream<String> listStream = namesList.stream();

        //create stream using generate method
        Stream<Integer> generateStream = Stream.generate(() -> 5).limit(10);

        //create stream using iterate method
        Stream<Integer> iterateStream = Stream.iterate(1, x -> x + 2).limit(10);
    }
}
