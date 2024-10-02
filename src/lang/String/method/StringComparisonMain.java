package lang.String.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";   //대문자 일부 있음
        String str2 = "hello, java!";   //대문자 없음 모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2 " + str1.equalsIgnoreCase(str2));    //대소문자 비교 무시 => result : true

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with 'Hello' : " + str1.startsWith("Hello"));   //시작 문자열 Hello인지 확인
        System.out.println("str1 ends with 'Java!' : " + str1.endsWith("Java!"));       //끝 문자열 Java!인지 확인
    }
}
