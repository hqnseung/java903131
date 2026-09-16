package src.week03;

import java.util.Scanner;

public class InputExam {
    public static void main(String[] args) {  //main() 헤더 정의
        int salary; //월급을 저장하기 위한 int형 변수 salary 선언
        long pay; //연봉을 계산하여 저장하기 위한 long형 변수 pay 선언 
        Scanner input = new Scanner(System.in);

        System.out.print("월급을 입력하시오: ");  // 입력 안내 출력
        salary = input.nextInt(); //입력 받은 값을 변수 salary에 저장
        pay = (long) salary * 12; //연봉(월급 * 12)을 계산하여 pay에 저장
        System.out.println("월급: " + salary + "연봉: " + pay); //연봉과 월급을 출력
    } 
}
