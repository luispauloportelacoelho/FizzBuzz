package main;

public class FizzBuzz {

    public boolean isEndGreaterThan(int initialValue, int finalValue) {
        if (initialValue > finalValue) {
            return false;
        }
        return true;
    }

    public boolean isPositive(int initialValue, int finalValue) {
        if (initialValue < 0 || finalValue < 0) {
            return false;
        }
        return true;
    }

    public String  calculateFizzBuzz(int value) {

        String answer = "";

        if (value % 3 == 0) {
            answer = answer.concat("Fizz");
        }

        if (value % 5 == 0) {
            answer = answer.concat("Buzz");
        }

        if (answer.isEmpty()) {
            return Integer.toString(value);
        }

        return answer;
    }
}
