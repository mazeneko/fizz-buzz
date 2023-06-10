package mazeneko.fizzbuzz.feature;

import java.util.stream.IntStream;

import mazeneko.fizzbuzz.core.FizzBuzz;
import mazeneko.fizzbuzz.core.FizzBuzzContext;

/**
 * FizzBuzzを画面出力するプリンターです。
 */
public class FizzBuzzPrinter {
  /**
   * デフォルトのプリンターを返します。
   * 
   * @return デフォルトのプリンター
   */
  public static FizzBuzzPrinter getDefault() {
    return FizzBuzzPrinter.of(FizzBuzzContext.getDefault());
  }

  /**
   * インスタンスを生成します。
   * 
   * @param context コンテキスト
   * @return 生成したインスタンス
   */
  public static FizzBuzzPrinter of(FizzBuzzContext context) {
    return new FizzBuzzPrinter(context);
  }

  /** コンテキスト */
  private final FizzBuzzContext context;

  private FizzBuzzPrinter(FizzBuzzContext context) {
    this.context = context;
  }

  /**
   * 1から指定された数値までのFizzBuzzを出力します。
   * 
   * @param end 最後の数
   */
  public void print(Integer end) {
    print(1, end);
  }

  /**
   * 指定された数値範囲のFizzBuzzを出力します。
   * 
   * @param start 最初の数
   * @param end   最後の数
   */
  public void print(Integer start, Integer end) {
    IntStream
        .rangeClosed(start, end)
        .mapToObj(number -> FizzBuzz.of(context, number))
        .map(FizzBuzz::toString)
        .forEachOrdered(System.out::println);
  }
}
