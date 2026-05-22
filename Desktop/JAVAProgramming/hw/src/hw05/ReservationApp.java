// 학번 : 2025005685
// 이름 : 유다경 

package hw05;

import java.util.Scanner;

public class ReservationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AirlineSystem airlineSystem = new AirlineSystem(scanner);
        BusSystem busSystem = new BusSystem(scanner);

        while (true) {
            printMainMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("잘못된 메뉴 선택입니다. 숫자를 다시 입력해주세요 (0~2)");
                scanner.next();
                continue;
            }

            int menu = scanner.nextInt();

            if (menu == 1) {
                airlineSystem.run();
            } else if (menu == 2) {
                busSystem.run();
            } else if (menu == 0) {
                System.out.println("K-Startup 통합 예약 시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴 선택입니다. 다시 입력해주세요 (0~2)");
            }
        }

        scanner.close();
    }

    public static void printMainMenu() {
        System.out.println("----------------------------------------------");
        System.out.println("  K-Startup의 통합 예약 시스템을 방문해 주셔서 감사합니다.");
        System.out.println("     1. 항공사 예약 시스템");
        System.out.println("     2. 버스 예약 시스템");
        System.out.println("     0. 통합 예약 시스템 종료");
        System.out.println("----------------------------------------------");
        System.out.print("메뉴를 선택해주세요: ");
    }
}
