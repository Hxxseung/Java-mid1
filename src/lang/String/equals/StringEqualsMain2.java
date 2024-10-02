package lang.String.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");  //새로운 인스턴스 생성, x001
        String str2 = new String("hello");  //새로운 인스턴스 생성, x002
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " +isSame(str3, str4));
    }
    public static boolean isSame(String x, String y) {
        //return x == y;
        return x.equals(y); //Main에서 어떤 문자열(인스턴스가 new String()으로 생성된 것인지, 문자열 리터럴로 생성된 것인지)
                            // 이 들어오는 것을 모르기 때문에 동등성 비교를 해줘야 한다.
    }

}
