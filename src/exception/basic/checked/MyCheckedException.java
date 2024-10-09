package exception.basic.checked;

/*
 Exception을 상속받은 예외는 체크 예외가 된다.
 */

public class MyCheckedException extends Exception{
    public MyCheckedException(String message) {
        super(message);
    }
}

//부모를 타고 올라갔는데 예외가 존재 -> 체크 예외