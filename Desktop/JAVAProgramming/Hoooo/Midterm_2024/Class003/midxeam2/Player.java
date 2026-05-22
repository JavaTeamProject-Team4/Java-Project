package PreviousExam.Midterm_2024.Class003.midxeam2;

// 학번: 2022111982
// 이름: 김경무

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public int rollDice() {
        int d1 = (int)(Math.random() * 6) + 1;
        int d2 = (int)(Math.random() * 6) + 1;
        int sum = d1 + d2;
        String message = "";
        int resultFlag = 0; // 1이면 다시 던지기

        if (d1 == d2) {
            if (d1 % 2 != 0) { // 홀수 쌍: Roll Again
                score += sum;
                message = "Roll Again!";
                resultFlag = 1;
            } else { // 짝수 쌍: OOPS (감점)
                score -= sum;
                if (score < 0) score = 0;
                message = "OOPS!";
                resultFlag = 0;
            }
        } else {
            score += sum;
            resultFlag = 0;
        }

        // ⭐ 출력 정렬 로직
        // Bob이면 40칸을 띄우고 출력, Alice면 그대로 출력
        if (name.equals("Bob")) {
            System.out.print("                              ");
        }

        System.out.printf("[%s] (%d, %d)= %2d %s\n", name, d1, d2, score, message);

        return resultFlag;
    }

    public int getScore() { return score; }
    public String getName() { return name; }
}