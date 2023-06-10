package mazeneko.fizzbuzz.controller.terminal;

/**
 * アプリを実行する時のオプションをまとめるコンテナクラスです。
 */
public record ExecuteOptions(
    /** FizzBuzzを出力する範囲の終端 */
    Integer fizzBuzzRangeEnd) {
}
