import java.util.Scanner;

public class Q4_hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("여행 지역을 입력하시오");
        String place = sc.next();
        System.out.println("1인당 여행 경비");
        double price = sc.nextDouble();
        System.out.println("여행 인원");
        double people = sc.nextDouble();
        System.out.println("할인율");
        double discount = sc.nextDouble();
        System.out.println("vip 여부 true/false 입력");
        boolean vip = sc.nextBoolean();
        double totalPrice = price * people;
        double vipDiscount = 0;
        double totalDiscount = vipDiscount + discount;


        if (vip = true) {
            vipDiscount += 5;
        }
        System.out.println("마지막 말");
        String text = sc.next();

        System.out.println("====여행 경비 계산 결과====");
        System.out.println("place = " + place);
        System.out.println("price = " + price);
        System.out.println("people = " + people);
        System.out.println("discount = " + discount);
        System.out.println("vip 추가 할인율 " + vipDiscount);
        System.out.println("총 할인율 : " + (vipDiscount + discount));

        System.out.println("총 경비 " + totalPrice);
        System.out.println("할인 금액 " + totalPrice* 0.2d*(totalDiscount));
        System.out.println("할인 후 총 경비 " + (totalPrice - totalPrice / totalDiscount));
        System.out.println("text = " + text);
    }
}
