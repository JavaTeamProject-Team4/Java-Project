// 학번 : 2025005685
// 이름 : 유다경 

package hw05;

import java.util.Scanner;

public class AirlineSystem extends ReservationSystem {
    private Scanner scanner;
    private String title;

    public AirlineSystem(Scanner scanner) {
        this.scanner = scanner;
        this.title = "항공사 예약 시스템";
        makeSeats(4, 10);
    }

    public void run() {
        while (true) {
            printMenu();

            if (!scanner.hasNextInt()) {
                System.out.println("잘못된 메뉴 선택입니다. 숫자를 다시 입력해주세요 (1~4)");
                scanner.next();
                continue;
            }

            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("예약할 좌석 이름을 입력하세요: ");
                String seatName = scanner.next();
                int result = reserveSeat(seatName);

                if (result == 0) {
                    displaySeat(title);
                }
            } else if (menu == 2) {
                System.out.print("취소할 좌석 이름을 입력하세요: ");
                String seatName = scanner.next();
                int result = cancelSeat(seatName);

                if (result == 0) {
                    displaySeat(title);
                }
            } else if (menu == 3) {
                displaySeat(title);
            } else if (menu == 4) {
                System.out.println("항공사 예약 시스템을 종료하고 메인 메뉴로 돌아갑니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴 선택입니다. 다시 입력하세요(1~4).");
            }
        }
    }

    private void printMenu() {
        System.out.println("-------------------------");
        System.out.println("항공사 예약 시스템");
        System.out.println("1. 좌석 예약");
        System.out.println("2. 예약 취소");
        System.out.println("3. 예약 현황 조회");
        System.out.println("4. 메인 메뉴로 돌아가기");
        System.out.println("-------------------------");
        System.out.print("번호를 선택해주세요: ");
    }
}