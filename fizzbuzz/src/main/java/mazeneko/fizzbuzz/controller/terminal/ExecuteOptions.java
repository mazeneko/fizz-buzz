package mazeneko.fizzbuzz.controller.terminal;

import lombok.With;
import mazeneko.fizzbuzz.core.FizzBuzzContext;

/**
 * アプリを実行する時のオプションをまとめるコンテナクラスです。
 */
@With
public record ExecuteOptions(
    /** FizzBuzzを出力する範囲の開始 */
    Integer fizzBuzzRangeStart,
    /** FizzBuzzを出力する範囲の終端 */
    Integer fizzBuzzRangeEnd,
    /** FizzBuzzのコンテキスト */
    FizzBuzzContext fizzBuzzContext) {
}
