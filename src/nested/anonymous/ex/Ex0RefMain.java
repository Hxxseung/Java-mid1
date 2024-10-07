package nested.anonymous.ex;

public class Ex0RefMain {

    public  static void hello(String str){
        System.out.println("프로그램 시작");   //변하지 않는 부분
        System.out.println(str);            //변하는 부분 , 외부에서 입력받기
        System.out.println("프로그램 종료");   //변하지 않는 부분
    }

    public static void main(String[] args) {
        hello("Hello Java");    //외부에서 입력해줌
        hello("Hello Spring");  //외부에서 입력해줌
        //핵심 : 변하는 부분을 내부에서 처리하는 것이 아닌 외부에서 입력받아 처리함.
    }
}
