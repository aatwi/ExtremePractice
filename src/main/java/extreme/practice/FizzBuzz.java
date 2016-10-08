package extreme.practice;

public class FizzBuzz {

    protected static final String FIZZ = "Fizz";
    protected static final String BUZZ = "Buzz";
    private static final int THREE = 3;
    private static final int FIVE = 5;

    public static String parse(int number) {
        if (isMultipleOf(number, THREE) && isMultipleOf(number, FIVE)) {
            return FIZZ+BUZZ;
        }
        if (isMultipleOf(number, THREE)) {
            return FIZZ;
        }
        if (isMultipleOf(number, FIVE)) {
            return BUZZ;
        }
        return Integer.toString(number);
    }

    private static boolean isMultipleOf(int number, int divisor) {
        return number % divisor == 0;
    }
}
