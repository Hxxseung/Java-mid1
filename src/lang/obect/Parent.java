package lang.obect;

//부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
public class Parent {
    //public class Parent extends Object << line4 와 동일한 코드

    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
