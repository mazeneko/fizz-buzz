package mazeneko.fizzbuzz;

import mazeneko.fizzbuzz.feature.FizzBuzzPrinter;

public class App {
  public static void main(String[] args) {
    final var fizzBuzzPrinter = FizzBuzzPrinter.getDefault();
    fizzBuzzPrinter.print(100);
  }
}
