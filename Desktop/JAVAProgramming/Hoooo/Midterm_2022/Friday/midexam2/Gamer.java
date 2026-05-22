package PreviousExam.Midterm_2022.Friday.midexam2;

// 2022111982
// 김경무

public class Gamer implements RollingDiceInterface {
    private String name;
    private int maxNumber;
    private int[] faceNumbers;

    public Gamer(String name, int maxNumber) {
        this.name = name;
        this.maxNumber = maxNumber;
        this.faceNumbers = new int[2];
    }

    @Override
    public void roll() {
        faceNumbers[0] = (int)(Math.random() * maxNumber) + 1;
        faceNumbers[1] = (int)(Math.random() * maxNumber) + 1;
    }

    @Override
    public int[] getFaceNumbers() {
        return faceNumbers;
    }

    @Override
    public int getDiceSum() {
        return faceNumbers[0] + faceNumbers[1];
    }

    @Override
    public int compareTo(Object obj) {
        // [감점 방지] Downcasting 필수 사용
        if (obj instanceof Gamer) {
            Gamer target = (Gamer) obj;
            if (this.getDiceSum() > target.getDiceSum()) return 1;
            else if (this.getDiceSum() == target.getDiceSum()) return 0;
            else return -1;
        }
        return -1;
    }

    @Override
    public String toString() {
        // %2d를 써서 숫자가 1자리든 2자리든 칸을 똑같이 맞춤
        return String.format("%s(%2d, %2d) = %2d", name, faceNumbers[0], faceNumbers[1], getDiceSum());
    }
}