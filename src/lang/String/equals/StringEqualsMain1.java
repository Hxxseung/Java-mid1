package lang.String.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");  //새로운 인스턴스 생성, x001
        String str2 = new String("hello");  //새로운 인스턴스 생성, x002
        System.out.println("new String() == 비교 : " + (str1 == str2));   //false -> 다른 인스턴스이므로 false
        System.out.println("new String() equals 비교 :" + str1.equals(str2)); //true -> 내부에 같은 값을 갖고 있으므로 true (동등성)

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));

        /*
        문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다.
        문자열 리터럴을 사용하는 str3은 x003의 인스턴스를 반환한다.
        문자열 리터럴을 사용하는 str4는 str3과 같은 x003을 참조한다.
        result = > 같은 문자를 사용하는 경우 메모리 사용을 줄이고 성능 최적화가 가능하다.
        문자열 풀 : 힙 영역을 사용, 문자를 찾을 때는 해시 알고리즘을 사용하기 때문에 빠른 속도로 String 인스턴스를 찾을 수 있다.
         */

    }

}
