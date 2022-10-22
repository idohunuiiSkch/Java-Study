public class Lesson7 {
  public static void main(String[] args) {

    // byte -100〜100
    // short -3万〜3万
    // int -20億〜0億
    // long 「京」の桁以上
    // longの場合だけ、最後に小文字か大文字の「L」を付ける必要がある
    byte var01 = 1;
    short var02 = 12345;
    int var03 = 1234567890;
    long var04 = 123456789000L;

    System.out.println(var01);
    System.out.println(var02);
    System.out.println(var03);
    System.out.println(var04);

    // 小数系データ型
    // double (floatより多く扱える)
    // floatの場合だけ、最後に小文字か大文字の「L」を付ける必要がある

    double var1 = 1.23456789;
    float var2 = 1.234F;

    System.out.println(var1);
    System.out.println(var2);

    // 文字系データ型
    // char 文字一つ '' を使う
    // String 「文字二つ以上」 "" を使う
    // Stringは正確にはデータ型ではなく「クラス」

    char var_a = 'a';
    String var_b = "hello,World";

    System.out.println(var_a);
    System.out.println(var_b);

    // boolean型

    int varA = 10;
    int varB = 1;
    boolean var_bool;

    var_bool = (varA < varB);

    System.out.println(var_bool);

  }
}
