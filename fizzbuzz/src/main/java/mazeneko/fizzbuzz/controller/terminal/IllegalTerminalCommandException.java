package mazeneko.fizzbuzz.controller.terminal;

/**
 * ターミナルから不正なコマンドが入力されたときの例外です。
 */
public class IllegalTerminalCommandException extends RuntimeException {
  public IllegalTerminalCommandException() {
    super();
  }

  public IllegalTerminalCommandException(String message) {
    super(message);
  }

  public IllegalTerminalCommandException(String message, Throwable cause) {
    super(message, cause);
  }

  public IllegalTerminalCommandException(Throwable cause) {
    super(cause);
  }
}
