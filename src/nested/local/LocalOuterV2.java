package nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3;

    public  void process(int paramVar){

        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;  //클래스의 멤버변수

            @Override   //인터페이스도 구현 가능하다.
            public void print(){
                System.out.println("value: " + value);  //자신의 인스턴스 변수인 value에 접근 가능
                System.out.println("localVar: " + localVar);    //자신이 속한 코드 블럭의 지역변수인 localVar에 접근 가능
                System.out.println("paramVar: " + paramVar);    //자신이 속한 코드 블럭의 매개변수인 paramVar에 접근 가능, 참고로 매개변수도 지역 변수의 한 종류이다.
                System.out.println("outInstanceVar: " + outInstanceVar); // 바깥 클래스의 인스턴스 멤버에도 접근 가능 ( 지역 클래스도 내부 클래스의 한 종류이다.)
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
} 

