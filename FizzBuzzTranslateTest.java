
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    @Test
    @DisplayName("case 3")
    void getFizzBuzz3() {
        int number =3;
        String result1= "Fizz";
        String result = FizzBuzzTranslate.getFizzBuzz(number);
        assertEquals(result,result1);
    }
    @Test
    @DisplayName("case 5")
    void getFizzBuzz5() {
        int number =5;
        String result1= "Buzz";
        String result = FizzBuzzTranslate.getFizzBuzz(number);
        assertEquals(result,result1);
    }
    @Test
    @DisplayName("case 15")
    void getFizzBuzz15() {
        int number = 15;
        String result1= "FizzBuzz";
        String result = FizzBuzzTranslate.getFizzBuzz(number);
        assertEquals(result,result1);
    }
    @Test
    @DisplayName("case 2")
    void getFizzBuzz2() {
        int number = 2;
        String result1= "hai ";
        String result = FizzBuzzTranslate.getName(number);
        assertEquals(result,result1);
    }
    @Test
    @DisplayName("case 10")
    void getFizzBuzz42() {
        int number = 20;
        String result1= "hai muoi "; 
        String result = FizzBuzzTranslate.getName(number);
        assertEquals(result,result1);
    }
}