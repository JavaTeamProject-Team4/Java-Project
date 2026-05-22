package jokbo24.race;

//학번 : 2025005685
//이름 : 유다경

import java.util.Random;

public class Race {
 private int tortoisePos;
 private int harePos;
 private Random random;

 public Race() {
     tortoisePos = 1;
     harePos = 1;
     random = new Random();
 }

 public void printStart() {
     printTrack("T", tortoisePos, "");
     printTrack("H", harePos, "");
 }

 public void moveTortoise() {
     int n = random.nextInt(10) + 1;
     String action = "";

     if (n >= 1 && n <= 5) {
         tortoisePos += 3;
         action = "Fast Walk";
     } else if (n >= 6 && n <= 7) {
         tortoisePos -= 6;
         action = "Slip";
     } else {
         tortoisePos += 1;
         action = "Slow Walk";
     }

     if (tortoisePos < 1) {
         tortoisePos = 1;
     }

     printTrack("T", tortoisePos, action);
 }

 public void moveHare() {
     int n = random.nextInt(10) + 1;
     String action = "";

     if (n >= 1 && n <= 2) {
         action = "Sleep";
     } else if (n >= 3 && n <= 4) {
         harePos += 9;
         action = "Big Hop";
     } else if (n == 5) {
         harePos -= 12;
         action = "Big Slip";
     } else if (n >= 6 && n <= 8) {
         harePos += 1;
         action = "Small Hop";
     } else {
         harePos -= 2;
         action = "Small Slip";
     }

     if (harePos < 1) {
         harePos = 1;
     }

     printTrack("H", harePos, action);
 }

 private void printTrack(String who, int pos, String action) {
     int displayPos = pos;
     if (displayPos > 50) {
         displayPos = 50;
     }

     for (int i = 1; i < displayPos; i++) {
         System.out.print(" ");
     }

     if (action.equals("")) {
         System.out.println(who + "(" + displayPos + ")");
     } else {
         System.out.println(who + "(" + displayPos + ":" + action + ")");
     }
 }

 public boolean isFinished() {
     return tortoisePos >= 50 || harePos >= 50;
 }

 public void printResult() {
     int t = tortoisePos >= 50 ? 50 : tortoisePos;
     int h = harePos >= 50 ? 50 : harePos;

     if (tortoisePos >= 50 && harePos >= 50) {
         System.out.println("Draw!(Tortois: " + t + ", Hare: " + h + ")");
     } else if (tortoisePos >= 50) {
         System.out.println("Tortoise Wins!(Tortois: " + t + ", Hare: " + h + ")");
     } else {
         System.out.println("Hare Wins!(Tortois: " + t + ", Hare: " + h + ")");
     }
 }
}