package jokbo24.race;

//학번 : 2025005685
//이름 : 유다경

import java.util.Scanner;

public class RaceApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Race race = new Race();

     race.printStart();
     System.out.println("Type Enter to Start Race !!!");
     scanner.nextLine();

     while (!race.isFinished()) {
         System.out.println("----------------------------------------------------");
         race.moveTortoise();
         race.moveHare();
     }

     System.out.println("----------------------------------------------------");
     race.printResult();

     scanner.close();
 }
}