package main;

public class Execute {

    public static void main(String[] args){
        FizzBuzz fizzBuzz = new FizzBuzz();

        int initialValue = 1;
        int finalVaulue = 100;

        if (fizzBuzz.isEndGreaterThan(initialValue, finalVaulue)
                && fizzBuzz.isPositive(initialValue, finalVaulue)) {
            for(int i = initialValue; i <= finalVaulue; i++) {
                System.out.println(fizzBuzz.calculateFizzBuzz(i));
            }
        }

    }
}
