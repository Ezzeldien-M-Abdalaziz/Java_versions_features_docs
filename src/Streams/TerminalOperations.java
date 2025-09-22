package Streams;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {

    public static void main(String[] args) {

        String[] names = { "ezz" , "ahmed" ,  "ahidy" , "yasmin" , "nagla" ,"magdy" , "mohamed"};
        List<String> namesList = new ArrayList<>(Arrays.asList(names));

        //create stream based on array
        Arrays.stream(names).forEach(name -> System.out.println(name));

        Optional<String> resultMin =  Arrays.stream(names).min(String::compareToIgnoreCase);  //same as .min((a,b) -> a->compareTo(b));
        System.out.println(resultMin);

        //create stream based on collection
        boolean resultListStream =  namesList.stream().noneMatch(name -> name.isEmpty());
        System.out.println("all not empty : " + resultListStream);

        boolean allMatchStream2 = namesList.stream().allMatch(name -> name.startsWith("e"));
        System.out.println("all start with m : " + allMatchStream2);

        List<String> ListNamesLongerThan5 = namesList.stream().filter(name -> name.length() > 5).collect(Collectors.toList());
        System.out.println(ListNamesLongerThan5);

//        create stream using generate method
        Optional<Integer> minGenerate =  Stream.generate(() -> 5).limit(20).min(Integer::compareTo);   //same as .min((a,b) -> a->compareTo(b));
        System.out.println(minGenerate);

        //create stream using iterate method
        Stream<Integer> iterateStream = Stream.iterate(1, x -> x + 2).limit(10);



        // reduce
        int[] ints = {1,2,3,4,5};

        //Uses reduce(BinaryOperator<T> accumulator).
        //
        //Since there’s no identity value, the result might be empty if the stream is empty.
        //
        //That’s why it returns an OptionalInt (to safely handle "no result").
        OptionalInt summ =  Arrays.stream(ints).reduce(Integer::sum);
        System.out.println(summ);


        //Uses reduce(identity, accumulator).
        //
        //0 is the identity value (neutral element for addition).
        //
        //Because you provided an identity, it always returns a plain int, never empty.
        int summ2 =  Arrays.stream(ints).reduce(0 , (x,y) -> x+y);
        System.out.println(summ2);
    }
}
