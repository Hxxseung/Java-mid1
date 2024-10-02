package lang.String.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "      Java Programming";

        System.out.println("소문자로 변환: "  +strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: "  +strWithSpaces.toUpperCase());

        System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'");  //양쪽 끝 공백 (화이트 스페이스)만 제거 가능
        System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'");    // 위치 지정 가능, 유니코드로 된 특수문자 공백도 제거 가능
        System.out.println("앞 공백 제거(strip): '" +strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): '" +strWithSpaces.stripTrailing() + "'");
    }
}
