package mazeneko.fizzbuzz.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzz_TypeTest {
  @Test
  void testForNumber() {
    assertEquals(FizzBuzz.Type.FIZZBUZZ, FizzBuzz.Type.forNumber(0));
    assertEquals(FizzBuzz.Type.NUMBER, FizzBuzz.Type.forNumber(1));
    assertEquals(FizzBuzz.Type.NUMBER, FizzBuzz.Type.forNumber(2));
    assertEquals(FizzBuzz.Type.FIZZ, FizzBuzz.Type.forNumber(3));
    assertEquals(FizzBuzz.Type.NUMBER, FizzBuzz.Type.forNumber(4));
    assertEquals(FizzBuzz.Type.BUZZ, FizzBuzz.Type.forNumber(5));
    assertEquals(FizzBuzz.Type.FIZZ, FizzBuzz.Type.forNumber(6));
    assertEquals(FizzBuzz.Type.NUMBER, FizzBuzz.Type.forNumber(7));
    assertEquals(FizzBuzz.Type.NUMBER, FizzBuzz.Type.forNumber(8));
    assertEquals(FizzBuzz.Type.FIZZ, FizzBuzz.Type.forNumber(9));
    assertEquals(FizzBuzz.Type.BUZZ, FizzBuzz.Type.forNumber(10));
    assertEquals(FizzBuzz.Type.NUMBER, FizzBuzz.Type.forNumber(11));
    assertEquals(FizzBuzz.Type.FIZZ, FizzBuzz.Type.forNumber(12));
    assertEquals(FizzBuzz.Type.NUMBER, FizzBuzz.Type.forNumber(13));
    assertEquals(FizzBuzz.Type.NUMBER, FizzBuzz.Type.forNumber(14));
    assertEquals(FizzBuzz.Type.FIZZBUZZ, FizzBuzz.Type.forNumber(15));
    assertEquals(FizzBuzz.Type.NUMBER, FizzBuzz.Type.forNumber(16));
    assertEquals(FizzBuzz.Type.NUMBER, FizzBuzz.Type.forNumber(17));
    assertEquals(FizzBuzz.Type.FIZZ, FizzBuzz.Type.forNumber(18));
  }
}
