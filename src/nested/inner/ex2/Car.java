package nested.inner.ex2;


public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    // Car에서만 사용
    private class Engine {

        public void start(){
            System.out.println("충전 레벨 확인: " + chargeLevel);    //내부 클래스는 바깥 클래스를 사용할 수 있음. / get 안쓸 수 있음.
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }

}
