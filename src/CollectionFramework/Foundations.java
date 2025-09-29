package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Foundations {

    public static void main(String[] args) {

        /*
        always use an abstract as possible because this makes it eaiser to switch between the collections while using the same data
        -Collection<String> c1 = new ArrayList<>(); -> ok
        -List<String> c1 = new ArrayList<>(); -> less abstract than Collection
        -ArrayList<String> c1 = new ArrayList<>(); -> not okay
        */

        Collection<String> c1 = new ArrayList<>();
        c1.add("ezz");
        c1.add("sabrien");
        c1.add("ahmed");
        c1.add("haidy");
        c1.add("m");
        c1.add("m");
        System.out.println(c1);

        //exp of the above notes
        Collection<String> c2 = new HashSet<>(c1);
        System.out.println(c2);  //one of the m's removed because hashset dont allow duplicates


    }
}




























