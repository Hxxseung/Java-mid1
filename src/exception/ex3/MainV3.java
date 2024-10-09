package exception.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args)   {
        NetworkServiceV3_1 networkService = new NetworkServiceV3_1 ();
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



