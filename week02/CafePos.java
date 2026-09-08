package week02;

import java.util.Scanner;

/**
 * 학내 카페 미니 POS(Point Of Sale) 시스템
 * - 메뉴명(String), 단가/수량(int), 할인율/세율(double) 자료형 활용
 * - 부가세 10%, 할인 20%는 final 상수로 선언
 * - 계산은 double, 최종 결제 금액은 명시적 형 변환으로 int 출력(소수점 버림)
 */
public class CafePos {

    // 식별자 및 상수 (final)
    static final double VAT_RATE = 0.1;        // 부가세율 10%
    static final double DISCOUNT_RATE = 0.2;   // 할인율 20%
    static final String STORE_NAME = "NURI CAFE";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 메뉴명 -> 단가 -> 수량
        System.out.print("메뉴명을 입력하세요 : ");
        String menu = sc.next();

        System.out.print("단가를 입력하세요 : ");
        int price = sc.nextInt();

        System.out.print("수량을 입력하세요 : ");
        int quantity = sc.nextInt();

        // 계산 (int 연산 결과를 double로 명시적 형 변환하여 소수점 계산)
        int supplyAmount = price * quantity;                          // 공급가액
        double discountAmount = (double) supplyAmount * DISCOUNT_RATE; // 할인 금액
        double discountedPrice = (double) supplyAmount - discountAmount; // 할인 후 금액
        double vatAmount = discountedPrice * VAT_RATE;                 // 부가세
        double totalPrice = discountedPrice + vatAmount;               // 세금 포함 금액

        // 타입 변환: 소수점 이하 버림 -> 정수형 결제 금액
        int payment = (int) totalPrice;

        // 출력: printf + 이스케이프 문자(\n, \t) + 우측 정렬(%10d)
        System.out.printf("\n===========================================\n");
        System.out.printf("\t\t%s 영수증\n", STORE_NAME);
        System.out.printf("===========================================\n");
        System.out.printf("메뉴명\t\t수량\t\t금액\n");
        System.out.printf("-------------------------------------------\n");
        System.out.printf("%s\t\t%3d개\t%10d원\n", menu, quantity, supplyAmount);
        System.out.printf("-------------------------------------------\n");
        System.out.printf("공급가액\t\t\t%10d원\n", supplyAmount);
        System.out.printf("할인금액(%.0f%%)\t\t\t%10d원\n", DISCOUNT_RATE * 100, (int) discountAmount);
        System.out.printf("부가세(%.0f%%)\t\t\t%10d원\n", VAT_RATE * 100, (int) vatAmount);
        System.out.printf("===========================================\n");
        System.out.printf("최종 결제 금액\t\t\t%10d원\n", payment);
        System.out.printf("===========================================\n");
        System.out.printf("\t이용해 주셔서 감사합니다.\n");

        sc.close();
    }
}
