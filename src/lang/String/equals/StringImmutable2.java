package lang.String.equals;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
 //String은 final 객체기 때문에 변경이 필요한 경우 기존 값을 변경하지 않고, 새로운 결과를 만들어서 반환해야한다.