package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);    //컴파일 단계에서 추가

        //Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();   //컴파일 단계에서 추가

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
