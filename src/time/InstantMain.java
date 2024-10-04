package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        //생성
        Instant now = Instant.now();    //UTC 기준 Instant 생성
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);   // 다른 타입의 날짜와 시간을 기준으로 Instant를 생성한다.
                                            // 참고로 Instant는 UTC를 기준으로 하기 대문에 시간대 정보가 필요 => LocalDateTime은 사용할 수 없다.
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(0);  // 에포크 시간을 기준으로 Instant를 생성한다. 0초를 선택하면 에포크 시간인 1970년 1월 1일 0시 0분 0초로 생성
        System.out.println("epochStart = " + epochStart);

        //계산
        Instant later = epochStart.plusSeconds(3600);   //초를 더한다. 초, 밀리초, 나노초 정도만 더하는 간단한 메서드가 제공
        System.out.println("later = " + later);

        //조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);   //에포크시간을 기준으로 흐른 초를 반환한다.
    }
}
