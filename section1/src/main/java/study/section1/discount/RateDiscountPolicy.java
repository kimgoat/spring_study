package study.section1.discount;

import org.springframework.stereotype.Component;
import study.section1.member.Grade;
import study.section1.member.Member;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int dicountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP)
            return price * dicountPercent /100;
        else
            return 0;
    }
}
