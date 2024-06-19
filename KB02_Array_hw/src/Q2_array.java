import java.util.Scanner;

public class Q2_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productTypes = {"샌드위치", "바게트"};
        int[] productPrices = {2000, 3500};

        int[] orderQuantities = new int[2];

        while (true) {
            System.out.print("주문할 상품을 선택하세요 (1: 샌드위치, 2: 바게트, 0: 주문 종료): ");
            int productChoice = scanner.nextInt();

            if (productChoice == 0) {
                break;
            }

            if (productChoice < 1 || productChoice > 2) {
                System.out.println("잘못된 선택입니다. 다시 선택해 주세요.");
                continue;
            }

            System.out.print("주문할 수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            orderQuantities[productChoice - 1] += quantity;

            System.out.println("현재 주문 상황:");
            for (int i = 0; i < productTypes.length; i++) {
                System.out.println(productTypes[i] + ": " + orderQuantities[i] + "개");
            }

            int totalPrice = 0;
            for (int i = 0; i < productTypes.length; i++) {
                totalPrice += orderQuantities[i] * productPrices[i];
            }
            System.out.println("현재까지의 총 주문 금액: " + totalPrice + "원");
        }

        System.out.println("\n최종 주문 내역:");
        for (int i = 0; i < productTypes.length; i++) {
            System.out.println(productTypes[i] + ": " + orderQuantities[i] + "개");
        }

        int finalTotalPrice = 0;
        for (int i = 0; i < productTypes.length; i++) {
            finalTotalPrice += orderQuantities[i] * productPrices[i];
        }
        System.out.println("최종 주문 가격: " + finalTotalPrice + "원");

        scanner.close();
    }
}
