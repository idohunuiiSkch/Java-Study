public class Lesson10 {
  public static void main(String[] args) {
    // 条件分岐

    // if (条件) {
    // 条件を満たした時の処理;
    // }

    int age = 22;

    if (age >= 20) {
      System.out.println("adult");
    }

    // if else

    int age18 = 18;

    if (age18 >= 20) {
      System.out.println("adult");
    } else {
      System.out.println("child");
    }

    // if else if

    int age0 = 0;

    if (age0 >= 20) {
      System.out.println("adult");
    } else if (age0 == 0) {
      System.out.println("baby");
    } else {
      System.out.println("child");
    }

  }
}
