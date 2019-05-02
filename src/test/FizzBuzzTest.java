package test;

import main.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class FizzBuzzTest {

    @Test
    public void finalValueGreaterThanInitialValue() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertTrue(fizzBuzz.isEndGreaterThan(2, 3));
    }

    @Test
    public void positiveValues() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertTrue(fizzBuzz.isPositive(2, 3));
    }

    @Test
    public void threeFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("Fizz", fizzBuzz.calculateFizzBuzz(3));
    }

    @Test
    public void fiveBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("Buzz", fizzBuzz.calculateFizzBuzz(5));
    }

    @Test
    public void multipleThreeFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("FizzBuzz", fizzBuzz.calculateFizzBuzz(15));
    }

    @Test
    public void notMultipleThreeFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("16", fizzBuzz.calculateFizzBuzz(16));
    }
}