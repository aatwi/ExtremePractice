package extreme.practice;

import org.fest.assertions.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void
    it_should_print_1_when_given_1() {
        Assertions.assertThat(FizzBuzz.of(1)).isEqualTo(1);
    }
}
