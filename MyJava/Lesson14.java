class Student {
  String name;
  // フィールドを定義

  public double calculateAvg(double[] data) {
    // calculateAvgというメソッドを定義
    // 引数にdouble型の配列を渡す

    double sum = 0;
    // sumという変数を定義して、0を代入

    for (int i = 0; i < data.length; i++) {
      // 配列doubleの要素数だけ回す
      sum += data[i];
    }
    double avg = sum / data.length;
    // 配列の数で割る
    return avg;
  }

  public String judge(double avg) {
    String result;
    // passedかfailedを代入する変数を定義
    if (avg >= 60) {
      // calculateAvgから受け取ったavg
      result = "passed";
    } else {
      result = "failed";
    }
    return result;
  }

}

// プログラムを開始するためのmainメソッド
public class Lesson14 {
  public static void main(String[] args) {
    Student a001 = new Student(); // インスタンス化
    // オブジェクト名a001

    a001.name = "sato";
    // オブジェクト名.フィールド名 代入

    double[] data = { 70, 65, 50, 90, 30 };
    // double型の配列変数名dataに値を代入

    // double[] data = { 70, 65, 50, 10, 30 };
    // data[3]を10に変更すると
    // 45.0
    // sato failedが表示

    double avg = a001.calculateAvg(data);
    // オブジェクト名:a001の
    // メソッド名:calculateAvgで
    // double型dataを計算し
    // avgに代入

    String result = a001.judge(avg);
    // avgをjudgeメソッドに渡して判定させてresultに格納

    System.out.println(avg);
    // 平均点を表示
    System.out.println(a001.name + " " + result);
    // 生徒の名前と判定結果を表示
  }
}
