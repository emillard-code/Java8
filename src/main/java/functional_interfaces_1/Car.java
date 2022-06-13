package functional_interfaces_1;

@FunctionalInterface
public interface Car {

    public void start();

    public default void accelerate() {
        System.out.println("The car is Accelerating...");
    }

    public default void drive() {
        System.out.println("The car is Driving...");
    }

    public static void status() {
        System.out.println("This is a car.");
    }

}
