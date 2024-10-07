package nested;

public class ShadowingMain {
    public int value = 1;
    
    class Inner {
        public int value = 2;
        
        void go(){
            int value = 3;
            System.out.println("value = " +  value);    //지역변수 우선순위
            System.out.println("this.value = " + this.value);
            System.out.println("ShadowingMain.value = " + ShadowingMain.this.value); //맨위의 value = 1에 접근 할 수 있음.
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
