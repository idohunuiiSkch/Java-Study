// 「クラス
// (データ)フィールド (処理)メソッド
// 」
// Javaでは、「データ」のことをフィールドといい、
// 「処理」のことをメソッドという。
// メソッドとフィールドのような
// クラスの要素のことを
// メンバーという

// フィールドとはクラス内に定義された変数のことでメンバーともいう
// フィールド = メンバー変数
// フィールドは変数と同じように、数値や文字列を代入したり、参照したりすることができる
// クラスにフィールドを追加することをフィールドを定義するという

class Student {
  String name = "sato";

  public void calculateAvg(int math, int english) {
    System.out.println((math + english) / 2);
  }

}

// クラスは、クラスに作られたインスタンスを変数に代入してから使う
// クラスはインスタンスになって初めて使えるようになる
// インスタンスを作ることを「インスタンス化」「オブジェクト化」「オブジェクト生成」という。

public class Lesson13 {
  public static void main(String[] args) {
    Student a001 = new Student(); // インスタンス化
    // インスタンス化とは実体化という意味
    a001.name = "sato"; // フィールドに値を代入
    // オブジェクト名.フィールド名

    System.out.println(a001.name);
    a001.calculateAvg(90, 80);

    Student a002 = new Student();
    a002.name = "suzuki";
    // a002というオブジェクトを作って、nameフィールドにsuzukiを代入
    System.out.println(a002.name);
    a002.calculateAvg(70, 80);

    // クラスは一度定義しておけば、あとからいくらでもオブジェクトを作ることができる
    // イメージとしてはパソコンで使うコピペ
    // このようにオブジェクトを取り入れてプログラミングを
    // 構築することをオブジェクト指向プログラミングという

  }
}
