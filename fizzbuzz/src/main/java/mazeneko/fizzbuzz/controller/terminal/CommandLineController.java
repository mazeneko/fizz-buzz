package mazeneko.fizzbuzz.controller.terminal;

import mazeneko.fizzbuzz.feature.FizzBuzzPrinter;

/**
 * コマンドラインからアプリを実行するためのコントローラーです。
 */
public class CommandLineController {
  /**
   * アプリを実行します。
   * 
   * @param args コマンドライン引数。
   */
  public void run(String[] args) {
    final ExecuteOptions options;
    try {
      options = CommandLineArgs.of(args).resolveExecuteOptions();
    } catch (IllegalTerminalCommandException e) {
      System.out.println(e.getLocalizedMessage());
      return;
    }

    final var fizzBuzzPrinter = FizzBuzzPrinter.of(options.fizzBuzzContext());
    fizzBuzzPrinter.print(options.fizzBuzzRangeStart(), options.fizzBuzzRangeEnd());
  }
}
