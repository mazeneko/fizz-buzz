[![GitHub](https://img.shields.io/badge/GitHub-FizzBuzz-brightgreen.svg?logo=GitHub)](https://github.com/mazeneko/fizz-buzz)

# Fizz Buzz

Fizz Buzzアプリです。

このプロジェクトはJavaを使ったプログラミングのサンプルとして作成されています。

## Fizz Buzzについて

数を順番に数えて発言してゆき、  
3の倍数の場合は`Fizz`、  
5の倍数の場合は`Buzz`、  
3と5の両方の倍数の場合は`FizzBuzz`と発言するゲームです。

詳細は[Wikipedia](https://ja.wikipedia.org/wiki/Fizz_Buzz)などを参照してください。

## 使い方

`fizzbuzz-x.x.x.zip`もしくは`fizzbuzz-x.x.x.tar`を解凍し、`bin`フォルダにある実行スクリプトを実行してください。
※この圧縮ファイルは、gradleのbuildタスクを実行したときに`build/distributions`フォルダに生成されます。

### 1から100までのFizzBuzzを表示するとき

コマンドライン引数なしで実行すると、1から100までのFizzBuzzを表示します。

```bash
$ ./fizzbuzz
```

### 1から任意の数までのFizzBuzzを表示するとき

1つ目のコマンドライン引数で数を指定すると、1から指定した数までのFizzBuzzを表示します。

```bash
$ ./fizzbuzz 1000
```