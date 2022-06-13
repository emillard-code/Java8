package functional_interfaces_3;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredefinedInterfacesApp {

    public static void main( String[] args ) {

        // Predicate Interface
        // Checks if argument is between -100 and 100.
        Predicate<Integer> numberCheck = (i) -> (i > -100) && (i < 100);
        System.out.println(numberCheck.test(50));

        // Function Interface
        // Checks the length of a String.
        Function<String, Integer> wordLength = s -> s.length();
        System.out.println(wordLength.apply("Hello World!"));

    }

}
