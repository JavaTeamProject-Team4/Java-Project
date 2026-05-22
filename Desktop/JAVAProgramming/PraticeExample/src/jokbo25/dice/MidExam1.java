package jokbo25.dice;

import java.util.Scanner;

public class MidExam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count;

        while (true) {
            System.out.print("주사위를 던질 회수를 입력하세요(>=10): ");
            count = scanner.nextInt();

            if (count >= 10) {
                break;
            }

            System.out.println("[입력 오류] 다시 숫자를 입력하세요!");
        }

        int[][] freq = new int[6][6];   // 두 주사위 숫자별 빈도수
        int[] sumFreq = new int[11];    // 합 2~12 저장 -> index 0이 합 2

        for (int i = 0; i < count; i++) {
            int dice1 = (int)(Math.random() * 6) + 1;
            int dice2 = (int)(Math.random() * 6) + 1;
            int sum = dice1 + dice2;

            freq[dice1 - 1][dice2 - 1]++;
            sumFreq[sum - 2]++;

            System.out.printf("(%d+%d)=%2d", dice1, dice2, sum);

            if (i != count - 1) {
                System.out.print(", ");
            }

            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        if (count % 5 != 0) {
            System.out.println();
        }

        System.out.println();
        System.out.println("[주사위 숫자별 빈도수]");
        System.out.println();

        System.out.printf("%5s", "");
        for (int i = 1; i <= 6; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.printf("%5s", "");
        for (int i = 0; i < 6; i++) {
            System.out.printf("----");
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            System.out.printf("%3d |", i + 1);
            for (int j = 0; j < 6; j++) {
                System.out.printf("%4d", freq[i][j]);
            }
            System.out.println();
        }

        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("[주사위 합의 빈도수]");

        for (int i = 2; i <= 12; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.println("---------------------------------");

        for (int i = 0; i < sumFreq.length; i++) {
            System.out.printf("%4d", sumFreq[i]);
        }
        System.out.println();

        System.out.println("---------------------------------");

        scanner.close();
    }
}