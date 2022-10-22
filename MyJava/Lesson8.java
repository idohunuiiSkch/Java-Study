public class Lesson8 {
  public static void main(String[] args) {
    // 配列

    // 宣言 代入
    // データ型[]配列変数名;
    // 配列変数名 = new データ型[要素数];

    String[] arr;
    arr = new String[3];

    arr[0] = "sato";
    arr[1] = "suzuki";
    arr[2] = "takahashi";

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    // 宣言代入

    // データ型[]配列変数名 = {データ1,データ2,....};
    String[] arr1 = { "ito", "tanaka", "tarou" };

    System.out.println(arr1[0]);
    System.out.println(arr1[1]);
    System.out.println(arr1[2]);

    // 配列内変更
    arr[1] = "yoshida";
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    // 多次元配列
    String[][] arr2;
    arr2 = new String[2][2];

    arr2[0][0] = "shindou";
    arr2[0][1] = "touya";
    arr2[1][0] = "waya";
    arr2[1][1] = "isumi";

    System.out.println(arr2[0][0]);
    System.out.println(arr2[0][1]);
    System.out.println(arr2[1][0]);
    System.out.println(arr2[1][1]);

    // 多次元配列 宣言代入(省略形)
    String[][] arr3 = { { "ochi", "fukui" }, { "ogata", "nase" } };
    System.out.println(arr3[0][0]);
    System.out.println(arr3[0][1]);
    System.out.println(arr3[1][0]);
    System.out.println(arr3[1][1]);

  }
}
