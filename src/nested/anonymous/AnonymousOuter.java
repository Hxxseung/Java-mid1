package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {

    private int outInstanceVar = 3;

    public  void process(int paramVar){

        int localVar = 1;

        Printer printer = new Printer() {   //익명클래스는 이름이 없고 $1 , $2 순으로 생긴다
                                            //인터페이스를 생성하는 것이 아니라 Printer라는 이름의 인터페이스를 구현한 익명 클래스를 생성하는 것. => 상속(구현)하면서 바로 생성하는 것을 의미
            int value = 0;

            @Override   //인터페이스도 구현 가능하다.
            public void print() {
                System.out.println("value: " + value);  //자신의 인스턴스 변수인 value에 접근 가능
                System.out.println("localVar: " + localVar);    //자신이 속한 코드 블럭의 지역변수인 localVar에 접근 가능
                System.out.println("paramVar: " + paramVar);    //자신이 속한 코드 블럭의 매개변수인 paramVar에 접근 가능, 참고로 매개변수도 지역 변수의 한 종류이다.
                System.out.println("outInstanceVar: " + outInstanceVar); // 바깥 클래스의 인스턴스 멤버에도 접근 가능 ( 지역 클래스도 내부 클래스의 한 종류이다.)
            }
        };
        printer.print();
        System.out.println("printer.class=" + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter localOuter = new AnonymousOuter();
        localOuter.process(2);
    }
} 

