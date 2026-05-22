// 2022111982
// 김경무

package PreviousExam.Midterm_2025.midexam2;

import java.util.Scanner;

public class StringUtilApp {
    public static void main(String[] args) {
        String text =
                "Betty Botter bought some butter, but she said this butter's bitter.\n" +
                        "If I put it in my batter, it will make my batter bitter.\n" +
                        "So, she bought some better butter, better than the bitter butter,\n" +
                        "and she put it in her batter, and her batter was not bitter.\n";

        StringUtil util = new StringUtil(text);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Search a word and display all indexes");
            System.out.println("2. Replace a word one by one");
            System.out.println("0. Quit");
            System.out.print("Choose a number: ");

            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 0) {
                System.out.println("Quit Program");
                break;
            } else if (menu == 1) {
                System.out.print("Type a search word: ");
                String target = scanner.nextLine();
                util.searchAllIndexes(target);
            } else if (menu == 2) {
                System.out.print("Type two words (searchword, replacement): ");
                String input = scanner.nextLine();
                String[] words = input.split(" ");

                if (words.length == 2) {
                    util.replaceWordOneByOne(words[0], words[1]);
                } else {
                    System.out.println("입력 형식이 잘못되었습니다.");
                }
            } else {
                System.out.println("Wrong Menu. Type again!");
            }
        }

        scanner.close();
    }
}