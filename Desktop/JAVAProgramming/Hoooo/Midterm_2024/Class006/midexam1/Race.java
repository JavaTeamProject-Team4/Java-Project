package PreviousExam.Midterm_2024.Class006.midexam1;

public class Race {
    int tortoisePos = 1;
    int harePos = 1;
    final int finish = 50;

    void move(){
        String tortoiseCondition = "";
        String hareCondition = "";
        while (tortoisePos < 50 && harePos < 50){
            int tortoiseRandom = (int) (Math.random() * 10) + 1;
            int hareRandom = (int) (Math.random() * 10) + 1;

            if (tortoiseRandom <= 5){
                tortoisePos = tortoisePos + 3;
                tortoiseCondition = "Fast Walk";
            }
            else if (tortoiseRandom <= 7){
                if (tortoisePos > 6) tortoisePos = tortoisePos - 6;
                else tortoisePos = 1;
                tortoiseCondition = "Slip";
            }
            else{
                tortoisePos = tortoisePos + 1;
                tortoiseCondition = "Slow Walk";
            }

            if (tortoisePos > 50) tortoisePos = 50;
            String tortoiseSpace = "";
            for (int i = 0; i < tortoisePos; i++) {
                tortoiseSpace += " ";
            }
            System.out.printf("%s", tortoiseSpace);
            System.out.printf("T(%d:%s)\n", tortoisePos, tortoiseCondition);

            if (hareRandom <= 2){
                hareCondition = "Sleep";
            }
            else if (hareRandom <= 4){
                harePos = harePos + 9;
                hareCondition = "Big Hop";
            }
            else if (hareRandom == 5){
                if (harePos > 12) harePos = harePos - 12;
                else harePos = 1;
                hareCondition = "Big Slip";
            }
            else if (hareRandom <= 8){
                harePos = harePos + 1;
                hareCondition = "Small Hop";
            }
            else{
                if (harePos > 2) harePos = harePos - 2;
                else harePos = 1;
                hareCondition = "Small Slip";
            }

            if (harePos > 50) harePos = 50;
            String hareSpace = "";
            for (int i = 0; i < harePos; i++) {
                hareSpace += " ";
            }
            System.out.printf("%s", hareSpace);
            System.out.printf("H(%d:%s)\n", harePos, hareCondition);

            if (tortoisePos == 50 || harePos == 50) {
                if (tortoisePos == 50) {
                    System.out.printf("Tortoise Wins!(Tortoise: %d, Hare: %d)\n", tortoisePos, harePos);
                } else {
                    System.out.printf("Hare Wins!(Tortoise: %d, Hare: %d)\n", tortoisePos, harePos);
                }
                break;
            } else {
                System.out.println("----------------------------------------------------");
            }
        }
    }
}