package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterators {

    public static void main(String[] args) {

        Room Cambridge = new Room("cambridge" , "premier room" , 4 , 175);
        Room pocaddely = new Room("pocaddely" , "premier room" , 2 , 200);
        Room wesmainster = new Room("wesmainster" , "premier room" , 3 , 300);
        Room oxford = new Room("oxford" , "premier room" , 3 , 300);
        Room victoira = new Room("victoira" , "premier room" , 3 , 300);


        Collection<Room> rooms = new ArrayList<>(Arrays.asList(Cambridge,wesmainster, oxford,victoira , pocaddely ));

        Iterator<Room> iterator = rooms.iterator();
        //get all the names //this is not how it used normally
//        System.out.println(iterator.next().getName());
//        System.out.println(iterator.next().getName());
//        System.out.println(iterator.next().getName());

        //put it inside a loop
//        while(iterator.hasNext()){
//            System.out.println(iterator.next().getName());
//        }

        //another way
        for (Room room : rooms) {
            System.out.println(room.getName());
        }

        System.out.println("--------------------------------------------------------");
        //------------------------------------------------------------------------//

        oxford.setPetFriendly(true);
        victoira.setPetFriendly(true);

        //wrong way , and it will fail because JVM behavior of protecting from removing while iterating
//        for (Room room : rooms) {
//            if(room.isPetFriendly()) {
//                rooms.remove(room);  //error -> .ConcurrentModificationException
//            }
//        }


        //correct way
//        Collection<Room> removeRooms = new ArrayList<>();
//        for (Room room : rooms) {
//            if (room.isPetFriendly()) {
//                removeRooms.add(room);
//            }
//        }
//        rooms.removeAll(removeRooms); //bulk operation


        //another correct way
//        Iterator<Room> iterator2 = rooms.iterator();
//        while (iterator2.hasNext()) {
//            Room room = iterator2.next();
//            if(room.isPetFriendly()) {
//                iterator2.remove();
//            }
//        }

        //super clean way java 8+
        rooms.removeIf(Room::isPetFriendly);

        rooms.stream().forEach(r -> System.out.println(r.getName()));








    }
}
