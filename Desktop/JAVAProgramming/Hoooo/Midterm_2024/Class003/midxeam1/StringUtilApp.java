package PreviousExam.Midterm_2024.Class003.midxeam1;

// 학번: 2022111982
// 이름: 김경무
import java.util.Scanner;
import java.util.InputMismatchException;

public class StringUtilApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringUtil util = new StringUtil();
        String text = "Java was originally developed by James Gosling at Sun Microsystems." +
                "It was released in May 1995 as a core component of Sun's Java platform." +
                "Sun had relicensed most of its Java technologies under the GPL-2.0-only license.";

        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("1. Search a word\n2. Replace a word\n3. Slice a String\n0. Quit");
            System.out.println("----------------------------------------");
            System.out.print("Choose a number: ");
            int menu = -1;
            try {
                menu = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                scanner.nextLine();
                continue;
            }

            if (menu == 0) {
                System.out.println("Quit Program");
                break;
            }

            switch (menu) {
                case 1:
                    System.out.print("Type a search word: ");
                    String sWord = scanner.nextLine();
                    int count = util.getWordCount(text, sWord);
                    System.out.println("\n" + sWord + " found: " + count + " times");
                    break;
                case 2:
                    System.out.print("Type two words (searchword replacement): ");
                    String target = scanner.next();
                    String replacement = scanner.next();
                    String replacedText = util.replaceWord(text, target, replacement);
                    if (!replacedText.equals("")) System.out.println(replacedText);
                    break;
                case 3:
                    // ⭐ 인덱스 범위 체크 로직 강화
                    System.out.print("Type a range(start ~ end): ");
                    try {
                        int start = scanner.nextInt();
                        int end = scanner.nextInt();
                        int len = text.length();

                        // 요구사항: 범위를 벗어나면 "Index is out of range!" 출력 후 다시 메뉴로
                        if (start < 0 || end > len || start >= end) {
                            System.out.printf("start: %d, end: %d, len: %d\n", start, end, len);
                            System.out.println("Index is out of range!");
                        } else {
                            System.out.printf("start: %d, end: %d, len: %d\n", start, end, len);
                            // StringUtil에서 substring 안 쓰고 만든 sliceString 호출
                            System.out.println("Sliced String: " + util.sliceString(text, start, end));
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("숫자 인덱스를 입력해야 합니다.");
                        scanner.nextLine();
                    }
                    break;
                default:
                    System.out.println("0~3 사이의 숫자를 입력하세요.");
            }
        }
        scanner.close();
    }
}