import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    @DisplayName("divided by 3")
    void translate() {
        int number = 6;
        String expected = FizzBuzzTranslate.FIZZ;
        String actual = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("divided by 5")
    void translate1() {
        int number = 10;
        String expected = FizzBuzzTranslate.BUZZ;
        String actual = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("divided by 3 and 5")
    void translate2() {
        int number = 30;
        String expected = FizzBuzzTranslate.FIZZ_BUZZ;
        String actual = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("not divided by 3 and 5")
    void translate3() {
        int number = 4;
        String expected = "bon";
        String actual = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("not divided by 3 and 5")
    void translate4() {
        int number = 44;
        String expected = "bon bon";
        String actual = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("not divided by 3 and 5 but have 3")
    void translate5() {
        int number = 13;
        String expected = FizzBuzzTranslate.FIZZ;
        String actual = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("not divided by 3 and 5 but have 5 and 3")
    void translate6() {
        int number = 53;
        String expected = FizzBuzzTranslate.FIZZ_BUZZ;
        String actual = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("not divided by 3 and 5 but have 5")
    void translate7() {
        int number = 52;
        String expected = FizzBuzzTranslate.BUZZ;
        String actual = FizzBuzzTranslate.translate(number);
        assertEquals(expected, actual);
    }

}