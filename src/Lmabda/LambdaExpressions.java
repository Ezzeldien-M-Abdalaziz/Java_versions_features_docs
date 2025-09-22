package Lmabda;

public class LambdaExpressions {

    public static void main(String[] args) {
        Calculater calc = ( a,  b) -> a * b;
        Calculater calc2 = ( Integer a,Integer  b) -> {return a * b;};
        System.out.println(calc.calc(5, 3));
        System.out.println(calc2.calc(10, 3));


        Creator creator = () -> "hello world";
        System.out.println(creator.create());

        Tester theTester = str -> str.length() > 5;   //could also be (str) ->
        System.out.println(theTester.test("hello world"));


        Tester theTester2 = str -> {
            String s = str.substring(0, str.length() - 2);
            return s.length() == str.length();
        };
        System.out.println(theTester2.test("hello world"));
    }


}
