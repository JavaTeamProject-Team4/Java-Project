package jokbo24.dice;

//학번 : 2025005685
//이름 : 유다경

public class DiceGameApp {

 public static void main(String[] args) {
     Player alice = new Player("Alice");
     Player bob = new Player("Bob");

     System.out.println("-------------------------------------------------------");
     System.out.println("                    Rolling Dice Game Start            ");
     System.out.println("-------------------------------------------------------");

     while (true) {
         playTurn(alice);

         if (alice.getScore() >= 50) {
             break;
         }

         playTurn(bob);

         if (bob.getScore() >= 50) {
             break;
         }
     }

     System.out.println("-------------------------------------------------------");

     if (alice.getScore() > bob.getScore()) {
         System.out.println("Alice: " + alice.getScore() + " / Bob: " + bob.getScore() + ": --> Alice Win");
     } else if (alice.getScore() < bob.getScore()) {
         System.out.println("Alice: " + alice.getScore() + " / Bob: " + bob.getScore() + ": --> Bob Win");
     } else {
         System.out.println("Alice: " + alice.getScore() + " / Bob: " + bob.getScore() + ": --> Draw");
     }

     System.out.println("-------------------------------------------------------");
 }

 public static void playTurn(Player player) {
     while (true) {
         int dice1 = (int)(Math.random() * 6) + 1;
         int dice2 = (int)(Math.random() * 6) + 1;
         int sum = dice1 + dice2;

         if (dice1 == dice2 && (dice1 == 1 || dice1 == 3 || dice1 == 5)) {
             player.addScore(sum);
             System.out.println("[" + player.getName() + "] (" + dice1 + ", " + dice2 + ")= " + player.getScore() + " Roll Again!");

             if (player.getScore() >= 50) {
                 return;
             }
         }
         else if (dice1 == dice2 && (dice1 == 2 || dice1 == 4 || dice1 == 6)) {
             player.subtractScore(sum);
             System.out.println("[" + player.getName() + "] (" + dice1 + ", " + dice2 + ")= " + player.getScore() + " OOPS!");
             return;
         }
         else {
             player.addScore(sum);
             System.out.println("[" + player.getName() + "] (" + dice1 + ", " + dice2 + ")= " + player.getScore());
             return;
         }
     }
 }
}