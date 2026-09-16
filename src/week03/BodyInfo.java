package src.week03;

import java.util.Scanner;

public class BodyInfo {
    // 현재 연도 (상수)
    static final int CURRENT_YEAR = 2026;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름(공백 없이 입력): ");
        String name = scanner.next(); //1. 이름

        System.out.print("출생 연도(예: 2000): ");
        int birthYear = scanner.nextInt(); //2. 출생 연도

        System.out.print("키(cm): ");
        double height = scanner.nextDouble(); //3. 키

        System.out.print("체중(kg): ");
        double weight = scanner.nextDouble(); //4. 체중

        System.out.print("성별 코드(M 또는 F): ");
        char genderCode = scanner.next().charAt(0); //5. 성별(단일 문자)

        int age = CURRENT_YEAR - birthYear + 1; // 나이 = 현재 연도 - 출생 연도 + 1
        double heightM = height / 100;          // cm -> m
        double bmi = weight / (heightM * heightM); // BMI = 체중 / 키(m)의 제곱

        double standardWeight = (height - 100) * 0.9; // 표준체중
        double recommendedCalorie = standardWeight * 30; // 권장 칼로리

        String gender = (genderCode == 'M' || genderCode == 'm') ? "남성" : "여성";

        // 결과 출력
        System.out.print("\n========== 건강 정보 ==========\n");
        System.out.printf("이름: %s%n", name);
        System.out.printf("성별: %c (%s)%n", genderCode, gender);
        System.out.printf("나이: %d세 (출생 연도 %d년)%n", age, birthYear);
        System.out.printf("키: %.1fcm, 체중: %.1fkg%n", height, weight);
        System.out.print("-------------------------------\n");
        System.out.printf("BMI       : %10.2f%n", bmi);
        System.out.printf("표준체중  : %10.2f kg%n", standardWeight);
        System.out.printf("권장 칼로리: %10.2f kcal%n", recommendedCalorie);
        System.out.print("===============================\n");

        scanner.close();
    }
}
