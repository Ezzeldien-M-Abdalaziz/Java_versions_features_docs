package Java8.OptionalClasses;

import java.util.Optional;

public class Challenge {

    public static void main(String[] args) {

        //1 - create an empty optional of type string
        Optional<String> emptyOptional = Optional.empty();


        //2-create an optioanl containg an integer
        Optional<Integer> integerOptional = Optional.of(52);

        //3-get the value of the empty optional or specify default value
        System.out.println(emptyOptional.orElseGet(() -> "hi there"));

        //4-filter the integer optional
        integerOptional.filter(n -> n % 2 != 0).orElseThrow(() -> new RuntimeException());

        //map and add 1 and get the value
        System.out.println(integerOptional.map(n -> n + 1).get());



    }
}
