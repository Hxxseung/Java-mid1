package lang.String;

public class StringConcatMain {
    public static void main(String[] args) {

        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2); //원래 참조값끼리 더하기는 불가능하다. String만 특별히 허용된다.
    }
}
