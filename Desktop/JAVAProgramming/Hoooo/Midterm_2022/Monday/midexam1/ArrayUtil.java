package PreviousExam.Midterm_2022.Monday.midexam1;

public class ArrayUtil {

    public void fill(int[] a){
        for (int i = 0; i < 10; i++) {
            a[i] = (int)(Math.random() * 99) + 1;
        }
    }

    public int[] concat(int[] a, int[] b){
        int[] c =  new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        return c;
    }

    public int compare(int[] a, int[] b){
        int maxA = 0, maxB = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxA) maxA = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] > maxB) maxB = b[i];
        }
        System.out.printf("a의 최대값:%3d, b의 최대값:%3d\n", maxA, maxB);
        if (maxA == maxB) return 0;
        else if  (maxA < maxB) return -1;
        else return 1;
    }

    void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            if (i==0) System.out.printf("%3d", i);
            else System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i == 0) System.out.printf("[%2d, ", a[i]);
            else if (i==a.length-1) System.out.printf("%2d]", a[i]);
            else System.out.printf("%2d, ", a[i]);
        }
        System.out.println("\n");
    }
}
