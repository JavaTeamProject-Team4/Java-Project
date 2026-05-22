// 2022111982
// 김경무

package PreviousExam.Midterm_2022.Monday.midexam2;

public class YutPlayApp {
    public static void main(String[] args) {
        YutPlayer p1 = new PreviousExam.Midterm_2022.Monday.midexam2.YutPlayer("흥부");
        PreviousExam.Midterm_2022.Monday.midexam2.YutPlayer p2 = new PreviousExam.Midterm_2022.Monday.midexam2.YutPlayer("놀부");

        while (p1.getTotalScore() < 20 && p2.getTotalScore() < 20) {
            while (true) {
                int score = p1.castYut();
                System.out.println(p1.toString() + " --->");

                if (p1.getTotalScore() >= 20) break;

                if (score < 4) break;
            }

            if (p1.getTotalScore() >= 20) break;
            while (true) {
                int score = p2.castYut();
                System.out.println("                                 <--- " + p2.toString());

                if (p2.getTotalScore() >= 20) break;
                if (score < 4) break;
            }
        }

        int cmp = p1.compareTo(p2);
        String winner;
        if (cmp > 0) {
            winner = p1.getName() + " 승리";
        } else if (cmp < 0) {
            winner = p2.getName() + " 승리";
        } else {
            winner = "무승부";
        }

        System.out.println("\n" + p1.getName() + ": " + p1.getTotalScore() + ", "
                + p2.getName() + ": " + p2.getTotalScore() + " ==> " + winner);

        System.out.println("-------------------------------------------------");
        System.out.println("        도      개      걸      윷      모   단위(%)");
        System.out.println("-------------------------------------------------");
        p1.displayResult();
        System.out.println("-------------------------------------------------");
        System.out.println("        도      개      걸      윷      모   단위(%)");
        System.out.println("-------------------------------------------------");
        p2.displayResult();
        System.out.println("-------------------------------------------------");
    }
}
