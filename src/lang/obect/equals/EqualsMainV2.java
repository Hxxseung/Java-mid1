package lang.obect.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {

        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2));   //참조값이 다르니까 false
        System.out.println("equals = " + (user1.equals(user2)));  //UserV2에서 equals에 대해 재정의 했으므로 true
    }
}
