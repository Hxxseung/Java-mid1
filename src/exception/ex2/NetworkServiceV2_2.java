 package exception.ex2;


public class NetworkServiceV2_2 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();   //예외 상황 발생
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getMessage() + ", 메세지: " + e.getMessage()); //catch를 통해서 예외 잡음
            return; //정상적으로 종료 됐기 때문에 전송 문자를 다시 받음
        }
        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getMessage() + ", 메세지: " + e.getMessage());
            return;
        }
        client.disconnect();
    }
}

