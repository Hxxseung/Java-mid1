package lang.obect;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString은 object 클래스의 메서드
        String string = child.toString();   //toString => 객체에 대한 정보 전달.
        System.out.println(string);
    }
}
