package src.week03;

import java.util.Scanner;

public class CafeReceipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("메뉴명(공백 없이 입력): ");
        String menuName = scanner.next();  //1. 
        
        System.out.print("단가(양의 정수): ");
        int price = scanner.nextInt();   //2. 
        
        System.out.print("수량(양의 정수): ");
        int quantity = scanner.nextInt(); //3.
        
        System.out.print("받은 금액: ");
        int moneyReceived = scanner.nextInt();

        int subtotal = price * quantity; // 상품 합계 = 단가 * 수량
        int vat = subtotal / 10;  // 부가세
        int discount = subtotal / 5; // 할인액
        
        // 최종 결제 금액 = 합계 + 부가세 - 할인액
        int totalAmount = subtotal + vat - discount;
        int change = moneyReceived - totalAmount;
        System.out.println("\n\n최종 결제 금액: " + totalAmount );
        
        //영수증 출력
        System.out.print( "\n========== 영수증 ==========\n");
        System.out.print( "메뉴명: " + menuName + "\n" +  "단가: " + price + "원" + "\n수량: " + quantity + "개\n");
        System.out.print( "----------------------------\n");
        System.out.print( "상품 합계: " + subtotal + "원" +  "\n부가세(10%): " + vat + "원" + "\n할인(20%): -" + discount + "원\n" );
        System.out.print( "----------------------------\n");
        System.out.print("최종 결제 금액: " + totalAmount + "원" + "\n받은 금액: " + moneyReceived + "원" + "\n거스름돈: " + change + "원\n");
        System.out.print("============================\n");
        scanner.close();
    }
}