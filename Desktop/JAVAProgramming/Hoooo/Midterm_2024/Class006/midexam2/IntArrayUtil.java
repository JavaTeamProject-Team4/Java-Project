package PreviousExam.Midterm_2024.Class006.midexam2;

public class IntArrayUtil {

    public void fill(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*99) + 1;
        }
        print(a);
    }

    public int[] concat(int[] a, int[] b){
        int lenA= a.length, lenB = b.length;
        int[] newArr = new int[lenA + lenB];
        for (int i = 0; i < lenA; i++) {
            newArr[i] = a[i];
        }
        for (int i = lenA; i < lenA + lenB; i++) {
            newArr[i] = b[i - lenA];
        }
        print(newArr);
        return newArr;
    }

    public int compare(int[] a, int[] b){
        int tempA = 0, tempB = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > tempA) tempA = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] > tempB) tempB = b[i];
        }

        System.out.printf("a의 최대값: %d, b의 최대값: %d", tempA, tempB);
        if (tempA == tempB) return 0;
        else if (tempA < tempB) return -1;
        else return 1;
    }

    public int[] slice(int[] a, int start, int end){
        int[] newArr = new int[end - start];
        for (int i = start; i < end; i++) {
            newArr[i - start] = a[i];
        }
        return newArr;
    }

    public void print(int[] a){
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1) System.out.print(a[i] + ", ");
            else System.out.println(a[i] + "]\n");
        }
    }
}
