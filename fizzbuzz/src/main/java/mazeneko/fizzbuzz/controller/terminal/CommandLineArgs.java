package mazeneko.fizzbuzz.controller.terminal;

import java.util.Arrays;
import java.util.List;

/**
 * コマンドライン引数です。
 */
public class CommandLineArgs {
  /**
   * FizzBuzzを出力する範囲の終端のデフォルト。
   */
  private static final Integer defaultFizzBuzzRangeEnd = 100;

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
    return new ExecuteOptions(resolveFizzBuzzRangeEnd());
  }

  /**
   * FizzBuzzを出力する範囲の終端を解決します。
   * <p>
   * 1つ目の引数がある場合はそれを数値に変換した値となり、ない場合はデフォルトの値を返します。
   * 
   * @return FizzBuzzを出力する範囲の終端
   */
  public Integer resolveFizzBuzzRangeEnd() {
    return args
        .stream()
        .findFirst()
        .map(firstArg -> {
          try {
            return Integer.parseUnsignedInt(firstArg);
          } catch (NumberFormatException e) {
            throw new IllegalTerminalCommandException(firstArg + " : コマンドライン引数の1つ目には正の数値を入力してください。");
          }
        })
        .orElse(defaultFizzBuzzRangeEnd);
  }
}
