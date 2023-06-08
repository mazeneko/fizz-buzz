package mazeneko.fizzbuzz.feature;

import java.util.stream.IntStream;

import mazeneko.fizzbuzz.core.FizzBuzz;

/**
 * FizzBuzzを画面出力するプリンターです。
 */
public class FizzBuzzPrinter {
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
        .mapToObj(FizzBuzz::of)
        .map(FizzBuzz::toString)
        .forEachOrdered(System.out::println);
  }
}
