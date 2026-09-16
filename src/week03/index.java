package src.week03;

public class index {
    public static void main(String[] args) {
        int num = 123;
        System.out.println("--- 1. 정수형 (Integer) ---");
        System.out.printf("기본 정수: %d%n", num); 
        System.out.printf("%5d%n", num); //1. “   123"
        System.out.printf("%-5d%n", num); //2. “123   "
 
        double pi = 3.14159265;
        System.out.println("\n--- 2. 실수형 (Floating-point) ---");
        System.out.printf("기본 실수: %f%n", pi);
        System.out.printf("%.2f%n", pi);
        System.out.printf("%8.2f%n", pi);  //3. "     3.14"

        String text = "Java";
        char ch = 'A';
        System.out.println("\n--- 3. 문자열 및 문자 (String & Character) ---");
        System.out.printf("%s%n", text);
        System.out.printf("%-10s%n", text);  //4.” Java      "
        System.out.printf("%c%n", ch);  //5.”A”

        boolean isTrue = true;
        System.out.println("\n--- 4. 기타 포맷 ---");
        System.out.printf("%b%n", isTrue);  
        System.out.println("\n--- 5. 복합 사용 ---");
        System.out.printf("언어: %s, 버전: %d, 평가: %.1f점%n", "Java", 21, 9.5); 

}
}