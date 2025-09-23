package OptionalClasses;

import java.util.Optional;

public class CreatingOptionals {
    public static void main(String[] args) {

            //isPresent
            Optional<User> emptyOptional = Optional.empty();
            System.out.println("empty optional : " + emptyOptional.isPresent());

            Optional<User> optionalUser = Optional.of(new User("Lisa" , 12));
            System.out.println("lisa optional : " + optionalUser.isPresent());


            //ofNullable
            User user = null;
            Optional<User> nullOptional = Optional.ofNullable(user);
            System.out.println("nullOptional : " + nullOptional.isPresent());

            //orElseGet()
            System.out.println(optionalUser.orElseGet(() -> new User("Marina" , 12)));


            //filter + orElse
            System.out.println(optionalUser.filter(u -> u.getName().startsWith("x")).orElse(new User("Luke" , 22)));


            System.out.println(optionalUser.get().getName()); //still Lisa because optional is immutable , it will change the existing optionalUser.

            //map
            Optional<Integer> integerOptional = Optional.of(30);
            System.out.println(integerOptional.map(i -> i * 2).get());

            Optional<Integer> integerOptional2 = Optional.empty();
            System.out.println(integerOptional2.map(i -> i * 2).orElse(50));

    }
}
