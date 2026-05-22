package PreviousExam.Midterm_2022.Friday.midexam2;

// 2022111982
// 김경무

import java.util.Scanner;

public class RollingDiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Gamer alice = new Gamer("Alice", 14);
        Gamer bob = new Gamer("Bob", 14);

        int[] sumCount = new int[29]; // 합계 빈도 (2~28)
        int[][] matrix = new int[15][15]; // 숫자 조합 빈도 (1~14)

        System.out.print("주사위를 던질 회수를 입력하세요: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            alice.roll();
            bob.roll();

            matrix[alice.getFaceNumbers()[0]][alice.getFaceNumbers()[1]]++;
            matrix[bob.getFaceNumbers()[0]][bob.getFaceNumbers()[1]]++;
            sumCount[alice.getDiceSum()]++;
            sumCount[bob.getDiceSum()]++;

            int cmp = alice.compareTo(bob);
            String sign = (cmp > 0) ? " > " : (cmp < 0) ? " < " : " = ";
            String result = (cmp > 0) ? " : Alice Win" : (cmp < 0) ? " : Bob Win" : " : Even game";

            // printf로 전체 게임 진행 상황 출력
            System.out.printf("%s %s %s %s\n", alice.toString(), sign, bob.toString(), result);
        }

        // [결과 출력 1] 두 주사위 합의 빈도수 (가로로 길게 출력)
        System.out.println("\n[두 주사위 합의 빈도수]");
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 2; i <= 28; i++) System.out.printf("%3d", i);
        System.out.println("\n--------------------------------------------------------------------------------");
        for (int i = 2; i <= 28; i++) System.out.printf("%3d", sumCount[i]);
        System.out.println("\n--------------------------------------------------------------------------------");

        // [결과 출력 2] 주사위 숫자별 빈도수 (14x14 행렬)
        System.out.println("[주사위 숫자별 빈도수]");

        // 상단 인덱스 (1~14)
        System.out.print("    "); // 행 인덱스용 여백
        for (int i = 1; i <= 14; i++) System.out.printf("%4d", i);
        System.out.println();

        // 행렬 내용 출력
        for (int i = 1; i <= 14; i++) {
            System.out.printf("%4d", i); // 왼쪽 행 인덱스
            for (int j = 1; j <= 14; j++) {
                System.out.printf("%4d", matrix[i][j]); // 실제 데이터
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        scanner.close();
    }
}