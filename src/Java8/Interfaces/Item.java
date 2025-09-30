package Java8.Interfaces;

public class Item implements Foldable , Washable {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    public void fold() {
        System.out.println("fold the object " + name);
    }

    @Override
    public void wash() {
        System.out.println("wash the object " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Foldable.printFoldInstructions();     //we can still access this without implementing the interface

        Item i = new Item("jeans");
        i.fold();


    }
}
