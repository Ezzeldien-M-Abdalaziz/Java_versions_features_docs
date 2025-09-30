package Java8.Lmabda;

public class MethodArgs {
    public static void main(String[] args) {

        System.out.println(runTester(str -> str.length() > 5 , "hello world"));
        System.out.println(runTester(str -> str.startsWith("p") , "hello world"));


    }

    public static boolean runTester(Tester t , String str) {
       return  t.test(str);
    }
}
