package PreviousExam.Midterm_2021.Midexam2;

import java.util.HashMap;

// 2026-1 Midterm 기준 HashMap 안배움
public class RollingDice {
    private HashMap<Integer, Integer> map;
    private int[][] matrix;  // 2차원 배열 (행렬 형태)
    private int[] sumCount;  // 주사위 합 빈도
    private int totalRolls;  // 누적 반복 횟수

    public RollingDice() {
        map = new HashMap<>();
        matrix = new int[7][7]; // 인덱스 1~6을 사용하기 위해 크기 7 할당
        sumCount = new int[13]; // 합은 2~12이므로 크기 13 할당
        totalRolls = 0;
    }

    public int getMapTotalSum() {
        int mapSum = 0;
        for (int count : map.values()) {
            mapSum += count;
        }
        return mapSum;
    }

    // 1번: 주사위 던지기
    public void rollDice(int count) {
        totalRolls += count;

        for (int i = 0; i < count; i++) {
            int d1 = (int)(Math.random() * 6) + 1;
            int d2 = (int)(Math.random() * 6) + 1;
            int sum = d1 + d2;

            // 2차원 배열에 (주사위1, 주사위2) 조합 빈도 누적
            matrix[d1][d2]++;
            sumCount[sum]++;

            // HashMap 빈도수 누적
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }

            // 주사위 던진 결과 출력
            System.out.printf("(%d+%d)=%d", d1, d2, sum);
            if (i < count - 1) {
                System.out.print(", ");
            }
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        if (count % 5 != 0) {
            System.out.println();
        }

        // 주사위를 다 던진 후 결과 표 출력
        printStats();
    }

    // 2번: 통계치 초기화
    public void clearStats() {
        System.out.println("\nClear HashMap's data and Matrix");

        map.clear();
        matrix = new int[7][7];
        sumCount = new int[13];
        totalRolls = 0;

        // 초기화된 0 상태의 표 출력
        printStats();
    }

    // 화면에 통계 표를 그려주는 내부 메서드
    private void printStats() {
        System.out.println("\n[주사위 숫자별 빈도수]");
        System.out.println("  1 2 3 4 5 6"); // 열 헤더

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + " "); // 행 헤더
            for (int j = 1; j <= 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("총 누적 반복 회수 : " + totalRolls);
        System.out.println("-------------------");

        System.out.println("\n[주사위 합의 빈도수]");
        for (int i = 2; i <= 12; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 2; i <= 12; i++) {
            System.out.print(sumCount[i] + "\t");
        }
        System.out.println();

        System.out.println("\n[HashMap(합, 빈도수) 출력]");
        // ⭐ 지적해주신 부분 완벽 수정: 2~12까지 카운트가 0이어도 무조건 출력하게 변경!
        for (int i = 2; i <= 12; i++) {
            int count = 0;
            if (map.containsKey(i)) {
                count = map.get(i);
            }
            System.out.print("합(" + i + "):" + count + "\t");
        }
        System.out.println();
    }
}