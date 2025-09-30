package Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {

    public static void main(String[] args) {

        //🔹 Sequential reduce
        //int total = Stream.of(1,2,3,4,5,6,7,8,9,10)
        //                  .reduce(1, (x,y) -> x+y);
        //
        //
        //Identity = 1
        //
        //Reduce works like: (((((((((1+1)+2)+3)+4)+5)+6)+7)+8)+9)+10


        int total = Stream.of(1, 2, 3, 4, 5 ,6,7,8,9, 10).reduce(1, (x, y) -> x + y);
        System.out.println(total);  //56 which is right


        //⚠️ What happens in parallel?
        //
        //Parallel streams split the data into chunks (substreams).
        //
        //Each substream applies the identity again at its start.
        //
        //Then the results are combined.
        //
        //So effectively, the 1 identity is added multiple times (once per substream), which inflates your result → 65 instead of 56.

        //diff outcome with parallel streams
        int total2 = Stream.of(1, 2, 3, 4, 5 ,6,7,8,9, 10)
                .parallel()
                .reduce(1, (x, y) -> x + y);
        System.out.println(total2); //65 because with parallel now , it sums the identity every time the stream reduces



        //performance test
        String[] names = { "ezz" , "ahmed" ,  "ahidy" , "yasmin" , "nagla" ,"magdy" , "mohamed" , "moamen" , "aly"};
        List<String> namesList = new ArrayList<>(Arrays.asList(names));

        long StartPar = System.currentTimeMillis();
        namesList.parallelStream().filter(s -> s.startsWith("m")).forEach(System.out::println);
        long EndPar = System.currentTimeMillis();

        System.out.println("parallel stream time: " + (EndPar - StartPar));

        long StartSeq = System.currentTimeMillis();
        namesList.stream().filter(s -> s.startsWith("m")).forEach(System.out::println);
        long EndSeq = System.currentTimeMillis();

        System.out.println("sequential stream time: " + (StartSeq - EndSeq));
    }
}
