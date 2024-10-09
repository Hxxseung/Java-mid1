 package exception.ex2;


public class NetworkServiceV2_4 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data); // throw new RuntimeException("ex"); 발생 => 언체크 예외, 이 곳에서 예외를 잡지 않으므로 밖으로 던짐.
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }
        //NetworkClientException이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
        client.disconnect();
    }
}

