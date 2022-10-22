public class Lesson11 {
  public static void main(String[] args) {
    // 繰り返し処理

    for (int i = 0; i <= 4; i++) {
      System.out.println(i);
    }

    // break文
    for (int i = 0; i <= 4; i++) {
      if (i == 3) {
        break;
      }
      System.out.println(i);
    }

    // continue文
    // continue文は、繰り返し処理をしていて、ある条件に当てはまったら、
    // その処理をスキップしたいときに使う
    // for (int i = 0; i <= 4; i++) {
    // if (条件) {
    // continue;
    // }
    // }

    for (int i = 0; i <= 4; i++) {
      if (i == 3) {
        continue;
      }
      System.out.println(i);
    }

    // for文のネスト
    for (int i = 0; i <= 2; i++) {
      for (int j = 0; j <= 2; j++) {
        System.out.println(i + "-" + j);
      }
    }

    // カウンタ変数を使った配列操作
    int arr[] = { 2, 4, 6, 8, 10 };

    for (int i = 0; i <= 4; i++) {
      System.out.println(arr[i]);
    }

    int sum = 0;
    for (int i = 0; i <= 4; i++) {
      sum += arr[i];
    }
    System.out.println(sum);

  }
}
