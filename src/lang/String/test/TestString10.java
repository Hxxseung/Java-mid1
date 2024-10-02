package lang.String.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,orange";
        String[] fruit = fruits.split(",");

        for(String s : fruit) {
            System.out.println(s);
        }

        String joinedString = String.join("->", fruit);
        System.out.println("joinedString = " + joinedString);
    }
}