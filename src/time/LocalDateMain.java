package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();    //now() : 현재 시간을 기준으로 생성한다.
        LocalDate ofDate = LocalDate.of(2013, 11, 21);  //of() : 특정 날짜를 기준으로 생성한다. 년, 월, 일을 입력할 수 있다.
        System.out.println("오늘 날짜 = " + nowDate );
        System.out.println("지정 날짜 = " + ofDate);

        //계산(불변)
        LocalDate plusDays = ofDate.plusDays(10);   //반환 값을 받아서 수정
        System.out.println("지정 날짜 + 10d = " + plusDays);


        // * 모든 날짜 클래스는 불변이다. 따라서 변경이 발생하는 경우 새로운 객체를 생성해서 반환하므로 반환값을 꼭 받아야한다.
    }
}
