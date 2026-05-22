// 2022111982
// 김경무

package PreviousExam.Midterm_2025.midexam1;

import java.util.Scanner;

public class dice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.print("주사위를 던질 회수를 입력하세요(>=10): ");
            n = sc.nextInt();
            if (n < 10) System.out.println("[입력 오류] 다시 숫자를 입력하세요!");
        }while(n < 10);
        int size = n / 5;

        int[][] array = new int[7][7];
        int[] sumArray = new int[13];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                array[i][j] = 0;
            }
        }
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            int first = (int) (Math.random() * 6) + 1;
            int second = (int) (Math.random() * 6) + 1;
            int sum = first + second;

            array[first][second] += 1;
            sumArray[sum] += 1;

            System.out.printf("(%d+%d)=%2d", first, second, sum);

            if ((i + 1) % 5 == 0 || i == n - 1) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }

        System.out.println("[주사위 숫자별 빈도수]");
        System.out.printf("    %2d %2d %2d %2d %2d %2d\n", 1, 2, 3, 4, 5, 6);
        System.out.println("    ------------------");
        for (int i = 1; i <= 6; i++) {
            System.out.printf("%2d| %2d %2d %2d %2d %2d %2d\n", i, array[i][1], array[i][2], array[i][3], array[i][4], array[i][5], array[i][6]);
        }
        System.out.println("---------------------------------");

        System.out.println("\n[주사위 합의 빈도수]");
        System.out.printf("%2d %2d %2d %2d %2d %2d %2d %2d %2d %2d %2d\n", 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        System.out.println("---------------------------------");
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%2d ", sumArray[i]);
        }
        System.out.println("\n---------------------------------");
    }
}
