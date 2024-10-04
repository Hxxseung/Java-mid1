package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade ClassGrade, int price) {
        int discountPercent = 0;

        if (ClassGrade == BASIC) {
            discountPercent = 10;
        } else if (ClassGrade == GOLD){
            discountPercent = 20;
        } else if  (ClassGrade == DIAMOND){
            discountPercent = 30;
        } else{
            System.out.println("할인 X");
        }

        return price * discountPercent / 100;
    }
}
