package PreviousExam.Midterm_2023.midexam2;

// 학번: 2022111982
// 이름: 김경무

import java.util.Scanner;
import java.util.InputMismatchException;

public class MyDiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gamer alpha = new Gamer("Alpha");
        Gamer bravo = new Gamer("Bravo");

        int count = 0;

        while (true) {
            try {
                System.out.println("주사위를 던질 횟수를 입력하세요:");
                count = scanner.nextInt();
                if (count <= 0) {
                    System.out.println("1 이상의 숫자를 입력하세요.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                scanner.nextLine();
            }
        }

        for (int i = 0; i < count; i++) {
            alpha.roll();
            bravo.roll();

            String sign = (alpha.getSum() > bravo.getSum()) ? " > " :
                    (alpha.getSum() < bravo.getSum()) ? " < " : " = ";
            String result = (alpha.getSum() > bravo.getSum()) ? ": Alpha Win" :
                    (alpha.getSum() < bravo.getSum()) ? ": Bravo Win" : ": Even game";

            // 각 행의 길이를 맞춘 toString()을 사용하여 출력
            System.out.println(alpha.toString() + sign + bravo.toString() + result);
        }

        // [최종 통계 출력] - 탭(\t) 대신 %3d로 정교하게 맞춤
        System.out.println("\n[Player별 두 주사위 합의 빈도수]");
        System.out.println("-------------------------------------------");
        System.out.print("      "); // 이름 칸 공백 확보
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n-------------------------------------------");

        printGamerStats(alpha);
        printGamerStats(bravo);
        System.out.println("-------------------------------------------");

        scanner.close();
    }

    public static void printGamerStats(Gamer g) {
        // 이름은 왼쪽 정렬(%-5s), 빈도수는 3칸씩(%3d)
        System.out.printf("%-6s", g.getName());
        int[] freq = g.getFrequencies();
        for (int i = 2; i <= 12; i++) {
            System.out.printf("%3d", freq[i]);
        }
        System.out.println();
    }
}