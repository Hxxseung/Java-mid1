package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1;//지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;
            //필드를 확인해보면 내부적으로 localVar과 paramVar을 확인 할 수 있다.
            //field = final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar
            //field = final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar


            //field = final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0 / 바깥 필드를 참조하기 위한 필드

            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        return printer; //LocalPrinter를 반환하고 printer 인스턴스는 main이 종료될 때 까지 생존한다.
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        }
    }


//원래라면 paramVar과 localVar이 종료 이후 사라져야 되지만(생명주기가 짧음. 메서드가 끝남과 동시에 사라짐,스택영역) 변수 캡처를 통해 인스턴스를 생성할 때 필요한 지역 변수를 복사해서 보관해둠 (힙영역에)
//스택영역에 있는 localVar과 paramVar을 참조하는 것이 아니라, 인스턴스에 복사된 값을 참조하는 것임.