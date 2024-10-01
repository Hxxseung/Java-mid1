package lang.obect.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {

        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2));   //참조값이 다르니까 false
        System.out.println("equals = " + (user1.equals(user2)));    //Object가 기본적으로 제공하는 것은 동일성을 기준으로 제공한다.
                                                                    //따라서 동등성 비교를 사용하고싶으면 equals 메서드를 재정의 해야한다.
    }
}
