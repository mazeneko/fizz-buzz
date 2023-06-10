package mazeneko.fizzbuzz.core;

/**
 * FizzBuzzのコンテキスト。
 * <p>
 * FizzとBuzzになる数値を判定するための約数を保持します。
 */
public class FizzBuzzContext {
  /**
   * デフォルトのコンテキスト。
   */
  private static final FizzBuzzContext defaultContext = FizzBuzzContext.of(3, 5);

  /**
   * デフォルトのコンテキストを返します。
   * <p>
   * Fizzが3、Buzzが5です。
   * 
   * @return デフォルトのコンテキスト
   */
  public static FizzBuzzContext getDefault() {
    return defaultContext;
  }

  /**
   * インスタンスを生成します。
   * 
   * @param fizzNumber Fizzを判定するための約数
   * @param buzzNumber Buzzを判定するための約数
   * @return 生成したインスタンス
   */
  public static FizzBuzzContext of(Integer fizzNumber, Integer buzzNumber) {
    return new FizzBuzzContext(fizzNumber, buzzNumber);
  }

  /** Fizzを判定するための約数 */
  private final Integer fizzNumber;
  /** Buzzを判定するための約数 */
  private final Integer buzzNumber;

  private FizzBuzzContext(Integer fizzNumber, Integer buzzNumber) {
    this.fizzNumber = fizzNumber;
    this.buzzNumber = buzzNumber;
  }

  /**
   * Fizzを判定するための約数を返します。
   * 
   * @return Fizzを判定するための約数
   */
  public Integer getFizzNumber() {
    return fizzNumber;
  }

  /**
   * Buzzを判定するための約数を返します。
   * 
   * @return Buzzを判定するための約数
   */
  public Integer getBuzzNumber() {
    return buzzNumber;
  }
}
