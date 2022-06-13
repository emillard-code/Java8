package functional_interfaces_1;

public class CarApp {

    public static void main( String[] args ) {

        Car.status();

        // Lambda Expression
        Car car = ()-> System.out.println("The car is Starting...");

        car.start();
        car.drive();
        car.accelerate();

    }

}
