package exception.ex2;

public class NetworkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 { //여기서 처리가 안되면 던 ( 안던지면 컴파일에러남 )
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패"); //체크예외
            //중간에 다른 예외가 발생했다고 가정
            //throw new RuntimeException("ex"); // => 런타임 예외에 대해서 서비스에서 잡지 않으므로 처리 할 수 없음 => 서버 연결 해제도 안됨.
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
        //더이상 리턴 할 필요가 없어서 String -> void
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if(sendError) {
            //throw new NetworkClientExceptionV2("sendError", address + " 서버 연결 실패");
            //중간에 다른 예외가 발생했다고 가정
            throw new RuntimeException("ex");
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data){
        if(data.contains("error1")){
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }

}
