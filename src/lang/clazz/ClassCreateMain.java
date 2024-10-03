package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
//Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();    //객체 생성
        String result = hello.hello();  //객체 호출
        //System.out.println("hello = " + hello); //객체 확인
        System.out.println("result = " + result);
    }
}