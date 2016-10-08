package extreme.practice;

import extreme.practice.FizzBuzz;
import org.fest.assertions.api.Assertions;
import org.fest.assertions.api.StringAssert;
import org.junit.Test;

import static extreme.practice.FizzBuzz.BUZZ;
import static extreme.practice.FizzBuzz.FIZZ;

public class FizzBuzzTest {

    @Test
    public void it_should_print_one_when_given_one() {
        assertFizzBuzz(1, "1");
    }

    @Test
    public void it_should_print_2_when_given_2() {
        assertFizzBuzz(2, "2");
    }

    @Test
    public void
    it_should_print_fizz_with_3() {
        assertFizzBuzz(3, FIZZ);
    }

    @Test
    public void
    it_should_print_fizz_with_6() {
        assertFizzBuzz(6, FIZZ);
    }

    @Test
    public void
    it_should_print_buzz_with_5() {
        assertFizzBuzz(5, BUZZ);
    }

    @Test
    public void it_should_print_fizzbuzz_with_15() {
        assertFizzBuzz(15, FIZZ + BUZZ);
    }

    private StringAssert assertFizzBuzz(int number, String expected) {
        return Assertions.assertThat(FizzBuzz.parse(number)).isEqualTo(expected);
    }
}
