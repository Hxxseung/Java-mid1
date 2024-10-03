package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        //String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("Integer = " + integer1);

        //Integer -> int
        int intvalue = integer1.intValue();
        System.out.println("intvalue = " + intvalue);

        //int -> Integer
        Integer integer2 = Integer.valueOf(intvalue);
        System.out.println("integer2 = " + integer2);
    }
}
