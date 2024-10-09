package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        //NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        //NetworkServiceV2_1 networkService = new NetworkServiceV2_1 ();
        //NetworkServiceV2_2 networkService = new NetworkServiceV2_2 ();
        //NetworkServiceV2_3 networkService = new NetworkServiceV2_3 ();
        //NetworkServiceV2_4 networkService = new NetworkServiceV2_4 ();
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5 ();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("전송할 문자: ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}

//V2_1 모든 곳에서 예외를 잡지 않았기 때문 결과적으로 main() 밖으로 예외가 던져진다.
//main() 밖으로 예외 던져지면 예외 멧ㅔ지와 예외를 추적할 수 있는 스택 트레이스를 출력하고 프로그램을 종료한다.



