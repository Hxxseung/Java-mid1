package exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("http://example.com");
        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult); //로그 해결, 문제 발생 시 호출하지 않음.
            return;
        }

        String sendResult = client.send(data);
        if(isError(sendResult)){
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }

        client.disconnect();
    }

    private static boolean isError(String resultCode){
        return !resultCode.equals("success");
    }
}

//문제점 : 에러 발생 시 메서드 호출은 하지 않으나 네트워크 연결이 해제되지 않음 -> 네트워크 연결자원 고갈

