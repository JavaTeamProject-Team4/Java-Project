// 2022111982
// 김경무
package PreviousExam.Midterm_2024.Class006.midexam1;

import java.util.Scanner;

public class RaceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Race race = new Race();
        System.out.println("T(1)\nH(1)");
        System.out.println("Type Enter to Start Race !!!");
        System.out.println("----------------------------------------------------");
        sc.nextLine();
        race.move();

        sc.close();
    }
}