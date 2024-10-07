package nested.nested.ex2;

public class Network {

    public void sendMessage(String text){
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {   //private static을 보고 내부 중첩 클래스임을 알 수 있음
                                            //Network 클래스 내부에 NewworkMessage가 private static으로 걸려있어 외부에서 사용불가
                                            //외부에서 사용하는 경우에는 ex1과 같이 바깥으로 빼야한다.

        private String content;

        public NetworkMessage(String content){
            this.content = content;
        }

        public void print(){
            System.out.println(content);
        }
    }
}
