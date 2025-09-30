package Java8.Interfaces;

@FunctionalInterface
public interface Washable {
    default void fold(){
        System.out.println("fold washed objects");
    }

    void wash();
}
