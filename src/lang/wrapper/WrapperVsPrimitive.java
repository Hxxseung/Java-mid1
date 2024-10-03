package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime , endTime;

        //기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");

        //래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for(int i = 0; i < iterations; i++) {
            sumWrapper += i;    //오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래서 Long 실행 시간: " + (endTime - startTime) + "ms");
    }
}

//기본형 래퍼형에서의 차이는 CPU 연산을 아주 많이 수행하는 특수한 경우나, 수만번 이상 연속해서 연산을 수행하는 경우 => 기본형을 사용해서 최적화 고려
