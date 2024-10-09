package exception.ex2;


public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        client.connect();   //체크 예외이므로 throws추가
        client.send(data);
        client.disconnect();
    }
}

