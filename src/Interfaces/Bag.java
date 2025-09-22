package Interfaces;

public class Bag implements Foldable , Washable{
    public void fold() {
        System.out.println("folding Bag");
    }

    @Override
    public void wash() {
        System.out.println("washing Bag");
    }

    public static void main(String[] args) {
        Bag b = new Bag();
        b.fold();
    }
}
