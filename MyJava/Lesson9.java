/**
 * Lesson9
 */
public class Lesson9 {

  public static void main(String[] args) {
    int x = 10;
    int y = 2;
    int z = 10;

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);
    System.out.println(x % y);

    // 関係演算子
    System.out.println(x > y);
    System.out.println(x > y);
    System.out.println(x >= y);
    System.out.println(x <= y);
    System.out.println(x >= z);

    // 等価演算子
    System.out.println(x == y);
    System.out.println(x != y);

    // 論理演算子
    int xx = 8;
    int yy = 3;

    System.out.println(xx >= 5 && xx <= 10);
    System.out.println(yy >= 5 && yy <= 10);
    System.out.println(xx == 3 || yy == 3);
    System.out.println(xx == 1 || yy == 1);

    // 代入演算子
    int xxx = 8;
    int yyy = 12;
    int zzz = 20;

    System.out.println(xxx += 10);
    System.out.println(zzz += yyy);

    // インクリメントとデクリメント
    int xxxx = 8;
    int yyyy = 8;
    xxxx++;
    yyyy--;

    System.out.println(xxxx);
    System.out.println(yyyy);

  }
}
