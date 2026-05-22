package PreviousExam.Midterm_2022.Monday.midexam2;

public class YutPlayer implements PreviousExam.Midterm_2022.Monday.midexam2.YutInterface {
    private String name;
    private int totalScore;
    private int[] lastCast;
    private int lastScore;
    private int[] stats;
    private int throwCount;

    public YutPlayer(String name) {
        this.name = name;
        this.totalScore = 0;
        this.lastCast = new int[4];
        this.stats = new int[6];
        this.throwCount = 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public int castYut() {
        int zeroCount = 0;

        for (int i = 0; i < 4; i++) {
            lastCast[i] = (int)(Math.random() * 2);
            if (lastCast[i] == 0) {
                zeroCount++;
            }
        }

        if (zeroCount == 0) {
            lastScore = 5;
        } else {
            lastScore = zeroCount;
        }

        totalScore += lastScore;
        stats[lastScore]++;
        throwCount++;

        return lastScore;
    }

    @Override
    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(Object obj) {
        if (obj instanceof YutPlayer) {
            YutPlayer target = (YutPlayer) obj;
            if (this.totalScore > target.totalScore) return 1;
            else if (this.totalScore == target.totalScore) return 0;
            else return -1;
        }
        return -1;
    }

    @Override
    public void displayResult() {
        double rate1 = throwCount > 0 ? (stats[1] * 100.0) / throwCount : 0.0;
        double rate2 = throwCount > 0 ? (stats[2] * 100.0) / throwCount : 0.0;
        double rate3 = throwCount > 0 ? (stats[3] * 100.0) / throwCount : 0.0;
        double rate4 = throwCount > 0 ? (stats[4] * 100.0) / throwCount : 0.0;
        double rate5 = throwCount > 0 ? (stats[5] * 100.0) / throwCount : 0.0;

        System.out.printf("%s %7.1f%7.1f%7.1f%7.1f%7.1f\n",
                name, rate1, rate2, rate3, rate4, rate5);
    }

    @Override
    public String toString() {
        String yutStr = "";
        if (lastScore == 1) yutStr = "도";
        else if (lastScore == 2) yutStr = "개";
        else if (lastScore == 3) yutStr = "걸";
        else if (lastScore == 4) yutStr = "윷";
        else if (lastScore == 5) yutStr = "모";

        String tScoreStr = (totalScore < 10 ? " " : "") + totalScore;

        return name + " [" + lastCast[0] + " " + lastCast[1] + " " + lastCast[2] + " " + lastCast[3] + "] "
                + yutStr + " (" + lastScore + "점/총 " + tScoreStr + "점)";
    }
}