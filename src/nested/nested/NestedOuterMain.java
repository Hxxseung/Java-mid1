package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        //NestedOuter outer = new NestedOuter();    //없어도 됨.
        NestedOuter.Nested nested = new NestedOuter.Nested();   //정적 중첩 클래스
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());

    }
}
