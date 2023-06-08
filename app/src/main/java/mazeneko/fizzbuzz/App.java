package mazeneko.fizzbuzz;

import mazeneko.fizzbuzz.feature.FizzBuzzPrinter;

public class App {
  public static void main(String[] args) {
    final var fizzBuzzPrinter = new FizzBuzzPrinter();
    fizzBuzzPrinter.print(100);
  }
}
