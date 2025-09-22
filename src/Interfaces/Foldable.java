package Interfaces;

public interface Foldable {

    //static -> u cant implement this to the classes which implements this interface , and u can call this function using the interface name itself
    static void  printFoldInstructions(){
        System.out.println("carefully fold the object");
    }

    //default -> a function that has a body and u dont have to implement it in teh classes that implements this interface
    default void fold(){
        System.out.println("fold the object");
    }



}
