package mazeneko.fizzbuzz.controller.terminal;

import java.util.Arrays;
import java.util.List;

import mazeneko.fizzbuzz.core.FizzBuzzContext;

/**
 * コマンドライン引数です。
 */
public class CommandLineArgs {
  /**
   * デフォルトの実行オプションです。
   */
  private static final ExecuteOptions defaultExecuteOptions = new ExecuteOptions(
      1,
      100,
      FizzBuzzContext.getDefault());

  /**
   * インスタンスを生成します。
   * 
   * @param args コマンドライン引数
   * @return 生成したインスタンス
   */
  public static CommandLineArgs of(String[] args) {
    return new CommandLineArgs(Arrays.asList(args));
  }

  /**
   * 引数が1つの場合の実行オプションを解決します。
   * 
   * @param fizzBuzzRangeEndInput FizzBuzzを出力する範囲の終端
   * @return 実行オプション
   */
  private static ExecuteOptions resolveExecuteOptionsSupport(String fizzBuzzRangeEndInput) {
    final Integer fizzBuzzRangeEnd = parseFizzBuzzRangeStartEnd(fizzBuzzRangeEndInput);
    return defaultExecuteOptions
        .withFizzBuzzRangeEnd(fizzBuzzRangeEnd);
  }

  /**
   * 引数が2つの場合の実行オプションを解決します。
   * 
   * @param fizzBuzzRangeStartInput FizzBuzzを出力する範囲の開始
   * @param fizzBuzzRangeEndInput   FizzBuzzを出力する範囲の終端
   * @return 実行オプション
   */
  private static ExecuteOptions resolveExecuteOptionsSupport(
      String fizzBuzzRangeStartInput,
      String fizzBuzzRangeEndInput) {
    final Integer fizzBuzzRangeStart = parseFizzBuzzRangeStartEnd(fizzBuzzRangeStartInput);
    final Integer fizzBuzzRangeEnd = parseFizzBuzzRangeStartEnd(fizzBuzzRangeEndInput);
    return defaultExecuteOptions
        .withFizzBuzzRangeStart(fizzBuzzRangeStart)
        .withFizzBuzzRangeEnd(fizzBuzzRangeEnd);
  }

  /**
   * 引数が4つの場合の実行オプションを解決します。
   * 
   * @param fizzBuzzRangeStartInput FizzBuzzを出力する範囲の開始
   * @param fizzBuzzRangeEndInput   FizzBuzzを出力する範囲の終端
   * @param fizzNumberInput         Fizzを判定するための約数
   * @param buzzNumberInput         Buzzを判定するための約数
   * @return 実行オプション
   */
  private static ExecuteOptions resolveExecuteOptionsSupport(
      String fizzBuzzRangeStartInput,
      String fizzBuzzRangeEndInput,
      String fizzNumberInput,
      String buzzNumberInput) {
    final Integer fizzBuzzRangeStart = parseFizzBuzzRangeStartEnd(fizzBuzzRangeStartInput);
    final Integer fizzBuzzRangeEnd = parseFizzBuzzRangeStartEnd(fizzBuzzRangeEndInput);
    final Integer fizzNumber = parseFizzBuzzNumber(fizzNumberInput);
    final Integer buzzNumber = parseFizzBuzzNumber(buzzNumberInput);
    return defaultExecuteOptions
        .withFizzBuzzRangeStart(fizzBuzzRangeStart)
        .withFizzBuzzRangeEnd(fizzBuzzRangeEnd)
        .withFizzBuzzContext(FizzBuzzContext.of(fizzNumber, buzzNumber));
  }

  /**
   * FizzBuzzを出力する範囲の開始・終端をパースします。
   * 
   * @param input 入力されたテキスト
   * @return FizzBuzzを出力する範囲の開始・終端
   */
  private static Integer parseFizzBuzzRangeStartEnd(String input) {
    try {
      return Integer.parseUnsignedInt(input);
    } catch (NumberFormatException e) {
      throw new IllegalTerminalCommandException(input + " : FizzBuzzを出力する範囲の開始・終端には正の数値を入力してください。");
    }
  }

  /**
   * Fizz・Buzzを判定するための約数をパースします。
   * 
   * @param input 入力されたテキスト
   * @return Fizz・Buzzを判定するための約数
   */
  private static Integer parseFizzBuzzNumber(String input) {
    try {
      return Integer.parseUnsignedInt(input);
    } catch (NumberFormatException e) {
      throw new IllegalTerminalCommandException(input + " : Fizz・Buzzを判定するための約数には正の数値を入力してください。");
    }
  }

  /**
   * コマンドライン引数のオリジナル。
   */
  private final List<String> args;

  private CommandLineArgs(List<String> args) {
    this.args = args;
  }

  /**
   * コマンドライン引数のオリジナルを返します。
   * 
   * @return コマンドライン引数のオリジナル
   */
  public List<String> getArgs() {
    return args;
  }

  /**
   * アプリを実行する時のオプションを解決します。
   * 
   * @return FizzBuzzを出力する範囲の終端
   */
  public ExecuteOptions resolveExecuteOptions() {
    return switch (args.size()) {
      case 0 -> defaultExecuteOptions;
      case 1 -> resolveExecuteOptionsSupport(args.get(0));
      case 2 -> resolveExecuteOptionsSupport(args.get(0), args.get(1));
      case 4 -> resolveExecuteOptionsSupport(args.get(0), args.get(1), args.get(2), args.get(3));
      default -> throw new IllegalTerminalCommandException(args.toString() + " : コマンドライン引数の数が不正です。");
    };
  }
}
