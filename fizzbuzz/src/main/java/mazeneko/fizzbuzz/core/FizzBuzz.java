package mazeneko.fizzbuzz.core;

import lombok.EqualsAndHashCode;

/**
 * FizzBuzz。
 * <p>
 * 数値が3の倍数であればFizz、5の倍数であればBuzz、3と5の両方の倍数であればFizzBuzz、それ以外は数値そのままの文字となります。
 */
@EqualsAndHashCode
public class FizzBuzz {
  public static enum Type {
    FIZZ,
    BUZZ,
    FIZZBUZZ,
    NUMBER;

    /**
     * 数値がFizzBuzzのどのタイプであるかを返します。
     * 
     * @param number 数値
     * @return FizzBuzzのタイプ
     */
    public static Type forNumber(Integer number) {
      final var fizz = number % fizzNumber == 0;
      final var buzz = number % buzzNumber == 0;
      if (fizz && buzz) {
        return Type.FIZZBUZZ;
      }
      if (fizz) {
        return Type.FIZZ;
      }
      if (buzz) {
        return Type.BUZZ;
      }
      return Type.NUMBER;
    }
  }

  /** Fizzとなる数値の約数 */
  public static final int fizzNumber = 3;
  /** Buzzとなる数値の約数 */
  public static final int buzzNumber = 5;

  /**
   * 数値をFizzBuzz文字列に変換します。
   * 
   * @param number 数値
   * @return FizzBuzz文字列
   */
  public static String toFizzBuzzString(Integer number) {
    return switch (Type.forNumber(number)) {
      case FIZZ -> "Fizz";
      case BUZZ -> "Buzz";
      case FIZZBUZZ -> "FizzBuzz";
      case NUMBER -> String.valueOf(number);
    };
  }

  /**
   * 数値からインスタンスを生成します。
   * 
   * @param number 数値
   * @return FizzBuzzのインスタンス
   */
  public static FizzBuzz of(Integer number) {
    return new FizzBuzz(number);
  }

  /** 数値 */
  private final Integer number;

  private FizzBuzz(Integer number) {
    this.number = number;
  }

  /**
   * 数値を返します。
   * 
   * @return 数値
   */
  public Integer getNumber() {
    return number;
  }

  /**
   * FizzBuzzのタイプを返します。
   * 
   * @return FizzBuzzのタイプ
   */
  public Type getFizzBuzzType() {
    return Type.forNumber(number);
  }

  /**
   * FizzBuzz文字列を返します。
   * 
   * @return FizzBuzz文字列
   */
  public String getFizzBuzzString() {
    return toFizzBuzzString(number);
  }

  @Override
  public String toString() {
    return number + " -> " + getFizzBuzzString();
  }
}
