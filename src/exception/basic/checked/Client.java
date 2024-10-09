package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException{
        throw new MyCheckedException("ex"); //여기서 문제가 터지면 처리할 수 없으므로 밖으로 던지고 더이상 아래로 코드가 진행되지 않는다.
                                            //호출 한 위치로 문제가 넘어감 (여기선 Service에서 호출했으므로 Service로 넘어감)
    }
}

//
