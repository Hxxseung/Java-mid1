 package exception.ex3;

 import exception.ex3.exception.ConnectExceptionV3;
 import exception.ex3.exception.NetworkClientExceptionV3;

 public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();   // 1. ConnectExceptionV3 발생
            client.send(data); // 1. SendExceptionV3 발생
                                //1. RuntimeException 발생
        }  catch (ConnectExceptionV3 e) {   //2. 잡아서 처리 //2. 대상이 다름 //2. 대상이 다름
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) { //3.NetworkClientExceptionV3 은 부모이므로 여기서 잡음. //3. 대상이 다름
            System.out.println("[네트워크 오류] 메시지: "+ e.getMessage());
        } catch(Exception e){   //4.Exception은 RuntimeException의 부모이므로 여기서 잡음.
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        }
        finally {
            client.disconnect();
        }
    }
}

