package exception.basic.checked;

/*
Checked 예외는 예외를 잡아서 처리하거나, 던지거나 둘중 하나를 필수로 선택해야 한다.
 */

public class Service {
    Client client = new Client();
    /*
    예외를 잡아서 처리하는 코드
     */

    public void callCatch(){
        try{
            client.call();
        } catch (MyCheckedException e){ //MyCheckedException은 Exception의 자식이므로 Exception을 넣어도 똑같이 예외 처리를 할 수 있다.
                                        //예외도 객체이기 때문에 다형성 적용이 가능하다.
            //예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }
    /*
    체크 예외를 밖으로 던지는 코드
    체크 예외는 에외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
    */

    public void callThrow() throws MyCheckedException{
        client.call();
    }

}
