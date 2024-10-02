package lang.String.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ":"  + arr[i].length());
            result += arr[i].length();
        }
        System.out.println("result = " +result);
    }
}


//arr배열에 들어있는 모든 문저열의 길이 합을 구해라.