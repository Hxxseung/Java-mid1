package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }


    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }

        static class Dice implements Process {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        }


        public static void main(String[] args) {
            //hello(new Dice());
            //hello(new Sum());
            Dice dice = new Dice();
            Sum sum = new Sum();

            System.out.println("Hello 실행");
            hello(dice);
            hello(sum);
        }
    }
}
//코드 조각을 넘겨야 함.