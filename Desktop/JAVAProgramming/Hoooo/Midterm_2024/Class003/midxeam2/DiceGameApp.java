package PreviousExam.Midterm_2024.Class003.midxeam2;

// 학번: 2022111982
// 이름: 김경무
public class DiceGameApp {
    public static void main(String[] args) {
        Player alice = new Player("Alice");
        Player bob = new Player("Bob");

        System.out.println("-------------------------------------------------------\n             Rolling Dice Game Start\n-------------------------------------------------------");

        while (alice.getScore() < 50 && bob.getScore() < 50) {
            // Alice 차례
            while (alice.rollDice() == 1) {
                if (alice.getScore() >= 50) break;
            }
            if (alice.getScore() >= 50) break;

            // Bob 차례
            while (bob.rollDice() == 1) {
                if (bob.getScore() >= 50) break;
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.printf("%s: %d/ %s: %d: --> ",
                alice.getName(), alice.getScore(), bob.getName(), bob.getScore());

        if (alice.getScore() > bob.getScore()) System.out.println("Alice Win");
        else System.out.println("Bob Win");
        System.out.println("-------------------------------------------------------");
    }
}
