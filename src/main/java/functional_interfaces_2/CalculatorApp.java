package functional_interfaces_2;

public class CalculatorApp {

    public static void main( String[] args ) {

        // Lambda Expression
        Calculator calculator = (a, b) -> {
            System.out.println("The sum of the numbers is " + (a + b) + ".");
            System.out.println();
        };

        calculator.add(5, 10);

    }

}
