package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}

// 바깥 클래스에 대한 인스턴스가 존재해야 내부클래스를 사용할 수 있음.
// 따라서 InnerOuter outer = new InnerOuter(); 정적 중첩 클래스와 다르게 이 코드를 생략할 수 없음.