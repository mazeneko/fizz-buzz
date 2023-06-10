package mazeneko.fizzbuzz;

import mazeneko.fizzbuzz.controller.terminal.CommandLineController;

public class App {
  public static void main(String[] args) {
    final var controller = new CommandLineController();
    controller.run(args);
  }
}
