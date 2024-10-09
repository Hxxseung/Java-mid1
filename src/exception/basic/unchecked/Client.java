package exception.basic.unchecked;

public class Client {
    public void call(){
        throw new MyUncheckedException("ex");
    }
}
// throw를 안적어도 예외상황 발생시 알아서 넘김