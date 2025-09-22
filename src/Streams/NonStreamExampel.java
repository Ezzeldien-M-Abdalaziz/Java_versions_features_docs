package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonStreamExampel {

    public static void main(String[] args) {

        String[] names = {"ezz" , "ahmed" , "haidy"};
        List<String> namesList = new ArrayList<>();

        for(String name : names) {
            if(name.startsWith("a") || name.startsWith("b") || name.startsWith("c")) {
                namesList.add(name);
            }
        }
        System.out.println(namesList);

//--------------------------------------------------------------

        for(int i =0; i <names.length; i++) {
            if(!names[i].equals("ezz")){
                names[i] += " student";
            }
            System.out.println(names[i]);
        }


        //----------------------------------------------

        List<String> namesList2 = new ArrayList<>(Arrays.asList(names));


//        for(String name : namesList2) {
//            if(name.equals("ezz")){
//                namesList2.remove(name);   //exception because while looping through a list , you cant modify it
//            }
//        }



    }
}
