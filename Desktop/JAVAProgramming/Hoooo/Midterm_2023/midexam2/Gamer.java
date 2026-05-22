package PreviousExam.Midterm_2023.midexam2;

// 학번: 2022111982
// 이름: 김경무

public class Gamer {
    private String name;
    private int d1, d2, sum;
    private int[] frequencies;

    public Gamer(String name) {
        this.name = name;
        this.frequencies = new int[13];
    }

    public void roll() {
        this.d1 = (int)(Math.random() * 6) + 1;
        this.d2 = (int)(Math.random() * 6) + 1;
        this.sum = d1 + d2;
        this.frequencies[sum]++;
    }

    public int getSum() {
        return sum;
    }

    public int[] getFrequencies() {
        return frequencies;
    }

    public String getName() {
        return name;
    }

    // 이름은 5글자(%5s), 숫자는 2칸(%2d)으로 맞춰서 출력 시 정렬 유지
    @Override
    public String toString() {
        // String.format이 불안하면 App에서 printf로 직접 찍어도 됩니다.
        return String.format("%5s (%d,%d):%2d", name, d1, d2, sum);
    }
}