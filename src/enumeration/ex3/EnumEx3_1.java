package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class EnumEx3_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price);
        int GOLD = discountService.discount(Grade.GOLD, price);
        int DIAMOND = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + GOLD);
        System.out.println("DIAMOND 등급의 할인 금액: " + DIAMOND);
    }
}
