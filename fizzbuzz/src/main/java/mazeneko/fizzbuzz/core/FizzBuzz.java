package mazeneko.fizzbuzz.core;

import lombok.EqualsAndHashCode;

/**
 * FizzBuzz。
 * <p>
 * 数値が3の倍数であればFizz、5の倍数であればBuzz、3と5の両方の倍数であればFizzBuzz、それ以外は数値そのままの文字となります。
 * <p>
 * また、FizzとBuzzに対応する数のデフォルトは3と5ですが、任意の{@link FizzBuzzContext}を使用することで別の数に変更することが可能です。
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
      return forNumber(FizzBuzzContext.getDefault(), number);
    }

    /**
     * 数値がFizzBuzzのどのタイプであるかを返します。
     * 
     * @param context コンテキスト
     * @param number  数値
     * @return FizzBuzzのタイプ
     */
    public static Type forNumber(FizzBuzzContext context, Integer number) {
      final var fizz = number % context.getFizzNumber() == 0;
      final var buzz = number % context.getBuzzNumber() == 0;
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

  /**
   * 数値をFizzBuzz文字列に変換します。
   * 
   * @param number 数値
   * @return FizzBuzz文字列
   */
  public static String toFizzBuzzString(Integer number) {
    return toFizzBuzzString(FizzBuzzContext.getDefault(), number);
  }

  /**
   * 数値をFizzBuzz文字列に変換します。
   * 
   * @param context コンテキスト
   * @param number  数値
   * @return FizzBuzz文字列
   */
  public static String toFizzBuzzString(FizzBuzzContext context, Integer number) {
    return switch (Type.forNumber(context, number)) {
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
    return of(FizzBuzzContext.getDefault(), number);
  }

  /**
   * 数値からインスタンスを生成します。
   * 
   * @param context コンテキスト
   * @param number  数値
   * @return FizzBuzzのインスタンス
   */
  public static FizzBuzz of(FizzBuzzContext context, Integer number) {
    return new FizzBuzz(context, number);
  }

  /** コンテキスト */
  private final FizzBuzzContext context;
  /** 数値 */
  private final Integer number;

  private FizzBuzz(FizzBuzzContext context, Integer number) {
    this.context = context;
    this.number = number;
  }

  /**
   * コンテキストを返します。
   * 
   * @return コンテキスト
   */
  public FizzBuzzContext getContext() {
    return context;
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
    return Type.forNumber(context, number);
  }

  /**
   * FizzBuzz文字列を返します。
   * 
   * @return FizzBuzz文字列
   */
  public String getFizzBuzzString() {
    return toFizzBuzzString(context, number);
  }

  @Override
  public String toString() {
    return number + " -> " + getFizzBuzzString();
  }
}
