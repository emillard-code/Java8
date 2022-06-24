package com.project;

import functional_interfaces_1.Car;
import functional_interfaces_2.Calculator;
import method_references_1.Animal;
import method_references_1.Mammal;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {

        System.setOut(new PrintStream(outputStreamCaptor));

    }

    @Test
    public void testCar() {

        Car car = ()-> System.out.println("The car is Starting...");
        car.start();

        Assertions.assertEquals("The car is Starting...", outputStreamCaptor.toString().trim());

    }

    @Test
    public void testCalculator() {

        Calculator calculator = (a, b) -> {
            System.out.println("The sum of the numbers is " + (a + b) + ".");
            System.out.println();
        };

        calculator.add(5, 10);

        Assertions.assertEquals("The sum of the numbers is 15.", outputStreamCaptor.toString().trim());

    }

    @Test
    public void testPredicateInterface() {

        Predicate<Integer> numberCheck = (i) -> (i > -100) && (i < 100);

        Assertions.assertTrue(numberCheck.test(50));

    }

    @Test
    public void testFunctionInterface() {

        Function<String, Integer> wordLength = s -> s.length();

        Assertions.assertEquals(wordLength.apply("Hello World!"), 12);

    }

    @Test
    public void testMethodReferenceInstance() {

        Mammal cat = new Mammal();
        Animal tabbyCat = cat::meow;

        tabbyCat.sound("Meow!");

        Assertions.assertEquals("Meow. Meow!", outputStreamCaptor.toString().trim());

    }

    @Test
    public void testMethodReferenceStatic() {

        Animal poodleDog = Mammal::woof;

        poodleDog.sound("Woof!");

        Assertions.assertEquals("Bark. Woof!", outputStreamCaptor.toString().trim());

    }

    @AfterEach
    public void tearDown() {

        System.setOut(standardOut);

    }

}
