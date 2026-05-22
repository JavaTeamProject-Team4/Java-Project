package PreviousExam.Midterm_2021.Midexam2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class RollingDiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RollingDice rollingDice = new RollingDice();

        while (true) {
            // ⭐ 프로그램 시작 시 표는 안 나오고, 메뉴만 깔끔하게 나옵니다.
            System.out.println("\nHashMap 전체 빈도수의 합: " + rollingDice.getMapTotalSum());
            System.out.println("1. 주사위 던지기");
            System.out.println("2. 통계치 초기화");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요. => ");

            int menu = -1;
            try {
                menu = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 다시 입력하세요.");
                scanner.nextLine();
                continue;
            }

            if (menu == 0) {
                break;
            } else if (menu == 1) {
                System.out.print("주사위를 던질 회수를 입력하세요.: ");
                int count = 0;
                try {
                    count = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                    scanner.nextLine();
                    continue;
                }

                // 던진 횟수만큼 로직 수행 후, 결과로 2차원 배열이 찍힙니다.
                rollingDice.rollDice(count);

            } else if (menu == 2) {
                // 초기화 후 전부 0으로 세팅된 2차원 배열이 찍힙니다.
                rollingDice.clearStats();

            } else {
                System.out.println("잘못된 메뉴 선택입니다. (0~2)");
            }
        }

        scanner.close();
    }
}