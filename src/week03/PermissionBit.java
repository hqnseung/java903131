package src.week03;

public class PermissionBit {
    // 권한 플래그 (비트 자리마다 하나의 권한)
    static final int READ    = 1; // 0001
    static final int WRITE   = 2; // 0010
    static final int EXECUTE = 4; // 0100
    static final int MASTER  = 8; // 1000

    public static void main(String[] args) {
        System.out.println("===== 사원 권한 변경 추적 =====");
        System.out.println("READ=" + READ + ", WRITE=" + WRITE + ", EXECUTE=" + EXECUTE + ", MASTER=" + MASTER);

        // [Step 1] 초기 상태 : 모든 권한 없음(0)
        int permission = 0;
        System.out.println("\n[Step 1] 초기 상태 (권한 없음)");
        System.out.printf("권한 값: %2d, 비트: %4s%n",
                permission, String.format("%4s", Integer.toBinaryString(permission)).replace(' ', '0'));

        // [Step 2] 권한 부여 : OR(|) -> 해당 비트를 1로 켠다
        permission = permission | READ | WRITE;
        System.out.println("\n[Step 2] 권한 부여 (OR)  : permission | READ | WRITE");
        System.out.printf("권한 값: %2d, 비트: %4s%n",
                permission, String.format("%4s", Integer.toBinaryString(permission)).replace(' ', '0'));

        // [Step 3] 권한 회수 : AND NOT(& ~) -> 지정한 비트만 0으로 끈다
        permission = permission & ~WRITE;
        System.out.println("\n[Step 3] 권한 회수 (AND NOT) : permission & ~WRITE");
        System.out.printf("권한 값: %2d, 비트: %4s%n",
                permission, String.format("%4s", Integer.toBinaryString(permission)).replace(' ', '0'));

        // [Step 4] 권한 토글 : XOR(^) -> 0은 1로, 1은 0으로 뒤집는다
        permission = permission ^ MASTER;
        System.out.println("\n[Step 4] 권한 토글 (XOR) : permission ^ MASTER");
        System.out.printf("권한 값: %2d, 비트: %4s%n",
                permission, String.format("%4s", Integer.toBinaryString(permission)).replace(' ', '0'));

        // [Step 5] 권한 확인 : AND(&) 결과가 0이 아니면 권한 보유
        System.out.println("\n[Step 5] 권한 확인 (AND)");
        System.out.println("WRITE  보유 여부 -> (permission & WRITE)  != 0 : " + ((permission & WRITE) != 0));
        System.out.println("MASTER 보유 여부 -> (permission & MASTER) != 0 : " + ((permission & MASTER) != 0));
        System.out.println("READ   보유 여부 -> (permission & READ)   != 0 : " + ((permission & READ) != 0));

        System.out.println("\n최종 권한 값: " + permission + " (비트: "
                + String.format("%4s", Integer.toBinaryString(permission)).replace(' ', '0') + ")");
        System.out.println("==============================");
    }
}
