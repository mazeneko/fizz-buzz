package mazeneko.fizzbuzz.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
  @Test
  void testOf() {
    final var fizzBuzz = FizzBuzz.of(3);
    assertEquals(3, fizzBuzz.getNumber());
    assertEquals(FizzBuzz.Type.FIZZ, fizzBuzz.getFizzBuzzType());
    assertEquals("Fizz", fizzBuzz.getFizzBuzzString());
  }

  @Test
  void testToFizzBuzzString() {
    assertEquals("FizzBuzz", FizzBuzz.toFizzBuzzString(0));
    assertEquals("1", FizzBuzz.toFizzBuzzString(1));
    assertEquals("2", FizzBuzz.toFizzBuzzString(2));
    assertEquals("Fizz", FizzBuzz.toFizzBuzzString(3));
    assertEquals("4", FizzBuzz.toFizzBuzzString(4));
    assertEquals("Buzz", FizzBuzz.toFizzBuzzString(5));
    assertEquals("Fizz", FizzBuzz.toFizzBuzzString(6));
    assertEquals("7", FizzBuzz.toFizzBuzzString(7));
    assertEquals("8", FizzBuzz.toFizzBuzzString(8));
    assertEquals("Fizz", FizzBuzz.toFizzBuzzString(9));
    assertEquals("Buzz", FizzBuzz.toFizzBuzzString(10));
    assertEquals("11", FizzBuzz.toFizzBuzzString(11));
    assertEquals("Fizz", FizzBuzz.toFizzBuzzString(12));
    assertEquals("13", FizzBuzz.toFizzBuzzString(13));
    assertEquals("14", FizzBuzz.toFizzBuzzString(14));
    assertEquals("FizzBuzz", FizzBuzz.toFizzBuzzString(15));
    assertEquals("16", FizzBuzz.toFizzBuzzString(16));
    assertEquals("17", FizzBuzz.toFizzBuzzString(17));
    assertEquals("Fizz", FizzBuzz.toFizzBuzzString(18));
  }
}
