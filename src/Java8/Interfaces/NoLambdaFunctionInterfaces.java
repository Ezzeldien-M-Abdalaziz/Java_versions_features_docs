package Java8.Interfaces;

import java.util.Locale;
import java.util.function.Predicate;

public class NoLambdaFunctionInterfaces {

    public static void main(String[] args) {
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("S".toLowerCase(Locale.ROOT));
            }
        };

        System.out.println(predicate.test("sara"));
    }
}
